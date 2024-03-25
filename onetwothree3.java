/**
 * onetwothree3
 */

import java.util.Scanner;

public class onetwothree3 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        scanner.nextLine();

        String[] palavras= {"one", "two", "three"};

        for (int i=0;i<n;i++){

            String palavra= scanner.nextLine();

            for (int j=0;j< palavras.length;j++){

                String palavraAtual= palavras[j];
                int cont=0;
                for (int k=0;k<palavra.length();k++){

                    if (palavraAtual.length()== palavra.length()){

                        if (palavraAtual.charAt(k) == palavra.charAt(k)){

                            cont++;
                        }
                    }
                }

                if (cont == palavraAtual.length()-1){

                    System.out.println(palavraAtual);
                    break;
                }
            }
            }
        }
    }
