/**
 * stuterrerDigitzer3
 */
import java.util.Scanner;

public class stuterrerDigitzer3 {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        String entrada= scanner.nextLine();

        String[] partes= entrada.split(" ");

        StringBuilder str= new StringBuilder();

        for (int i=0;i<partes.length;i++){

            String parteAtual = partes[i];
            

                if (parteAtual.charAt(0) == parteAtual.charAt(2) && parteAtual.charAt(1)==parteAtual.charAt(3)){
                    
                    for ( int j=2;j<parteAtual.length();j++){

                        str.append(parteAtual.charAt(j));
                        
                    }
            }  else{
                str.append(parteAtual);
            }

            str.append(" ");
        }
    

    System.out.println(str);
}
}