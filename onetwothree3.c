#include <stdio.h>
#include <string.h>

int main(){

    char entradas[3][100]= {"one", "two", "three"};

    int n;
    scanf ("%d", &n);

    for (int i=0;i<n;i++){

        char entrada[400];

        scanf ("%s", entrada);

        for (int j=0;j<3; j++){
            int contador=0;
            char entradasAtual[100];
            strcpy(entradasAtual, entradas[j]);
            for (int k=0;k<strlen(entrada);k++){

                if (strlen(entradasAtual) == strlen(entrada)){

                    if (entradasAtual[k] == entrada[k]){

                        contador++;

                    }
                }
            }

        if (contador== strlen(entrada)-1){

            printf ("%s\n", entradasAtual);
        }

            }
        }

    return 0;
}
