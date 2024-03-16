import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EX2 {
    /*
     * Pedir por pantalla 10 números y grabar un archivo denominado “numeros.txt”
     * con los números introducidos por el usuario. Solo se debe permitir introducir
     * números. Si el usuario introduce otro tipo de carácter debe sacar el mensaje
     * “Solo se admite números”
     */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int a;
        int cont = 0;

        try (BufferedWriter wr = new BufferedWriter(new FileWriter("Java//Evaluables//2T//numeros.txt", true))) {

            for (int i = 0; i < 10; i++) {
                System.out.println("Dime un número " + "llevas " + cont);
                a = intronum(sc);
                numeros[i] = a;
                wr.write(numeros[i] + ",");
                cont++;

            }

        } catch (InputMismatchException e) {
            System.out.println("Solo se admite números");
            sc.nextLine();
        }
        sc.close();

    }

    private static int intronum(Scanner sc) {
        int n;

        try {
            n = sc.nextInt();
            return n;
        } catch (InputMismatchException e) {
            System.out.println("Error, introduce un número entero: ");
            sc.nextLine();
            return intronum(sc);
        }

    }
}
