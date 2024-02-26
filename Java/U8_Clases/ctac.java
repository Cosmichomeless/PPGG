package Java.U8_Clases;


public class ctac {

    String nombre;
    private int saldo;

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
