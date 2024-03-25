/**
 * is
 */

 import java.util.Scanner;
public class is {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        while(true){

        String entrada= scanner.nextLine();

        if (entrada.equals("FIM")){
            break;
        }
        boolean temVogal= vogal(entrada);
        boolean temConsoante= consoante(entrada);
        boolean temInteiro= inteiro(entrada);
        boolean temReal = real(entrada);

        StringBuilder str= new StringBuilder();

        if (temVogal){

            str.append("SIM ");
            
        } else {
            str.append ("NAO ");
        }

        if (temConsoante){
            str.append("SIM ");
            
        } else {
            str.append ("NAO ");
        }

        if (temInteiro){
            str.append("SIM ");
            
        } else {
            str.append ("NAO ");
        }

        if (temReal){
            str.append("SIM ");
            
        } else {
            str.append ("NAO ");
        }

        System.out.println(str);

        }
    }
    

        public static boolean vogal(String entrada) {
            boolean apenasVogal = true;
            for (int i = 0; i < entrada.length(); i++) {

                if (Character.isLetter(entrada.charAt(i))){
                if (entrada.charAt(i) != 'a' && entrada.charAt(i) != 'e' && entrada.charAt(i) != 'i'
                        && entrada.charAt(i) != 'o' && entrada.charAt(i) != 'u'
                        && entrada.charAt(i) != 'A' && entrada.charAt(i) != 'E'
                        && entrada.charAt(i) != 'I' && entrada.charAt(i) != 'O'
                        && entrada.charAt(i) != 'U') {
                    apenasVogal = false;
                }
            } else{

                apenasVogal=false;
                break;
            }
         
        }
        return apenasVogal;
    }
    public static boolean consoante (String entrada){

        boolean apenasConsoante= true;
        for(int i=0;i<entrada.length();i++){

            if (Character.isLetter(entrada.charAt(i))){
            
            if (entrada.charAt(i)=='a' || entrada.charAt(i) == 'e' || entrada.charAt(i)=='i' || entrada.charAt(i)=='o' || entrada.charAt(i)=='u' || entrada.charAt(i)=='A' || entrada.charAt(i) == 'E' || entrada.charAt(i)=='I' || entrada.charAt(i)=='O' || entrada.charAt(i)=='U'){

                apenasConsoante= false;

            }
        } else{

            apenasConsoante=false;
            break;
        }
    }
        return apenasConsoante;
}

    public static boolean inteiro (String entrada){

        boolean numeroInteiro= true;

        for (int i=0;i<entrada.length(); i++){
        if (entrada.charAt(i)!='0' && entrada.charAt(i) != '1' && entrada.charAt(i)!='2' && entrada.charAt(i)!='3' && entrada.charAt(i)!='4' && entrada.charAt(i)!='5' && entrada.charAt(i) != '6' && entrada.charAt(i)!='7' && entrada.charAt(i)!='8' && entrada.charAt(i)!='9'){

            numeroInteiro= false;

    }
}
    return numeroInteiro;
}

    public static boolean real (String entrada){

        int quantidadeReal=0;
        boolean primeiraCondicao= false;
        boolean segundaCondicao= false;
        boolean inteiro= false;

        for (int i=0;i<entrada.length(); i++){
            if (entrada.charAt(i)=='0' || entrada.charAt(i) == '1' || entrada.charAt(i)=='2' || entrada.charAt(i)=='3' || entrada.charAt(i)=='4' || entrada.charAt(i)=='5' || entrada.charAt(i) == '6' || entrada.charAt(i)=='7' || entrada.charAt(i)=='8' || entrada.charAt(i)=='9'){
    
                quantidadeReal++;
    
        }
    }

        if (quantidadeReal== entrada.length()){

            inteiro= true;
        }
        if (quantidadeReal == entrada.length() -1){

            primeiraCondicao= true;
        }

        if (primeiraCondicao){

            if (entrada.contains(".") || entrada.contains(",")){

                segundaCondicao= true;
            }
        }

        if (inteiro==true || segundaCondicao== true){

            return true;
        }
        else{

            return false;
        }
    }

   

}