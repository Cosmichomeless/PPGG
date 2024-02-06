package Java.U8_Clases;

public class Ejercicio {
    public static void main(String[] args) {

        ctac c1 = new ctac("francisco", 200);
        c1.mostrar();
        c1.ingresar();
        c1.mostrar();
        c1.retirar();
        c1.mostrar();
        System.out.println("-----------------------------------");

        ctac c2 = new ctac("juan", 350);
        c2.mostrar();
        c2.ingresar();
        c2.mostrar();
        c2.retirar();
        c2.mostrar();
        System.out.println("-----------------------------------");

        ctac c3 = new ctac("felipe", 0);
        c3.mostrar();
        c3.ingresar();
        c3.mostrar();
        c3.retirar();
        c3.mostrar();
        c3.ingreso(0);
        c3.sacar(0);
        c3.mostrar();
        System.out.println("-----------------------------------");

        ctac c4 = new ctac("carlos", 30);
        c4.sacar(30);
        c4.sacar(20);
        if (c4.sacar(0)) {
            System.out.println("No puede retirar ya que no tiene ingresos");

        } else {
            System.out.println("Retirada correcta ");
        }
        c4.mostrar();

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
        System.out.println(nombre + " tiene " + saldo + "€");
    }

    public void retirar() {
        if (saldo <= 0) {
            System.out.println("No puede retirar ya que no tiene ingresos");

        } else {
            int retiro = 56;
            this.saldo = saldo - retiro;
            System.out.println("Retirada correcta ");
        }
    }

    void ingreso(int i) {
        this.saldo = +i;
    }

    boolean sacar(int i) {
        if (i > this.saldo) {
            return false;

        } else {
            this.saldo -= i;
            return true;
        }
    }

}
