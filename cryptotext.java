import java.util.Scanner;

public class cryptotext{


    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        scanner.nextLine();

        StringBuilder str= new StringBuilder();


        for (int i=0;i<n;i++){

            String entrada=scanner.nextLine();

            for (int j=0;j<entrada.length();j++){

                char letraAtual= entrada.charAt(j);

                if (Character.isLowerCase(letraAtual)){

                    str.append(letraAtual);
                }
            }
        }

        StringBuilder strInvertida= new StringBuilder();

        for (int i=str.toString().length()-1;i>=0;i--){

            strInvertida.append(str.charAt(i));
        }

        System.out.println (strInvertida);

    }
}