/**
 * isRecursivo
 */

 import java.util.Scanner;

public class isRecursivo {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner (System.in);

        while (true){
        String entrada= scanner.nextLine();

        if (entrada.equals("FIM")){
            break;
        }

        int variavelControle=0;
        StringBuilder str= new StringBuilder();

        boolean vogal= Sovogal (entrada, variavelControle);

        if (vogal){

            str.append("SIM ");
        } else{
            str.append("NAO ");
        }

        boolean consoante= Soconsoante(entrada, variavelControle);
        if (consoante){

            str.append("SIM ");
        } else{

            str.append("NAO ");
        }

        boolean inteiro= numInteiro(entrada, variavelControle);

        if (inteiro){
            str.append("SIM ");
        } else {
            str.append("NAO ");
        }

        boolean real= numeroReal (entrada,variavelControle, 0);

        if (real){
            str.append("SIM ");
        } else{
            str.append("NAO ");
        }

        System.out.println(str);
    }

   
    }
    public static boolean Sovogal (String entrada, int variavelControle){

        if (variavelControle==entrada.length()){


            return true;
        } else if (Character.isLetter(entrada.charAt(variavelControle))) 
             {
                
                if (Character.toLowerCase(entrada.charAt(variavelControle)) != 'a' &&
                Character.toLowerCase(entrada.charAt(variavelControle)) != 'e' &&
                Character.toLowerCase(entrada.charAt(variavelControle)) != 'i' &&
                Character.toLowerCase(entrada.charAt(variavelControle)) != 'o' &&
                Character.toLowerCase(entrada.charAt(variavelControle)) != 'u') {
                return false;
            } 
        } else{

            return false;
        }

        return Sovogal (entrada, variavelControle+1);
        
}

public static boolean Soconsoante (String entrada, int variavelControle){

    if (variavelControle== entrada.length()){

        return true;
    } else if (Character.isLetter(entrada.charAt(variavelControle))){

        if (Character.toLowerCase(entrada.charAt(variavelControle)) == 'a' ||
        Character.toLowerCase(entrada.charAt(variavelControle)) == 'e' ||
        Character.toLowerCase(entrada.charAt(variavelControle)) == 'i' ||
        Character.toLowerCase(entrada.charAt(variavelControle)) == 'o' ||
        Character.toLowerCase(entrada.charAt(variavelControle)) == 'u') {
        return false;
    } 
    } else{
        return false;
    }

    return Soconsoante(entrada, variavelControle+1);
}

public static boolean numInteiro (String entrada, int variavelControle){

    if (variavelControle== entrada.length()){

        return true;
    } else if (Character.isDigit(entrada.charAt(variavelControle))){

        if (entrada.charAt(variavelControle) != '0' && entrada.charAt(variavelControle) != '1' &&
        entrada.charAt(variavelControle) != '2' && entrada.charAt(variavelControle) != '3' &&
        entrada.charAt(variavelControle) != '4' && entrada.charAt(variavelControle) != '5' &&
        entrada.charAt(variavelControle) != '6' && entrada.charAt(variavelControle) != '7' &&
        entrada.charAt(variavelControle) != '8' && entrada.charAt(variavelControle) != '9') {
        
            return false;
    } 
                 
} else{

    return false;
}
    
return numInteiro(entrada, variavelControle+1);
}


public static boolean numeroReal(String entrada, int variavelControle, int quantidadeInteiro) {
    if (variavelControle == entrada.length()) {
        if (quantidadeInteiro == entrada.length() - 1 && (entrada.contains(".") || entrada.contains(","))) {
            return true;
        } else if (quantidadeInteiro == entrada.length()) {
            return true;
        } else {
            return false;
        }
    } else if (Character.isDigit(entrada.charAt(variavelControle))) {
        quantidadeInteiro++;
    }

    return numeroReal(entrada, variavelControle + 1, quantidadeInteiro);
}

}


