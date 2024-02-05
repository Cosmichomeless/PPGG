package Java.U8_Clases;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        ctac c1 = new ctac("francisco", 200);
        c1.mostrar();
        c1.ingresar();
        c1.mostrar();

    }

}

class ctac {

    String nombre;
    int saldo;

    ctac(String n, int s) {
        this.nombre = n;
        this.saldo = s;
    }

    ctac() {
        this("vacia", 0);

    }

    void ingresar() {
        int ingreso = 23;
        this.saldo = saldo + ingreso;

    }

    void mostrar() {
        System.out.println(nombre + " " + saldo);
    }

}
