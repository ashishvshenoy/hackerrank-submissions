#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n,i,k=0,count=0;
    scanf("%d",&n);
    if(n==0||n<0){
        printf("0");
        return 0;
    }
    char **str;
    char *temp;
    str = malloc((sizeof(char *))*n);
    for(i=0;i<n;i++){
        str[i] = malloc(101*sizeof(char));
        scanf("%s",str[i]);
    }
    int arr[256];
    for(i=0;i<256;i++){
        arr[i]=-1;
    }
    while(k<n){
        for(i=0;i<strlen(str[k]);i++){
            if(arr[str[k][i]]==k-1)
                arr[str[k][i]]=k;
        }
        k++;
    }
    for(i=0;i<256;i++){
        if(arr[i]==n-1){
            count++;
        }
    }
    printf("%d",count);
    free(str);
    return 0;
}