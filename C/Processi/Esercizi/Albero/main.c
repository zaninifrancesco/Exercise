#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>


int main(){

    int pid, status;
    
    pid = fork();

    if(pid > 0){
        printf("\n\n-----PROCESSO PADRE P1-----\n");
        printf("Sono il padre P1 con pid: %d\n", getpid());
        
        wait(&status);

        printf("E' morto mio figlio F1 con valore di ritorno: %d\n", status/256);
        
        pid = fork();

        wait(&status);

        //F2
        if(pid == 0){
            printf("\n\n---PROCESSO F2---\n");
            printf("Sono il secondo figlio F2 con pid: %d il pid di mio padre e' %d\n", getpid(), getppid());

            pid = fork();

            wait(&status);

            if(pid == 0){
                printf("\n\n---PROCESSO N22---\n");
                printf("Sono il processo N22 con pid: %d il pid di mio padre e': %d\n", getpid(), getppid());
                exit(22);
            }

            printf("E' morto mio figlio N22 con valore di ritorno: %d\n", status/256);

            if(pid > 0){

                pid = fork();

                wait(&status);

                if(pid == 0){
                    printf("\n\n---PROCESSO N21---\n");
                    printf("Sono il processo N21 con pid: %d il pid di mio padre e': %d\n", getpid(), getppid());
                    exit(21);
                }

                printf("E' morto mio figlio N21 con valore di ritorno: %d\n", status/256);
            }

            exit(2);
        }

        printf("E' morto mio figlio F2 con valore di ritorno: %d\n", status/256);

    }
    else if(pid == 0){
        printf("\n\n---PROCESSO F1---\n");
        printf("Sono il figlio F1 con pid: %d e il pid di mio padre e': %d\n", getpid(), getppid());
              
        pid = fork();

        wait(&status);


        //n11
        if(pid == 0){
            printf("\n\n---PROCESSO N21---\n");
            printf("Sono il processo N11 con pid: %d e il pid di mio padre F1 e': %d\n", getpid(), getppid());
            exit(11);
        }

        printf("E' morto mio figlio N11 con valore di ritorno %d\n", status/256); 

        exit(1);
    }


    


}