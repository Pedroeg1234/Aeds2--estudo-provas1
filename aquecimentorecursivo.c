#include <stdio.h>
#include <string.h>
#include <ctype.h>




int main(){

    int variavelControle=0;
    int quantidade=0;
    while (1){

        char entrada[200];

        scanf (" %[^\n]", entrada);

        if (strcmp(entrada,"FIM")==0){

            break;
        }

        int qntd= contarMaiuscula(entrada, variavelControle, quantidade);

        printf ("%d\n", qntd);
    }
    return 0;
}

int contarMaiuscula (char entrada[], int variavelControle, int quantidade){

    if (variavelControle==strlen(entrada)){
        
        return quantidade;
    } 

    if (isupper(entrada[variavelControle])){

        return 1 + contarMaiuscula(entrada, variavelControle+1, quantidade);
    } else{

        return 0 + contarMaiuscula(entrada, variavelControle+1, quantidade);
    }

}
