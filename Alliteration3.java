/**
 * Alliteration3
 */
import java.util.Scanner;
public class Alliteration3 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        String entrada= scanner.nextLine();

        String partes[]= entrada.split(" ");

        int aliteracoes=0;
        for (int i=1;i<partes.length;i++){

                int qntd=0;
                char letraAtual= partes[i].charAt(0);
                char letraAnterior= partes[i-1].charAt(0);

                while (letraAtual==letraAnterior){

                    qntd++;
                    i++;
                    if (i<partes.length){
                   
                    letraAtual= partes[i].charAt(0);
                    letraAnterior= partes[i-1].charAt(0);
                    } else {
                        break;
                    }
                }

                if (qntd >0){
                    aliteracoes++;
                }
        }

        System.out.println(aliteracoes);

    }
}