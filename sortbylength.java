/**
 * sortbylength
 */
import java.util.Scanner;
public class sortbylength {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);
        String entrada=scanner.nextLine();

        String partes[]= entrada.split(" ");

        insertionSort(partes);

        for (int i=0;i<partes.length;i++){
            
            System.out.println(partes[i]);
        }

    }

    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            String key = array[i];
            int j = i - 1;

            // Move os elementos do array[0..i-1], que são maiores que a chave,
            // para uma posição à frente de sua posição atual
            while (j >= 0 && array[j].length() > key.length()) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}