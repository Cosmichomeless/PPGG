package Java.U6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Longitud de la combinacion secreta: ");
        int Longitud = sc.nextInt();
        int combsecreta[] = new int[Longitud];
        int combjugador[] = new int[Longitud];

        generaCombinacion(combsecreta);
        System.out.println(Arrays.toString(combsecreta));
        System.out.println("Escriba la combinacion");
        leetabla(combjugador);

        while (!Arrays.equals(combsecreta, combjugador)) {
            muestrapista(combsecreta, combjugador);
            System.out.println("Escriba una combinacion");
            leetabla(combjugador);

        }
        sc.close();

    }

    private static void muestrapista(int[] combsecreta, int[] combjugador) {
        int i = 0;
        while (combsecreta[i] != combjugador[i]) {
            if (combsecreta[i] < combjugador[i]) {
                System.out.println("Es mayor");

            } else if (combsecreta[i] > combjugador[i]) {
                System.out.println("Es menor");

            } else {
                System.out.println("es igual");
            }

        }
    }

    static void generaCombinacion(int[] combsecreta) {
        for (int i = 0; i < combsecreta.length; i++) {
            combsecreta[i] = (int) (Math.random() * 5);

        }
    }

    static void leetabla(int[] combjugador) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < combjugador.length; i++) {
            combjugador[i] = sc.nextInt();

        }
        sc.close();
    }
}
