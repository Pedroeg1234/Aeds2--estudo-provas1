/**
 * goingtothemarket2
 */

 import java.util.Scanner;
public class goingtothemarket2 {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n= scanner.nextInt();

        for (int i=0;i<n;i++){

            int quantidade=scanner.nextInt();
            scanner.nextLine();
            String alimentos[] = new String[quantidade];
            double valores[] = new double[quantidade];
            for (int j=0;j<quantidade;j++){

                String frase= scanner.nextLine();

                String partes[] = frase.split(" ");

                alimentos[i] = partes[0];
                valores[i] = Integer.parseInt(partes[1]);
            }

            int saidas= scanner.nextInt();
            scanner.nextLine();

            for (int k=0; k<saidas; k++){

                String ent= scanner.nextLine();
                String partes[] = ent.split(" ");

                String produtoDesejado= partes[0];
                double quantidadeDesejada= Double.parseDouble(partes[1]);

                for (int l=0;l< alimentos.length; l++){

                    if (alimentos[k] != null && alimentos[k].equals(produtoDesejado)) {

                        valorFinal += (valoresAlimentos[k] * quantidadeDesejada);
                    }

                }


            }
        }
    }
}