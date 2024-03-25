#include <stdio.h>
#include <string.h>

int main(){

    int n;

    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        char entrada[200];
        char cabe[100];
        int contador=0;
        scanf ("%s %s", entrada, cabe);
    int VF=1;
        int tamEntrada= strlen(entrada);
        int tamcabe= strlen(cabe);

        for (int i=tamEntrada- tamcabe; i<tamEntrada; i++){

            if (entrada[i] != cabe[contador++]){

                VF=0;
                break;

            }
        }

        if (VF==1){
            printf ("Sim");
        } else{
            printf ("Não");
        }
    }
    return 0;
}