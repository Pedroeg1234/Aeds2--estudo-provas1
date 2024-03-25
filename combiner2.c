#include <stdio.h>
#include <string.h>

int main(){

    int n;

    scanf ("%d", &n);

    char entrada1[200];
    char entrada2[200];
    char combinador[200];

    for (int z=0;z<n;z++){
    scanf ("%s %s", entrada1, entrada2);

    int tam= strlen(entrada1) + strlen(entrada2);

    int contador=0;
    for (int i=0;i<tam;i++){

        combinador[contador++]= entrada1[i];
        combinador[contador++]= entrada2[i];

        
    }
        combinador[contador] = '\0'; 
        printf ("%s", combinador);
    }
    return 0;
}