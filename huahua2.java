import java.util.Scanner;

public class huahua2{

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        String entrada= scanner.nextLine();

        StringBuilder str= new StringBuilder();
        StringBuilder strInversa= new StringBuilder();


        for (int i=0;i<entrada.length();i++){

            char caractereAtual= entrada.charAt(i);

            if (caractereAtual=='a' || caractereAtual=='e' || caractereAtual=='i' || caractereAtual=='o' || caractereAtual=='u'){

                str.append(caractereAtual);
            }
            
        

        }

        int tam= str.toString().length();

        for (int j=tam-1;j>=0;j-- ){

            strInversa.append(str.charAt(j));
        }

        if (strInversa.toString().equals(str.toString())){
            System.out.println("S");
        } else{
            System.out.println ("N");
        }
    }   
}