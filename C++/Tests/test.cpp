#include <iostream>
#include <vector>
using namespace std;

void out (vector<int> a){
    for(int i = 0; i < a.size(); i++){
        cout << a[i] << endl;
    }
}

void in(vector<int> &a, int n){
    int x;
    for(int i = 0; i < n; i++){
        cout << i + 1 << ": ";
        cin >> x;
        a.push_back(x);
    }
}

int main(){

    vector<int> epic;
    int x;

    in(epic, 4);

    cout << "After: " << endl;
    out(epic);

}