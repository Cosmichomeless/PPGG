package Java.U7_CadenasCaracteres;

import java.util.Scanner;

public class Codificar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'r', 's', 't', 'u', 'v' };
        final char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'k', 'q', 's' };
        char codificado[];
        String texto;
        System.out.println("Introducir cadena");

        texto = sc.nextLine();
        texto = texto.toLowerCase();

        codificado = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
        }

        texto = String.valueOf(codificado);
        System.out.println(texto);

        sc.close();

    }

    private static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        String conjunto = String.valueOf(conjunto1);
        char codificado;
        int pos = conjunto.indexOf(c);
        if (pos == -1) {
            codificado = c;

        } else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }
}