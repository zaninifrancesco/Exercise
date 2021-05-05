#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>




int main(){
    
    int pid, pid1;
    int a, b, c, res;

    pid = fork();

    if(pid > 0){
        a = 6 / 2;

        wait(&b);
        b /= 256;

        pid1 = fork();

        wait(&c);
        c /= 256;


        if(pid1 == 0){
            c = 2 + 3;
            exit(c);
        }

        res = a + b + c;
        printf("A: %d\nB: %d\nC: %d\nRES: %d\n", a, b, c, res);

    } else if(pid == 0){
        b = 3 * 4;
        exit(b);
    }


    return 0;
}