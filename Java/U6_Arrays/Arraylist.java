package Java.U6_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(23);
        numeros.add(26);
        numeros.add(33);
        numeros.add(44);

        // numeros.add(23);
        // int ele = numeros.get(0);
        // System.out.println("elementos " + ele);
        // numeros.set(0, 55);
        // ele = numeros.get(0);
        // System.out.println("elemento " + ele);
        // numeros.remove(0);
        // System.out.println(numeros);
        int ele = 0;

        for (int i = 0; i < numeros.size(); i++) {
            ele = numeros.get(i);
            System.out.println(ele);

        }

        boolean presente = numeros.contains(33); // para sabes si esta en un arrayllist se usa .contains
        if (presente) {
            System.out.println("esta");
        } else {
            System.out.println("No esta");
        }

        int donde = numeros.indexOf(35);
        System.out.println(donde);

        // para odernar un arraylist se usa collection.sort();
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}