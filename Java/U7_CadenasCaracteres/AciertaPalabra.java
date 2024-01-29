package Java.U7_CadenasCaracteres;

import java.util.Scanner;

public class AciertaPalabra {
    public static void main(String[] args) {
        int tryUser = 6;
        String Pass, palabra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra para jugar");
        Pass = sc.nextLine();
        System.out.println("La contraseña tiene " + Pass.length() + " caracteres");
        System.out.println("2º Jugador palabra ");
        palabra = sc.nextLine();

        do {
            String pista = "";

            for (int i = 0; i < Pass.length(); i++) {
                if (Pass.charAt(i) == palabra.charAt(i)) {
                    pista += Pass.charAt(i);

                } else {
                    pista += "*";
                }

            }
            tryUser = tryUser - 1;
            System.out.println(pista);
            System.out.println("Jugador 2. Introduzca la palabra");
            palabra = sc.nextLine();
            System.out.println("Te quedan " + tryUser + " intentos");

        } while (!palabra.equals(Pass) || tryUser <= 0);

        System.out.println("Acertaste");

        /*
         * * if (Pass.equals(palabra)) {
         * System.out.println("Acertaste la palabra correcta era" + Pass);
         * 
         * } else {
         * while (Pass.equals(palabra) || tryUser == 5) {
         * System.out.println("2º Jugador adivine la palabra ");
         * 
         * }
         * 
         * }
         */

        sc.close();
    }
}
