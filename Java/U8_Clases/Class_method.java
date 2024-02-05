package Java.U8_Clases;

public class Class_method {
    public static void main(String[] args) {

        Persona p = new Persona("carlos", 23);
        p.mostrar();

        Persona p2 = new Persona("Lara");
        p2.mostrar();

        Persona p3 = new Persona();
        p3.mostrar();

        Persona p4 = new Persona("maria", 88);
        p4.mostrar();

        Persona.CuantasVeces();
    }
}

class Persona {

    String nombre;
    int edad;
    static int veces = 0;

    static void CuantasVeces() {
        System.out.println("Se han creado " + veces + " personas");
    }

    Persona(String n, int e) { // constructor de la clase
        this.nombre = n;
        this.edad = e;
    }

    Persona(String n) {
        this(n, 0);
        veces++;
    }

    Persona() {
        this("Vacio", 0);
    }

    static int valor = 33; // variable miembro de la clase, no del objeto

    void cumple() {
        System.out.println("Felicidades " + this.nombre + "edad " + this.edad);
        edad++;
    }

    void mostrar() {
        System.out.println("Nombre: " + this.nombre + " " + "E" + this.edad);

    }
}
