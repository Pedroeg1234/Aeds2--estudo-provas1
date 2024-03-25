#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>


char* alteracaoAleatoria (char entrada[], char letraAleatoria, char trocaAleatoria, int variavelControle, char stringRetorna[]){

   
    char caractereAtual= entrada[variavelControle];

    if (variavelControle == strlen(entrada)){
        stringRetorna[variavelControle] = '\0';
        return stringRetorna;
    }
    else if (entrada[variavelControle]== letraAleatoria){

        stringRetorna[variavelControle]= trocaAleatoria;

        return alteracaoAleatoria (entrada, letraAleatoria, trocaAleatoria, variavelControle+1, stringRetorna);
    } else{

        stringRetorna[variavelControle] = caractereAtual;
        return alteracaoAleatoria (entrada, letraAleatoria, trocaAleatoria, variavelControle+1, stringRetorna);
    }


}
int main(){

    srand(4);

    while (1){
    char entrada[2000];

    scanf (" %[^\n]", entrada);

    if (strcmp(entrada, "FIM")==0){
        break;
    }
    char letraAleatoria = 'a' + (abs(rand()) % 26);
    char trocaAleatoria = 'a' + (abs(rand()) % 26);

    int variavelControle=0;
    char stringRetorna[2000];
    char* resp= alteracaoAleatoria(entrada, letraAleatoria, trocaAleatoria, variavelControle, stringRetorna);

    printf ("%s\n", stringRetorna);

    }
    return 0;
}


  