#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int main(){
    int pid = 1;
    int status, pid_term;

    int n;

    printf("Inserire il numero di processi che si vogliono creare: ");
    scanf("%d", &n);

    for(int i = 0; i < n; i++){
        if(pid > 0){
            pid = fork();
        }
    }

    if(pid > 0){
        sleep(2);
        printf("\n-----PARTE PADRE-----\nPid: %d\n", getpid());
        
        pid_term = wait(&status);
        printf("Pid primo figlio terminato: %d\nCon valore: %d\n", pid_term, status/256);

        for(int q = 0; q < n - 1; q++){
            pid_term = wait(&status);
        }

        printf("Pid ultimo processo terminato: %d\n", pid_term);

    }

    if(pid == 0){
        printf("\n\n-Parte figlio-\nPid: %d\npid padre: %d\n", getpid(), getppid());
        exit(58);
    }

    else if(pid < 0){
        printf("Il processo non è stato creato correttamente\n");
    }
    
}