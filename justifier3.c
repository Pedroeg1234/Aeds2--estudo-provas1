#include <stdio.h>
#include <string.h>


int main(){

    int tam;
    scanf("%d", &tam);
    
    char vetorPalavras[tam][300];

    int maior=0;
    for (int i=0;i<tam;i++){

        scanf ("%s", vetorPalavras[i]);

    }

    for (int i=0;i<strlen(vetorPalavras);i++){

        if (strlen(vetorPalavras) > maior){

            maior= strlen(vetorPalavras);
        }
    }
    

    for (int i=0;i<strlen(vetorPalavras);i++){

        char fraseResultante[200]= "";
        int contador=0;
        for (int j=0; j< maior - strlen(vetorPalavras[i]);j++){

            fraseResultante[contador++]= "";
        }

        strcpy(fraseResultante, vetorPalavras[i]);

        printf ("%s", fraseResultante);
    }



    return 0;
}