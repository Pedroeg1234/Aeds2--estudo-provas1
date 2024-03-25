import java.util.Scanner;


public class palindromoRecursivo{


    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        String entrada=scanner.nextLine();
     

        boolean palindromo= PalRecursivo(entrada, 0);

        System.out.println (palindromo);
    }

    public static boolean PalRecursivo(String entrada, int variavelControle){

        if (variavelControle==entrada.length()-1){

            return true;
        }

        if (entrada.charAt(variavelControle)== entrada.charAt(entrada.length()-variavelControle-1)){

            return PalRecursivo(entrada, variavelControle +1);

        } else{

            return false;
        }

    }
}