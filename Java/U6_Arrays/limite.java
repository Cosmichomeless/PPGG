package Java.U6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class limite {
    public static void main(String[] args) {
        int aux[] = new int[10];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = (int) (Math.random() * 1000 + 1);

        }
        System.out.println(Arrays.toString(aux));
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor limite");
        int valores = sc.nextInt();

        int eliminados[] = sinmayores(aux, valores);
        System.out.println(Arrays.toString(eliminados));
        sc.close();
    }

    private static int[] sinmayores(int[] aux, int valores) {
        int copia[] = Arrays.copyOf(aux, aux.length);
        int i = 0;
        while (i < copia.length) {
            if (copia[i] < valores) {
                copia[i] = copia[copia.length - 1];
                copia = Arrays.copyOf(copia, copia.length - 1);

            } else
                i++;

        }
        return copia;
    }
}