/**
 * palindromoRecursivo2
 */

 import java.util.Scanner;
public class palindromoRecursivo2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true){

        String frase= scanner.nextLine();

        if (frase.equals("FIM")){
            break;
        }
        int variavelControle=0;

        boolean palindromo= ehPalindromo(frase, variavelControle);

        if (palindromo){

            System.out.println("SIM");
        } else{
            System.out.println("NAO");
        }
    }
    }
    public static boolean ehPalindromo(String frase, int variavelControle){

        boolean palindromo= true;
        if (variavelControle== frase.length() -1){

            return true;
        }

        else if (frase.charAt(variavelControle) == frase.charAt(frase.length() -1 - variavelControle)){

            return ehPalindromo(frase, variavelControle+1);
        } else{

            return false;
        }

    }
}