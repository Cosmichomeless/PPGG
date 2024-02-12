package Java.U8_Clases;

public class Super {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.nombre = "carlos";
        p.edad = 33;
        p.mostrar();

        Empleado e = new Empleado();
        e.nombre = "felipe";
        e.edad = 22;
        e.salario = 555;
        e.mostrar();

    }
}

class Persona {
    String nombre;
    int edad;

    void mostrar() {
        System.out.println("Nombre " + this.nombre);
        System.out.println("Edad " + this.edad);
    }

}

class Empleado extends Persona {
    int salario;

    void mostrar(){
        super.mostrar();
        System.out.println("Salario" + this.salario) ;
    }

}
