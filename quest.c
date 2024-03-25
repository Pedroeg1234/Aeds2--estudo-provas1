#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>


void selectionSort (char** arr, int n){

  

    for (int i=0; i<n-1; i++){

        int minIndex= i;
        


        for (int j=i+1; j<n-1; j++){

,
            if (strcmp(arr[j], arr[minIndex])<0){

                minIndex=j;
            }
        }
        

        
         char temp[200];
         strcpy(temp, arr[i]);
        strcpy(arr[i], arr[minIndex]);
        strcpy(arr[minIndex], temp);
        
         //temp= arr[i];
        //arr[i] = arr[minIndex];
        //arr[minIndex]= temp;
    }
}
int main(){


    int qntd;

    scanf ("%d", &qntd);

    //char comportou[qntd][1];
    char nomes[qntd][200];
    char comportou[qntd][1];
    int qntdMais=0;
    int qntdMenos=0;
    for (int i=0;i<qntd; i++){

       
        scanf ("%c", &comportou[i] );

        

        scanf ("%s", nomes[i]);
    }

    selectionSort(nomes, qntd);


    for (int k= 0 ; k< qntd; k++){

        if (comportou[k] == '+'){

            qntdMais++;
        } else{

            qntdMenos++;
        }

    }
    for (int j=0;j<qntd; j++){


        printf ("%s", nomes[j]);
    }

    printf (" Se comportaram: %d", qntdMais);
    printf ("| Nao se comportaram: %d", qntdMenos);

    
    return 0;
}