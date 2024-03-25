#include <stdio.h>
#include <string.h>

int main() {
    while(1) {
        char entrada[2000];
        scanf(" %[^\n]", entrada);

        if (strcmp(entrada, "FIM") == 0) {
            break;
        }
        
        char entradaInvertida[200];
        int contador = 0;
        int tamEntrada = strlen(entrada);

        for(int i = tamEntrada - 1; i >= 0; i--) {
            entradaInvertida[contador++] = entrada[i];
        }

        entradaInvertida[contador] = '\0'; // Adiciona o terminador nulo no final da string invertida
    
        if (strcmp(entradaInvertida, entrada) == 0) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }
    return 0;
}