package Java.U6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Num_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> datos = new ArrayList<>();
        Integer a = 0;
        do {
            System.out.println("Introduce el dato: se sale con "+"0" );
            a = sc.nextInt();
            if (a != 0)
                datos.add(a);
        } while (a != 0);
        for (int x = 0; x < datos.size(); x++)
            System.out.println(datos.get(x));
        System.out.println(datos);
        System.out.println("Introduce dato a buscar");
        a = sc.nextInt();
        if (datos.contains(a))
            System.out.println("Encontrado");
        else
            System.out.println("No encontrado");
        sc.close();
    }
}
