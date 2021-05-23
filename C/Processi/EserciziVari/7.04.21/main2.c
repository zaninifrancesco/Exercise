#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>


void info(int mio_pid, int pid_padre){
    printf("\nPID: %d\nPID_PADRE: %d\n\n", mio_pid, pid_padre);
}


int main(){

    int pid, pid_status = 0;

    pid = fork();

    if(pid > 0){
        //Padre
        printf("Sono il padre");
        info(getpid(), getppid());

        pid = fork();

        wait();

        if(pid == 0){
            printf("Sono il figlio f2");
            info(getpid(), getppid());

            pid = fork();

            wait();

            if(pid == 0){
                printf("Sono il figlio c1");
                info(getpid(), getppid());
                exit(102);
            }

            exit(69);
        }

        wait();

    }
    else if(pid == 0){
        //Figlio
        printf("Sono il figlio f1");
        info(getpid(), getppid());
        exit(10);

    }

}