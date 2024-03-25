import java.util.Scanner;


public class DancingSentence2{

public static void main(String[] args) {
    
    //OBJETIVO: QUANDO O CARACTERE ATUAL FOR UMA LETRA INVERTA ENTRE MAIUSCULO E MINUSCULO
    Scanner scanner= new Scanner (System.in);

    String entrada= scanner.nextLine();

    boolean maiuscula= true;
    StringBuilder str= new StringBuilder();

    for (int i=0;i<entrada.length();i++){

        char letraAtual= entrada.charAt(i);
        
        if (Character.isLetter(letraAtual)){

            if (maiuscula){

                letraAtual=Character.toUpperCase(letraAtual);
                str.append(letraAtual);
            } else{

                letraAtual=Character.toLowerCase(letraAtual);
                str.append(letraAtual);
            }

            maiuscula=!maiuscula;
        } else{

        str.append(" ");
    }

    }

    System.out.println (str);

    }
}