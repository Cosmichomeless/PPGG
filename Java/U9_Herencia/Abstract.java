package Java.U9_Herencia;

public class Abstract {
    public static void main(String[] args) {

        B b = new B();
        b.i = 20;
        b.metodo1();
        b.metodo2();

    }
}

abstract class A {
    int i;

    void metodo1() {
        System.out.println("Metodo 1 de A");
    }

    abstract void metodo2();

}

class B extends A {

    void metodo2() {
    }

}

class C extends A {

    void metodo2() {
    }

}