#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main(){
    
    int pid, status;
    
    pid = fork();

    if(pid > 0){
        
        sleep(1);
        printf("\n----Sono il padre di tutti (P1) il mio pid e': %d----\n\n", getpid());

        pid = fork();

        if(pid == 0){

            wait(&status);

            printf("\nSono il figlio F2\nIl mio pid e': %d\nIl pid di mio padre e': %d\n\n", getpid(), getppid());

            pid = fork();

            if(pid == 0){
                printf("Sono il figlio N22\nIl mio pid e': %d\nIl pid di mio padre (F2) e': %d\n\n", getpid(), getppid());
                
            }

            else if(pid > 0){
                
                pid = fork();
                if(pid == 0){
                    printf("Sono il processo N21\nIl mio pid e': %d\nIl pid di mio padre (F2) e': %d\n\n", getpid(), getppid());
                    exit(10);
                }
            }
        }
    }

    else if (pid == 0){

        printf("\nSono il figlio F1\nIl mio pid e': %d\nIl pid di mio padre e': %d\n\n", getpid(), getppid());
        
        sleep(1);

        pid = fork();

        wait(&status);
        

        if(pid == 0){
            printf("Sono il figlio n11 il mio pid e': %d\nIl pid di mio padre (F1) e': %d\n\n", getpid(), getppid());
            exit(11);
        }

    }

}