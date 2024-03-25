/**
 * fitordontfit2
 */

 import java.util.Scanner;
public class fitordontfit2 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        int n=scanner.nextInt();
        scanner.nextLine();


       for (int i=0;i<n;i++){

        String entrada= scanner.nextLine();
        String verificar= scanner.nextLine();

        int tamEntrada= entrada.length();
        int tamVerificar= verificar.length();

        int contador=0;
        boolean contem= true;
        for (int j=tamEntrada- tamVerificar; j<tamEntrada;j++){

            if (entrada.charAt(j)!= verificar.charAt(contador++)){

                contem=false;
            }
        }

        if (contem){
            System.out.println("encaixa");
        } else{
            System.out.println("não encaixa");
        }

       }
}
}