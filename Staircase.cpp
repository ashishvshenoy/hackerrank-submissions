#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int height;
    cin>>height;
    int temp=0;
    while(temp<=height-1){
        int i;
        for(i=0;i<height-temp-1;i++){
            cout<<" ";
        }
        for(;i<height;i++){
            cout<<"#";
        }
        cout<<endl;
        temp++;
    }
    return 0;
}
