#include <stdio.h>


int main(){

    for (int i=0;i<3;i++){

        char palavra1[100];
        char palavra2[100];
        int diferenca=0;
        scanf ("%s %s" , palavra1, palavra2);

        for (int j=0;j<strlen(palavra1); j++){

            int diff= palavra2 - palavra1;
            diferenca+=diff;
            if (diff<0){

                diferenca+=26;
            }
        }

        printf ("%d", diferenca);
    }

    return 0;
}