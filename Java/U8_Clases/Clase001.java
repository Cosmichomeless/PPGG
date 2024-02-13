package Java.U8_Clases;


class Clase001 {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juan", 25);
        Cliente c2 = new Cliente("Juan", 25);

        if (c1.equals(c2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");

        }
        Humano h1 = new Humano();
        h1.nombre = "Lara";
        System.out.println(h1.nombre);
        h1.clase();

    }
}

class Humano {

    String nombre;

    void clase() {
        System.out.println(this.getClass().getName());
    }

}

class Cliente {
    String nombre;
    int edad;

    Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }

    public boolean equals(Cliente otro) {
        boolean iguales = false;

        if (this.nombre.equals(otro.nombre) && (this.edad == otro.edad)) {
            iguales = true;

        }
        return iguales;
    }

}