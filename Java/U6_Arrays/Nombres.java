package Java.U6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> Nombres = new ArrayList<>();
        String Nom = "";

        while (!Nom.equals("Salir")) {
            System.out.println("Introduzca nombres y para terminar introduzca 'Salir'");
            Nom = sc.nextLine();
            if (!Nom.equals("Salir"))
                if (!Nombres.contains(Nom))
                    Nombres.add(Nom);

        }
        // do {
        // System.out.println("Introduzca nombres y para terminar introduzca 'Salir'");
        // Nombres.add(sc.next());

        // } while (!Nom.equals("Salir"));
        System.out.println(Nombres);
        sc.close();
    }
}
