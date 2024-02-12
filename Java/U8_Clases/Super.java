/*package Java.U8_Clases;

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

        Jefe j = new Jefe();
        j.nombre = "Amanda";
        j.edad = 33;
        j.salario = 2000;
        j.puesto = "Jefa";
        j.mostrar();

        Cliente c = new Cliente();
        c.nombre = "hijo";
        c.edad = 22;
        c.NIF = "895663";
        c.mostrar();

    }
}

class Persona {
    String nombre;
    int edad;

    void mostrar() {
        System.out.println("----------------------------");

        System.out.println("Nombre " + this.nombre);
        System.out.println("Edad " + this.edad);
    }

}

class Cliente extends Persona {
    String NIF;

    void mostrar() {
        super.mostrar();
        System.out.println(this.NIF);
    }

}

class Empleado extends Persona {
    int salario;

    void mostrar() {
        super.mostrar();
        System.out.println("Salario " + this.salario);
    }

}


class Jefe extends Empleado {
    String puesto;

    void mostrar() {
        super.mostrar();
        System.out.println("Puesto " + this.puesto);
    }

}
*/