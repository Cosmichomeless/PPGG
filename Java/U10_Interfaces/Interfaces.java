package Java.U10_Interfaces;

public class Interfaces {
    public static void main(String[] args) {

        Perro p = new Perro();
        p.nombre = "Doby";
        p.patas = 4;
        p.voz();
        p.durmiendo();
        p.acelerar();

        Gato g = new Gato();
        g.nombre = "Queen";
        g.patas = 4;
        g.voz();
        g.durmiendo();

        Caracol c = new Caracol();
        c.nombre = "Gary";
        c.patas = 1;
        c.acelerar();

        Sonido sss = new Perro();
        sss.durmiendo();
    }
}

interface Sonido {
    int version = 1;

    void voz();

    default void durmiendo() {
        System.out.println("zzzz");
    }

    static void bostezo() {
        System.out.println("uuuuu");
    }
}

interface Reconocer extends Sonido {

    void reconocer();
}

interface Velocidad {
    void acelerar();

}

class Animal {
    int patas;
}

class Nombre {

    String nombre;

}

class Perro extends Animal implements Sonido, Velocidad {

    String nombre;

    @Override
    public void voz() {
        System.out.println("guau");
    }

    @Override
    public void acelerar() {
        System.out.println("rapido");
    }
}

class Gato extends Animal implements Sonido {

    String nombre;

    @Override
    public void voz() {
        System.out.println("miau");
    }
}

class Caracol extends Animal implements Velocidad {

    String nombre;

    @Override
    public void acelerar() {
        System.out.println("lento");
    }
}