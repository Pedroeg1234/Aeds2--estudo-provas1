#include <stdio.h>

void selectionSort(int arr[], int n);
void cloneArray(int arr[], int clonedArr[], int size);

int main() {
    int t; // Número de casos de teste
    scanf("%d", &t);

    while (t--) {
        int n; // Tamanho do vetor
        scanf("%d", &n);

        int vector[n];
        int clonedVector[n];

        // Leitura dos elementos do vetor
        for (int i = 0; i < n; i++) {
            scanf("%d", &vector[i]);
        }

        cloneArray(vector, clonedVector, n);
        selectionSort(clonedVector, n);

        // Contagem dos elementos inalterados
        int unchanged = 0;
        for (int i = 0; i < n; i++) {
            if (clonedVector[i] == vector[i]) {
                unchanged++;
            }
        }

        printf("%d\n", unchanged);
    }

    return 0;
}

// Ordenação do vetor em ordem decrescente usando o algoritmo de Selection Sort
void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int maxIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }
        // Troca dos elementos
        int temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}

// Função para clonar um vetor para outro
void cloneArray(int arr[], int clonedArr[], int size) {
    for (int i = 0; i < size; i++) {
        clonedArr[i] = arr[i];
    }
}
