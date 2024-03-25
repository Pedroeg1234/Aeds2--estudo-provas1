#include <stdio.h>
#include <string.h>

int main(){

    char palavras[][10]= {"one", "two", "three"};


    int n=3;
   
    for(int i=0;i<n;i++){

         char entrada[100];
         scanf ("%s", entrada);
       
         for (int j=0;j<strlen(palavras);j++){

             int iguais=0;

            for (int k=0;k<strlen(entrada);k++){

                if (strlen(entrada)== strlen(palavras[j])){
                if (palavras[j][k]== entrada[k] ){

                    iguais++;
                }
            }
            }

            if (iguais== strlen(entrada)-1){


                if (strcmp(palavras[j], "one")==0){
                    printf("1\n");
                    break;
                } else if (strcmp(palavras[j], "two")==0){

                    printf ("2\n");
                    break;

                    } else{

                        printf ("3\n");
                        break;
                    }
                }
            }
         }
         
    return 0;
}