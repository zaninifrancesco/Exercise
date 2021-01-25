#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(){
	int romolo = fork();
	int remo;

	if(romolo > 0){
		printf("Ciao sono Marte, il mio pid e' %d\n\n", getpid());
		remo = fork();
	}

	if(romolo == 0){
		printf("Sono romolo il mio pid e': %d\nIl pid di mio padre e': %d\n\n", getpid(), getppid());

	}

	if(remo == 0){
		printf("Ciao sono remo il mio pid e': %d\nIl pid di mio padre e': %d\n\n", getpid(), getppid());
	}


}
