#include <stdio.h>
#include <string.h>
#include <ctype.h>


int main(){

    int n;
    scanf ("%d", &n);

    char entrada[200];
    for (int i=0;i<n;i++){


    scanf (" %[^\n]", entrada);


    int maiuscula=1;
    for (int i=0;i<strlen(entrada);i++){

        char caractereAtual= entrada[i];

        if (isalpha(caractereAtual)){
        if (maiuscula==1){

            entrada[i]= toupper(caractereAtual);
            maiuscula=0;
        } else{

            entrada[i]= tolower(caractereAtual);
            maiuscula=1;
        }

    }
    }
    printf ("%s", entrada);
    }
    return 0;
}