#include <stdio.h>
#include <string.h>

void insertionSort(char arr[][100], int n);

int main() {
    char entrada[100];
    char delimitadores[] = " ";
    scanf(" %[^\n]", entrada);
    char tokens[100][100];
    int numTokens = 0;
    char *token = strtok(entrada, delimitadores);
    
    while (token != NULL && numTokens < 100) {
        strcpy(tokens[numTokens++], token);
        token = strtok(NULL, delimitadores);
    }
    
    insertionSort(tokens, numTokens);
    
    for (int i = 0; i < numTokens; i++) {
        printf("%s ", tokens[i]);
    }
    
    return 0;
}

void insertionSort(char arr[][100], int n) {
    int i, j;
    char key[100];
    for (i = 1; i < n; i++) {
        strcpy(key, arr[i]);
        j = i - 1;

        while (j >= 0 && strlen(arr[j]) > strlen(key)) {
            strcpy(arr[j + 1], arr[j]);
            j = j - 1;
        }
        strcpy(arr[j + 1], key);
    }
}
