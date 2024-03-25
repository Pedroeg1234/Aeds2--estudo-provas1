#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main (){

    int n;
    scanf ("%d", &n);

    for (int i=0;i<n;i++){
        char StringResp[200]= "";
        char StringRespInv[200]="";
        char entrada[200];
        int contador=0;
        int contReverso=0;


        scanf ("%s", entrada);

        for (int j=0;j<strlen(entrada); j++){

            if (islower(entrada[j])){

                StringResp[contador++] = entrada[j];
            }
        }

        for (int k=strlen(StringResp)-1; k>=0; k--){
            StringRespInv[contReverso++]= StringResp[k];
        }

        printf ("%s\n", StringRespInv);
        
    }

    return 0;
}