package Java.U6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class borrar {
    public static void main(String[] args) {
        int t[] = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a borrar");
        int aBorrar = sc.nextInt();

        int indice = Arrays.binarySearch(t, aBorrar);

        if (indice > 0) {
            System.arraycopy(t, indice + 1, t, indice, t.length - indice - 1);
            t = Arrays.copyOf(t, t.length - 1);
            sc.close();

        }
        System.out.println(Arrays.toString(t));
    }

}
