package Java.U8_Clases;


public class Actividad_Perros {

    public static void main(String[] args) {

        Persona p = new Persona("Felipe");

        Perro pe = new Perro("Doby", p);
        pe.mostrar();
        pe.ruido();

        Gato g = new Gato("Queen", p);
        g.mostrar();
        g.ruido();

    }

}

class Persona {
    String nombre;

    Persona(String a) {
        this.nombre = a;
    }

    void mostrar() {
        System.out.println("----------------------------------");
        System.out.println("Nombre " + this.nombre);
    }

}

class Animal {
    String nombre;

    void mostrar() {
        System.out.println("Nombre " + this.nombre);
    }
}

class Perro extends Animal {
    Persona Duenio;

    Perro(String n, Persona a) {
        this.nombre = n;
        this.Duenio = a;

    }

    void ruido() {
        System.out.println("Guauuuu");

    }

    void mostrar() {
        System.out.println("----------------------------------");

        super.mostrar();
        System.out.println("Dueño " + this.Duenio.nombre);
    }

}

class Gato extends Animal {
    Persona Duenio;

    Gato(String n, Persona a) {
        this.nombre = n;
        this.Duenio = a;

    }

    void ruido() {
        System.out.println("Miauuuuuu");
    }

    void mostrar() {
        System.out.println("----------------------------------");

        super.mostrar();
        System.out.println("Dueño " + this.Duenio.nombre);
    }

}