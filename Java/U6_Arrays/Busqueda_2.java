package Java.U6_Arrays;

import java.util.Arrays;

public class Busqueda_2 {

    public static void main(String[] args) {

        int t[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int nuevo = 5;
        int indice = Arrays.binarySearch(t, nuevo);
        if (indice < 0) {
            System.out.println("indice: " + indice);
            indice = indice - 1;
            System.out.println("indice: " + indice);
            int copia[] = new int[t.length + 1];
            System.arraycopy(t, 0, copia, 0, indice);
            System.out.println(copia);
            System.arraycopy(t, indice, copia, indice + 1, t.length - indice);
            System.out.println(Arrays.toString(copia));
            copia[indice] = nuevo;
            t = copia;

        } else

            System.out.println("Encontrado");

    }
}
