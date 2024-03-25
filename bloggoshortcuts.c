#include <stdio.h>
#include <string.h>

int main(){

    char texto[1000];

    scanf (" %[^\n]", texto);

    char str[200]="";
    int contador=0;
    int aberto=1;
    for (int i=0;i<strlen(texto);i++){

            if (texto[i] =='_'){

                if (aberto){
                str[contador++]='<';
                str[contador++]= 'i';
                str[contador++]= '>';

                aberto=!aberto;

                } else{

            str[contador++]='<';
            str[contador++]='/';
            str[contador++]= 'i';
            str[contador++]= '>';  

            aberto= !aberto;

                }
            }  else if (texto[i]=='*'){

                if (aberto){
                str[contador++]='<';
                str[contador++]= 'b';
                str[contador++]= '>';

                aberto=!aberto;

                } else{

            str[contador++]='<';
            str[contador++]='/';
            str[contador++]= 'b';
            str[contador++]= '>';                    

            aberto=!aberto;
                }
            }  else{

                str[contador++]= texto[i];
            }
            }
    
    printf("%s", str);

    return 0;
}