#include <stdio.h>
#include <string.h>

int main() {
    char string[] = "Esta é uma string para dividir";
    char *token;

    // Obtenha o primeiro token
    token = strtok(string, " ");

    // Percorra os outros tokens
    while (token != NULL) {
        printf("%s\n", token);
        // Obtenha o próximo token
        token = strtok(NULL, " ");
    }

    return 0;
}
