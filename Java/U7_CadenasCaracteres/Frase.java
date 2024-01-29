package Java.U7_CadenasCaracteres;

import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase, palabra;

        System.out.println("Introduce una palabra");
        frase = sc.next();
        System.out.println("introduce una palabra");
        palabra = sc.next();

        int veces = 0, pos;
        pos = frase.indexOf(palabra);
        while (pos != -1) {
            veces++;
            pos = frase.indexOf(palabra, pos + 1);
        }
        System.out.println("lo he econtrado " + veces);
        sc.close();
    }
}