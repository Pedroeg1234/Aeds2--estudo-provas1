import java.util.Scanner;

public class tp05 {

    public static String removerEspacos(String linha) {
        String str = new String();
        for (int i = 0; i < linha.length(); i++) {
            if (linha.charAt(i) != ' ') {
                str += linha.charAt(i);
            }
        }
        return str;
    }

    public static String substituir(String linha) {
        String str = new String();
        if ((linha.charAt(0) - 48) == 2) {
            int a = (linha.charAt(1) - 48);    // -48 -> para pegar o valor 0 ou 1
            int b = (linha.charAt(2) - 48);
            for (int i = 3; i < linha.length(); i++) {
                if (linha.charAt(i) == 'A') {
                    str += a;
                } else if (linha.charAt(i) == 'B') {
                    str += b;
                } else {
                    str += linha.charAt(i);
                }
            }
        } else {
            int a = (linha.charAt(1) - 48);    // -48 -> para pegar o valor 0 ou 1
            int b = (linha.charAt(2) - 48);
            int c = (linha.charAt(3) - 48);
            for (int i = 4; i < linha.length(); i++) {
                if (linha.charAt(i) == 'A') {
                    str += a;
                } else if (linha.charAt(i) == 'B') {
                    str += b;
                } else if (linha.charAt(i) == 'C') {
                    str += c;
                } else {
                    str += linha.charAt(i);
                }
            }
        }
        return str;
    }

    public static boolean calcularResultado(String linha, int posicao, int posicao2) {
        if (linha.charAt(posicao - 1) == 'd') {
            for (int i = posicao + 1; i < posicao2; i++) {
                if (linha.charAt(i) == '0') {
                    return false;
                }
            }
            return true;
        }
        if (linha.charAt(posicao - 1) == 'r') {
            for (int i = posicao + 1; i < posicao2; i++) {
                if (linha.charAt(i) == '1') {
                    return true;
                }
            }
            return false;
        }
        if (linha.charAt(posicao - 1) == 't') {
            if (linha.charAt(posicao + 1) == '0') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static String diminuir(String linha, int posicao, int posicao2, boolean resultado) {
        String str = new String();
        if (linha.charAt(posicao - 1) == 'd' || linha.charAt(posicao - 1) == 't') {
            for (int i = 0; i < linha.length(); i++) {
                if (i < posicao - 3 || i > posicao2) {
                    str += linha.charAt(i);
                } else if (resultado == true) {
                    str += '1';
                    i = posicao2;
                } else {
                    str += '0';
                    i = posicao2;
                }
            }
        } else {
            for (int i = 0; i < linha.length(); i++) {
                if (i < posicao - 2 || i > posicao2) {
                    str += linha.charAt(i);
                } else if (resultado == true) {
                    str += '1';
                    i = posicao2;
                } else {
                    str += '0';
                    i = posicao2;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linha, entrada;   // uma p ler entrada e outra p manipular
        int posicao = 0, posicao2 = 0;
        boolean resultado;
        entrada = sc.nextLine();
        while (entrada.charAt(0) != '0') {
            linha = entrada;
            linha = removerEspacos(linha);
            linha = substituir(linha);
            // pegar ultimo '('
            while (linha.length() != 1) {

                for (int i = 0; i < linha.length(); i++) {
                    if (linha.charAt(i) == '(') {
                        posicao = i;
                    }
                }
                // pegar primeiro ')'
                for (int i = 0; i < linha.length(); i++) {
                    if (linha.charAt(i) == ')' && i > posicao) {
                        posicao2 = i;
                        i = linha.length();
                    }
                }
                resultado = calcularResultado(linha, posicao, posicao2);
                linha = diminuir(linha, posicao, posicao2, resultado);
            }
            System.out.println(linha);
            entrada = sc.nextLine();
        }
        sc.close();
    }
}
