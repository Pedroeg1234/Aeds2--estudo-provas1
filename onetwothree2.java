import java.util.Scanner;

public class onetwothree2{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String numeros[]= {"one", "two", "three"};

        int n=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<n;i++){

            String entrada=scanner.nextLine();
            int iguais=0;

            for (int j=0;j<numeros.length;j++){
                String numeroAtual= numeros[j];

                for (int k=0;k<numeroAtual.length();k++){

                    int tamEntrada= entrada.length();
                    int tamNumeroAtual= numeroAtual.length();

                    if (tamEntrada== tamNumeroAtual){

                        if (numeroAtual.charAt(k)==entrada.charAt(k)){

                            iguais++;

                            if (iguais==tamNumeroAtual-1){
                                System.out.println (numeroAtual);
                                break;
                            }
                        }
                    } else{
                        break;
                    }

                }

              
            }
        }
    }
}