/**
 * ciframentoCesar
 */
import java.util.Scanner;

public class ciframentoCesar {

    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);

        while(true){
        String frase= scanner.nextLine();
            
        if (frase.equals("FIM")){
            break;
        }
        int avanco=3;
        StringBuilder str= new StringBuilder();
        for (int i=0;i<frase.length();i++){
            char caractereAtual= frase.charAt(i);

            if ((int)caractereAtual <=122){
            char caractereModificado= (char) (caractereAtual+avanco); 

            str.append(caractereModificado);
        } else{
            str.append(caractereAtual);
        }


    }
        System.out.println(str);

    }
}
}