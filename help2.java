import java.util.Scanner;

public class help2 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        char[] partes = new char[n];
        int[] valores = new int[n];
        String[] certo = new String[n];

        String[] entradas = new String[n];

        for (int i = 0; i < n; i++){
            entradas[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++){
            String dividir[] = entradas[i].split(" ");
            partes[i] = dividir[0].charAt(0);
            valores[i] = Integer.parseInt(dividir[1]);
            certo[i] = dividir[2];
        }

        int soma = 0;
        for (int i = 0; i < n; i++){
            if (certo[i].equals("correct")){
                soma += valores[i];
                if (i > 0){
                    if (partes[i] == partes[i - 1]){
                        soma += 20;
                    }
                }
            }
        }

        System.out.println(soma);
    }

   
}
