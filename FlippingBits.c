#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdint.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    uint32_t n;
    int testCases;
    int i;
    scanf("%d",&testCases);
    for(i=0;i<testCases;i++){
        scanf("%u",&n);
        n = ~n;
        printf("%u\n",n);
    }
    return 0;
}
