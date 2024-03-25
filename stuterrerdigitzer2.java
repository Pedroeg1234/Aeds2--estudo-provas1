import java.util.Scanner;

public class stuterrerdigitzer2{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String texto=scanner.nextLine();

        String partes[]= texto.split(" ");

        StringBuilder str=new StringBuilder();
        for (int i=0;i<partes.length;i++){

            String parteAtual= partes[i];
           
                if (parteAtual.length()>=4){

                    char primeiroCaracter= parteAtual.charAt(0);
                    char segundoCaractere= parteAtual.charAt(1);
    
                if(parteAtual.charAt(2)==primeiroCaracter && parteAtual.charAt(3)== segundoCaractere){

                    str.append(parteAtual.substring(2));
                    
                } else{
                    str.append(parteAtual);
                }

            } else{
                str.append(parteAtual);
            }

          int tamPartes= partes.length;

          if (i!=tamPartes-1){
            str.append(" ");
          }

         
        }

        System.out.println(str);
        }

     

    }
