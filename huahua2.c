#include <stdio.h>
#include <string.h>

int main(){


    char entrada[200];
    char entradaVogais[200]="";
    char vogaisInversa[200]="";
    scanf(" %s", entrada);

    int tam= strlen(entrada);
    int contador=0;
    for (int i=0;i<tam;i++){

        if (entrada[i]=='a' || entrada[i]=='e' ||entrada[i]=='i' || entrada[i]=='o' || entrada[i]=='u'){

            entradaVogais[contador++]= entrada[i];
        }
    }

    int tamVog= strlen(entradaVogais);
    int cont2=0;
    for (int i=tamVog-1; i>=0; i--){

        vogaisInversa[cont2++]= entradaVogais[i];

    }

    printf ("%s\n", vogaisInversa);
    printf ("%s\n", entradaVogais);

    if (strcmp(vogaisInversa, entradaVogais)==0){

        printf ("s");
    } else{
        printf ("n");
    }

    return 0;
}