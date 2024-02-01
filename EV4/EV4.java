package EV4;

import java.util.Scanner;

public class EV4 {
    /*
     * 1. Cantidad de caracteres
     * 2. Cantidad de letras
     * 3. Cantidad de espacios
     * 4. Cantidad de números
     * 5. Cantidad de consonantes
     * 6. Cantidad de palabras
     * 7. La cantidad de vocales que hay y las repeticiones que hay de cada una
     * 8. Cuál es la palabra más larga y cuantos caracteres tiene
     * 9. Cuál es la palabra más corta y cuantos caracteres tiene
     * 10. Si hay alguna palabra palíndroma y cual es
     * 11. Si hay alguna palabra que tenga todas las vocales y cuál es
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un texto");
        //introduce la frase
        String pal1 = sc.nextLine();
        char p1[] = pal1.toLowerCase().toCharArray();

        nCaracteres(pal1);// cantidad de caracteres

        nLetras(pal1, p1); // cantidad de letras

        nEspacios(pal1); // cantidad de espacios

        nNumeros(pal1, p1);// cantidad de numeros

        nPalabras(pal1); // cantidad de palabras
        nConsonantes(pal1, p1);// cantidad de consonantes

        nVocales(pal1);// vocales y repeticion

        // palabra mas larga

        // palabra mas corta

        // palindroma

        String sinEspacios, invertida;
        pal1 = pal1.toLowerCase();
        sinEspacios = eliminaEspacios(pal1);
        invertida = alReves(sinEspacios);
        if (sinEspacios.equals(invertida)) {
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }

        // palabra de vocales

        sc.close();
    }

    private static void nVocales(String pal1) {
        int[] nVocales = new int[5];

        for (char c : pal1.toCharArray()) {
            switch (c) {
                case 'a' -> nVocales[0]++;
                case 'e' -> nVocales[1]++;
                case 'i' -> nVocales[2]++;
                case 'o' -> nVocales[3]++;
                case 'u' -> nVocales[4]++;
            }

        }
        System.out.println(
                "Contador de vocales: " + "A_" + nVocales[0] + " " + "E_" + nVocales[1] + " " + "I_" + nVocales[2] + " "
                        + "O_" + nVocales[3] + " " + "U_" + nVocales[4]);
    }

    private static void nConsonantes(String pal1, char p1[]) {
        int nConsonantes = 0;

        for (char c : p1) {
            if ((c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') && (Character.isLetter(c))) {
                nConsonantes++;

            }

        }
        System.out.println("cantidad de consonantes: " + nConsonantes);
    }

    private static void nNumeros(String pal1, char p1[]) {
        int nNumeros = 0;
        for (char c : p1) {
            if (Character.isDigit(c)) {
                nNumeros++;

            }
        }
        System.out.println("Cantidad de numeros: " + nNumeros);

    }

    private static void nEspacios(String pal1) {
        int nespacios = 0;

        for (int i = 0; i < pal1.length(); i++) {
            if (pal1.charAt(i) == ' ') {
                nespacios++;

            }

        }
        System.out.println("Cantidad de espacios: " + nespacios);

    }

    private static void nPalabras(String pal1) {
        String[] palabras = pal1.split(" ");
        int nPalabras = palabras.length;
        System.out.println("Cantidad de palabras: " + nPalabras);
    }

    private static void nLetras(String pal1, char p1[]) {
        int nLetras = 0;
        for (char c : p1) {
            if (Character.isLetter(c)) {
                nLetras++;

            }
        }
        System.out.println("Cantidad de letras: " + nLetras);

    }

    private static void nCaracteres(String pal1) {
        int ncaracteres = pal1.length();
        System.out.println("Cantidad de caracteres: " + ncaracteres);
    }

    static String eliminaEspacios(String cadena) {
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isWhitespace(c)) { // si no es un carácter blanco
                sin = sin + c;
            }
        }
        return sin;
    }

    static String alReves(String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }

}
