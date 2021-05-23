#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

void info(int padre, int mio){
    printf("PID: %d\nPID_PADRE: %d\n\n", mio, padre);
}


int main(){
    int pid, pid_status, pid_homo, pid_fake;

    pid = fork();
    
    if(pid > 0){
        //padre P1
        pid_homo = wait(&pid_status);
        printf("Sono P1\n");
        info(getppid(), getpid());
        printf("E' morto il figlio f1 con valore di ritorno: %d\nE Pid: %d\n", pid_status/256, pid_homo);
    
        pid = fork();
        wait();

        if(pid == 0){
            printf("Sono F2\n");
            info(getppid(), getpid());

            pid_fake = 1;
            for(int i = 0; i < 2; i++){
                if(pid_fake > 0){
                    pid_fake = fork();
                    wait();
                    if(pid_fake == 0){
                        printf("Sono C%d\n", i + 1);
                        info(getppid(), getpid());
                        exit(231);
                    }
                }
            }
            exit(1023);
        }
    }
    else if(pid == 0){
        //Figlio F1
        printf("Sono il figlio F1\n");
        info(getppid(), getpid());

        pid = fork();
        wait();

        if(pid == 0){
            printf("Sono C3\n");
            info(getppid(), getpid());
            exit(21212);
        }

        exit(10);
    }
    else{
        printf("Sono homo\n");
    }

}