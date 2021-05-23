#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

void info(int padre, int mio){
    printf("PID: %d\nPID_PADRE: %d\n\n", mio, padre);
}

int main(){
    int pid_fake, i;
    
    pid_fake = 1;
    for(int i = 0; i < 2; i++){
        if(pid_fake > 0){
            pid_fake = fork();
        }
    }
    if(pid_fake == 0){
        printf("Sono uno dei tanti figli\n", i + 1);
        info(getppid(), getpid());
        exit(102);
    }
    else if (pid_fake > 0) {
        for (int i = 0; i < 2; i++)
            wait();
        printf("Sono il padre\n");
        info(getppid(), getpid());
    }

}