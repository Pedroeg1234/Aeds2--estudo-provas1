import java.util.Scanner;


public class HiddenMessage2{


    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String entrada= scanner.nextLine();

        String partes[] = entrada.split("\\.");
        StringBuilder str= new StringBuilder();

        for (int i=0;i<partes.length;i++){

            String parteAtual= partes[i];

            for (int j=0;j<parteAtual.length();j++){

                char caractereAtual= parteAtual.charAt(j);

                if (Character.isLetter(caractereAtual)){

                    str.append(caractereAtual);
                    break;
                }

            }
        }

        System.out.println (str);
    }
}