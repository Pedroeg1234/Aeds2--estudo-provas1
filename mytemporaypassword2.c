#include <stdio.h>
#include <string.h>

int main(){

    int n;

    scanf ("%d", &n); 
    for (int i=0;i<n;i++){

        char entrada[200];

        scanf ("%s", entrada);
        int indice=0;
        int imprimirdpsIndice=1;
        for (int j=0;j<strlen(entrada); j++){
            
            if (entrada[0]=='R' && entrada[1]=='A'){

                if (entrada[j]!='R' && entrada[j] != 'A' && entrada[j] !='0'){

                    indice= j;
                    break;
                }
            } else{
                imprimirdpsIndice=0;
                printf ("INVALID DATA\n");
                break;
            }
        }

        if (imprimirdpsIndice==1){
        for (int j=indice; j<strlen(entrada); j++){

            printf ("%c", entrada[j]);

        }
        printf ("\n");
        }
    }
}