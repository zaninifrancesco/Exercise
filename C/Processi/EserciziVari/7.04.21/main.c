#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>


int main(){

    int pid, status, pid_t;

    pid = fork();

    if(pid > 0){

        printf("\n-----PROCESSO PADRE-----\n");
        printf("Sono il padre con pid: %d\n\n", getpid());

        pid_t = wait(&status);

        printf("\nE' terminato il figlio con valore %d e pid: %d\n\n", status/256, pid_t);

        pid = fork();

        pid_t = wait(&status);


        if(pid == 0){

            printf("Sono il secondo figlio (Mio pid: %d) del padre (pid padre: %d)\n", getpid(), getppid());

            pid = fork();
            
            pid_t = wait(&status);

            if(pid == 0){
                printf("Sono il figlio del figlio il mio pid e': %d, il pid di mio padre e': %d\n", getpid(), getppid());
                exit(69);
            }

            printf("\nE' terminato il figlio con valore %d e pid: %d\n", status/256, pid_t);

            exit(1);
        }

        printf("\nE' terminato il figlio valore %d e pid: %d\n", status/256, pid_t);


        

    }
    else if(pid == 0){
        printf("Sono il primo figlio (Mio pid: %d) del padre (pid padre: %d)\n", getpid(), getppid());
        exit(10);
    }

}