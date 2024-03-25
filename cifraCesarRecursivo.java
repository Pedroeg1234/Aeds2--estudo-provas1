/*
  cifraCesarRecursivo
 */

import java.util.Scanner;
public class cifraCesarRecursivo {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        while (true){
        

        String entrada= scanner.nextLine();

        if (entrada.equals("FIM")){
            break;
        }
        StringBuilder str= new StringBuilder();

        int variavelControle=0;

        String resultado= cifra(entrada, variavelControle, str);

        System.out.println (resultado);

    }
    }
    public static String cifra (String entrada, int variavelControle, StringBuilder str){

        char caractereAtual= entrada.charAt(variavelControle);

        if (variavelControle == entrada.length()-1){
            
            if (caractereAtual <=122){

                char caractereModificado= (char) (caractereAtual+3);
                str.append(caractereModificado);
            } else{
                str.append(caractereAtual);
            }
            return str.toString();

    }

        if (caractereAtual <=122){

            char caractereModificado= (char) (caractereAtual+3);
            str.append(caractereModificado);
        } else{
            str.append(caractereAtual);
        }

        return cifra(entrada,variavelControle+1, str);
}
}