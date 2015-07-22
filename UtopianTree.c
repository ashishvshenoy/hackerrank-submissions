#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int t;
    int flag = -1;
    int height = 1;
    scanf("%d",&t);
    int arr[t],i,cycles;
    for(i=0;i<t;i++){
        scanf("%d",&arr[i]);
    }
    for(i=0;i<t;i++){
        cycles = arr[i];
        if(cycles==0){
            printf("1\n");
            continue;
        }
        while(cycles>0) {
            if(flag==-1){
                height*=2;
            } else {
                height+=1;
            }
            flag*=-1;
            cycles-=1;
        }
        printf("%d\n",height);
        height = 1;
        flag = -1;
    }
    return 0;
}
