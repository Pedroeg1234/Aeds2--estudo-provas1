/**
 * HiddenMesssage3
 */
import java.util.Scanner;
public class HiddenMesssage3 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);

        String entrada= scanner.nextLine();

        
        String[] partes= entrada.split("\\.");

        StringBuilder str= new StringBuilder();

        for (int i=0;i< partes.length;i++){

         String fraseAtual= partes[i];  

            for (int j=0;j<fraseAtual.length();j++){

                if (Character.isLetter(fraseAtual.charAt(j))){

                    str.append(fraseAtual.charAt(j));
                    break;
                }
            }
         
        }

        System.out.println(str);
    }
}