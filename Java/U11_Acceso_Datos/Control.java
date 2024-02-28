package Java.U11_Acceso_Datos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        int a = introint(sc);
        sc.close();
    }

    private static int introint(Scanner sc) {
        System.out.println("Introduce un número entero: ");
        int n;

        try {
            n = sc.nextInt();
            return n;
        } catch (InputMismatchException e) {
            System.out.println("Error, introduce un número entero: ");
            sc.nextLine();
            return introint(sc);
        }

    }
}

class Error extends Exception {

    public String toString() {
        return "Error: ";
    }
}
