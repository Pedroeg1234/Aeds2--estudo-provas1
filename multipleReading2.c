#include <stdio.h>

int main(){

    //LEITURA=R ESCRITA= W.

    char entrada[200];
    scanf ("%s", entrada);

    int quantidadeLeituraClock;
    scanf ("%d", &quantidadeLeituraClock);
    int quantidadeLeitura=0;
    int resp=0;

    for (int i=0 ; i<strlen(entrada);i++){

        if (entrada[i]=='W'){

            resp++;
        }

        if (entrada[i]=='R'){

            quantidadeLeitura++;
        }
    }

    int antesResp= quantidadeLeitura/quantidadeLeituraClock;

    resp+= antesResp;

    if (quantidadeLeitura % quantidadeLeituraClock!=0){

        resp+=1;
    }

    printf ("%d", resp);


    return 0;
}