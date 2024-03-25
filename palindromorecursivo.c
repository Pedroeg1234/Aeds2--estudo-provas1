#include <stdio.h>
#include <string.h>

int palRecursivo (char entrada[], int variavelControle){

    if (variavelControle == strlen(entrada)-1){

        return 1;
    } else if(entrada[variavelControle] == entrada[strlen(entrada)-variavelControle -1]){

        return palRecursivo(entrada, variavelControle+1);
    } else{

        return 0;
    }

}
int main(){

    while (1){

    char entrada[2000];
    scanf (" %[^\n]", entrada);
    if (strcmp(entrada, "FIM")==0){
        break;
    }
   

    int variavelControle=0;

    int palindromo= palRecursivo(entrada, variavelControle);

    if (palindromo==1){

        printf ("SIM\n");
    } else{

        printf ("NAO\n");
    }
    
}
return 0;
}
