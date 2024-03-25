import java.util.Scanner;

//OBJETIVO PEGAR A POSIÇÃO ONDE PARA NÃO TEM RA NEM 0.
public class MytemporaryPassword{

    public static void main(String[] args){
    Scanner scanner= new Scanner (System.in);

    int n= scanner.nextInt();
    scanner.nextLine();

    StringBuilder str=new StringBuilder();

    for (int i=0;i<n;i++){

        String entrada=scanner.nextLine();
        int comeco=0;
      
            for (int j=0;j<entrada.length();j++){

                if (!entrada.contains("RA")){
                    break;
                }

                if (entrada.charAt(j) != '0' && entrada.charAt(j) != 'R' && entrada.charAt(j) != 'A') {

                comeco= j;
                break;
            }
        }

        for (int k=comeco;k<entrada.length();k++){

            str.append(entrada.charAt(k));

        }

        System.out.println(str);
        }

       
       
    }
   }
