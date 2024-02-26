package Java.U10_Interfaces;

public class Interfaces {
    public static void main(String[] args) {

        Perro p = new Perro();
        p.nombre = "Doby";
        p.patas = 4;
        p.voz();
        p.acelerar();
    }
}

interface Sonido {
    void voz();

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