#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);

    char frases[n][100];

    for (int i = 0; i < n; i++) {
        scanf("%s", frases[i]);
    }

    int maior = 0;
    for (int i = 0; i < n; i++) {
        int comprimento = strlen(frases[i]);
        if (comprimento > maior) {
            maior = comprimento;
        }
    }

    for (int j = 0; j < n; j++) {
        int contador = 0;
        char str[200] = "";
        for (int i = 0; i < maior - strlen(frases[j]); i++) {
            str[contador++] = ' ';
        }
        strcat(str, frases[j]);
        printf("%s\n", str);
    }

    return 0;
}
