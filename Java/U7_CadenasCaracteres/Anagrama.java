package Java.U7_CadenasCaracteres;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * String pal1 = sc.next();
         * String pal2 = sc.next();
         * 
         * pal1.toCharArray();
         * pal2.toCharArray();
         * 
         * Arrays.sort(pal1);
         * Arrays.sort(pal2);
         */
        System.out.println("palabra 1");

        String pal1 = sc.next();
        System.out.println("palabra 2");
        String pal2 = sc.next();

        char p1[] = pal1.toLowerCase().toCharArray();
        char p2[] = pal2.toLowerCase().toCharArray();

        // Ordenamos las cadenas para poder compararlas
        Arrays.sort(p1);
        Arrays.sort(p2);

        if (Arrays.equals(p1, p2)) {
            System.out.println("Anagramas");

        } else {
            System.out.println("No anagramas");

        }
        sc.close();
    }

}
