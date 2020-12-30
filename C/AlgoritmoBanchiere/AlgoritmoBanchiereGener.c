#include <stdio.h>

//righe colonne

void assignRes(int nProc, int assignedRes[][100]){
    for(int i = 0; i < nProc; i++){
        for(int j = 0; j < 3; j++){
            printf("%s\n", "Risorsa numero %d del processo numero %d = ", j + 1, i + 1);
            scanf("%d\n", &assignedRes[j][i]);
        }
    }
}

void maxResources(int nProc, int maxRes[][100]){
    for(int i = 0; i < nProc; i++){
        for(int j = 0; j < 3; i++){
            printf("%s\n", "Risorsa MAX numero %d del processo numero %d = ", j + 1, i + 1);
            scanf("%d\n", &maxRes[j][i]);
        }
    }
}

int main() {

    int nProc = 0;

    printf("%s\n", "Inserire il numero di processi: ");
    scanf("%d\n", &nProc);

    int assignedRes[3][100];
    int neededRes[3][100];
    int availableRes[3][100];
    int maxRes[3][100];
    int safeStatus[100];

    assignRes(nProc, assignedRes);
    maxResources(nProc, maxRes);
}
