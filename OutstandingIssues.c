#include <stdio.h>

int main() {
    char parenteses[101];
    scanf("%s", parenteses);

    int esquerda = 0;
    int direita = 0;
    int diferenca = 0;
    for (int i = 0; parenteses[i] != '\0'; i++) {
        if (parenteses[i] == '(') {
            esquerda++;
        }
        if (parenteses[i] == ')') {
            direita++;
        }
    }

    if (esquerda > direita) {
        diferenca = esquerda - direita;
    } else {
        diferenca = direita - esquerda;
    }
    if (esquerda == direita) {
        printf("Partiu RU\n");
    } else {
        printf("Voce tem %d pendencias\n", diferenca);
    }

    return 0;
}
