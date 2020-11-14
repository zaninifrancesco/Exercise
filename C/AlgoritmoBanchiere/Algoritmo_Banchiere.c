#include <stdio.h>

// righe colonne

void assignRes(int ass[4][3]){
  ass[0][0] = 0;
  ass[0][1] = 1;
  ass[0][2] = 4;

  ass[1][0] = 2;
  ass[1][1] = 0;
  ass[1][2] = 1;

  ass[2][0] = 1;
  ass[2][1] = 2;
  ass[2][2] = 1;

  ass[3][0] = 1;
  ass[3][1] = 0;
  ass[3][2] = 3;
}


void maxRes(int max[4][3]){
  max[0][0] = 4;
  max[0][1] = 1;
  max[0][2] = 4;

  max[1][0] = 3;
  max[1][1] = 1;
  max[1][2] = 4;

  max[2][0] = 5;
  max[2][1] = 7;
  max[2][2] = 13;

  max[3][0] = 1;
  max[3][1] = 1;
  max[3][2] = 6;
}

void findNeeded(int needed[4][3], int max[4][3], int ass[4][3]){
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
            needed[i][j] = max[i][j] - ass[i][j];
        }
    }
}

void safeStatus(int needed[4][3], int ass[4][3], int available[3]){
    for(int i = 0; i < 4; i++){
        if((available[0] >= needed[i][0]) && (available[1] >= needed[i][1]) && (available[2] >= needed[i][2])){
            available[0] += needed[i][0];
            needed[i][0] = 0;
            available[1] += needed[i][1];
            needed[i][1] = 0;
            available[2] += needed[i][2];
            needed[i][2] = 0;
            printf("p:%d\n\n", i + 1);

        }
    }
}


int main(){

    int available[3];
    int max[4][3];
    int assigned[4][3];
    int needed[4][3];

    available[0] = 5;
    available[1] = 8;
    available[2] = 16;

    assignRes(assigned);
    maxRes(max);
    findNeeded(needed, max, assigned);
    safeStatus(needed, assigned, available);

}
