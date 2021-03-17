#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


void out (vector<int> a){
    /*
    for(int i = 0; i < a.size(); i++){
        cout << i << ": " << a[i] << endl;
    }
    */

    for(int x: a){
        cout << x << endl;
    }

    cout << "Size: " << a.size() << endl;

    cout << endl;

}


void in (vector<int> &a){

    int input;
    cin >> input;

    a.push_back(input);

}


int main(){

    vector<int> items = {5, 10, 20, 4, 2, 1};
    cout << "Before" << endl;

    out(items);

    //items.pop_back(); //Removes the last elements from the back

    items.erase(items.cbegin() + 1, items.cend()); //Remove elements from the index = 1 to the end

    cout << "After" << endl;

    out(items);

    return 0;

}
