
package Java.U8_Clases;

import java.util.Scanner;

/*
 *  Definir una clase que permita controlar un sintonizador digital de emisoras
FM; concretamente, se desea dotar al controlador de una interfaz que permita
subir (up) o bajar (down) la frecuencia (en saltos de 0,5 MHz) y mostrar la
frecuencia sintonizada en un momento dado (display). Supondremos que el
rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y
que, al inicio, el controlador sintonice la frecuencia indicada en el
constructor o
80 MHz por defecto. Si durante una operación de subida o bajada se sobrepasa
uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del
extremo contrario. Escribir un pequeño programa principal para probar su
funcionamiento.
 */

public class Actividad_8_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int change;

        System.out.println("Quiere cambiar la frecuencia de la radio? S/N");
        String respuesta = sc.next();
        respuesta.toLowerCase();
        SintonizadorFM a = new SintonizadorFM(100);

        if (respuesta.equals("s")) {

            do {
                System.out.println("Seleccione el desplazamiento");
                System.out.println("1. Subir");
                System.out.println("2. Bajar");
                System.out.println("3. Mostrar frecuencia");
                System.out.println("4. Salir");
                change = sc.nextInt();

                switch (change) {
                    case 1 -> a.up();
                    case 2 -> a.down();
                    case 3 -> System.out.println("La frecuencia es: " + a.frecuencia);
                    default -> System.out.println("Valor invalido, intente de nuevo.");
                }

            } while (change != 4);

        } else {
            System.out.println("vale la frecuencia de base es " + a.frecuencia);
        }

        SintonizadorFM b = new SintonizadorFM(80.5);
        b.down();

        b.down();
        b.display();
        sc.close();
    }
}

class SintonizadorFM {
    double frecuencia = 80.0;

    SintonizadorFM(double a) {
        this.frecuencia = a;
    }

    public void display() {
        System.out.println("Frecuencia: " + this.frecuencia + " MHz");
    }

    public void up() {
        if (this.frecuencia >= 108) {
            this.frecuencia = 80;
        } else {
            this.frecuencia += 0.5;
            System.out.println("Nueva frecuencia: " + this.frecuencia + " MHz");
        }
    }

    public void down() {

        if (this.frecuencia <= 80) {
            this.frecuencia = 108;
        } else {
            this.frecuencia -= 0.5;
            System.out.println("Nueva frecuencia: " + this.frecuencia + " MHz");

        }
    }
}
