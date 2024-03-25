import java.util.Scanner;

/**
 * Alliteration2
 */
public class Alliteration2 {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        String entrada= scanner.nextLine();

        String partes[]= entrada.split(" ");

        int quantidadeAliteracoes=0;
        for (int i=1;i< partes.length;i++){

            char caractereAnterior= partes[i-1].charAt(0);
            char caractereAtual=partes[i].charAt(0);

            int sequencia=0;
            while (caractereAtual==caractereAnterior){

                sequencia++;
                i++;

                if (i<partes.length){
                caractereAnterior= partes[i-1].charAt(0);
                caractereAtual=partes[i].charAt(0);
                } else{
                    break;
                }
            }

            if (sequencia>0){
                quantidadeAliteracoes++;
            }
        }

        System.out.println (quantidadeAliteracoes);
    }
}