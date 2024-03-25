/**
 * barbecueAtYuris2
 */

import java.util.Scanner;
public class barbecueAtYuris2 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        String carnes[]= new String[n];
        int precos[]= new int[n];

        for (int i=0;i<n;i++){

            String frase= scanner.nextLine();
            
            String partes[] = frase.split(" ");

            carnes[i]= partes[0];
            precos[i]= Integer.parseInt(partes[1]);

        }

        SelectionSort(carnes, precos, n);

        for (int j=0;j < n ; j++){

            System.out.println(carnes[j]);
        }
    }


    public static void SelectionSort(String carnes[], int precos[], int tam){


        for (int i=0;i<tam;i++){

            int indiceMenor=i;

            for (int j=i+1; j<tam;j++){

                if (precos[j] < precos[indiceMenor]){

                    indiceMenor= j;
                }

            }

            String tmp= carnes[i];
            carnes[i] = carnes[indiceMenor];
            carnes[indiceMenor] = tmp;

            int temp= precos[i];
            precos[i] = precos[indiceMenor];
            precos[indiceMenor] = temp;   
        }
    }
}