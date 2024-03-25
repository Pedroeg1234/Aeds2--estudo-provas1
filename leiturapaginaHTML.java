/**
 * leiturapaginaHTML
 */

 import java.io.*;
import java.net.*;
import java.util.Scanner;

public class leiturapaginaHTML {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input= scanner.nextLine();

            while(!input.equals("FIM")){
                String url = input;
                String pagina = scanner.nextLine();

                // Inicializar contadores
                int[] count = new int[26];
                int countConsoante = 0;
                int countBR = 0;
                int countTable = 0;

                // Acessar a página web
                URL endereco = new URL(url);
                BufferedReader leitor = new BufferedReader(new InputStreamReader(endereco.openStream()));
                String linha;
                
                while ((linha = leitor.readLine()) != null) {
                    // Contagem de vogais, consoantes, <br> e <table>
                    for (char c : linha.toCharArray()) {
                        if (Character.isLetter(c)) {
                            char lowerC = Character.toLowerCase(c);
                            count[lowerC - 'a']++;
                            if (lowerC != 'a' && lowerC != 'e' && lowerC != 'i' && lowerC != 'o' && lowerC != 'u') {
                                countConsoante++;
                            }
                        } else if (linha.contains("<br>")) {
                            countBR++;
                        } else if (linha.contains("<table>")) {
                            countTable++;
                        }
                    }
                }
                
                leitor.close();

                // Saída formatada
                System.out.printf("a(%d) e(%d) i(%d) o(%d) u(%d) á(%d) é(%d) í(%d) ó(%d) ú(%d) à(%d) è(%d) ì(%d) ò(%d) ù(%d) ã(%d) õ(%d) â(%d) ê(%d) î(%d) ô(%d) û(%d) consoante(%d) <br>(%d) <table>(%d) %s\n",
                                  count[0], count[4], count[8], count[14], count[20], // a, e, i, o, u
                                  count[0] + count[16], count[4] + count[17], count[8] + count[18], count[14] + count[19], count[20] + count[21], // á, é, í, ó, ú
                                  count[0] + count[15], count[4] + count[16], count[8] + count[17], count[14] + count[18], count[20] + count[19], // à, è, ì, ò, ù
                                  count[0] + count[18], count[4] + count[14], // ã, õ
                                  count[0] + count[19], count[4] + count[20], count[8] + count[21], count[14] + count[22], count[20] + count[23], // â, ê, î, ô, û
                                  countConsoante, countBR, countTable, pagina);

                input = scanner.nextLine(); // Próxima entrada
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
