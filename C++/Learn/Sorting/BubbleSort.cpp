#include <iostream>
using namespace std;

int main(){
    int a[6] = {5, 4, 7, 1, 9, 3};

    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 6 ; j++){
            if(a[i] < a[j]){
                int temp = a[i];
                int temp1 = a[j];
                a[i] = temp1;
                a[j] = temp;
            }
        }
    }

    for(int i = 0; i < 6; i++)
        cout << a[i] << endl;
}