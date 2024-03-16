
public class EX3 {
    /*
     * Crear la clase EX3_persona y EX3_estudiante según se describe a continuacion
     * Crear la clase EX3_persona
     * Propiedades
     * Nombre (string)
     * Sexo (enumerado (“Mujer”,”Hombre”)
     * Crear una clase EX3_estudiante que hereda de EX3_persona
     * Propiedades
     * aNacimiento (int)
     * tutor (persona)
     * Métodos
     * setTutor(EX3_persona): Asigna un tutor a un estudiante
     * Consideraciones
     * El año de nacimiento no puede ser anterior a 2000. Si se crea un objeto con
     * un año anterior, se pone 0 y se saca el mensaje “Tiene que ser mayor de 2000.
     * Asignado 0”
     */
    public static void main(String[] args) {

        EX3_persona p1 = new EX3_persona("Lara", "Mujer");

        System.out.println(p1);

        EX3_estudiante e1 = new EX3_estudiante("Maria", "Mujer", 2005, p1);

        EX3_estudiante e2 = new EX3_estudiante("Carlos", "Hombre", 1910, p1);

        System.out.println(e1);

        System.out.println(e2);

    }

}

class EX3_persona {

    String nombre;
    Sexo sexo;

    enum Sexo {
        Mujer, Hombre, Indefinido
    }

    EX3_persona(String nombre, String sexo) {
        this.nombre = nombre;

        sexo = sexo.substring(0, 1).toUpperCase() + sexo.substring(1).toLowerCase();
        try {
            this.sexo = Sexo.valueOf(sexo);
        } catch (IllegalArgumentException e) {
            this.sexo = Sexo.Indefinido;
        }
    }

    @Override
    public String toString() {

        return "Nombre tutor: " + nombre + "\n" + "Sexo tutor: " + sexo;
    }
}

class EX3_estudiante extends EX3_persona {

    int aNacimiento;
    EX3_persona tutor;

    EX3_estudiante(String nombre, String sexo) {
        super(nombre, sexo);
    }

    public EX3_estudiante(String string, String string2, int i, EX3_persona p1) {
        super(string, string2);
        if (i < 2000) {
            this.aNacimiento = 0;
            System.out.println("Tiene que ser mayor de 2000. Asignado 0");
            System.out.println("--------------------------------------------------------------------");
        } else {
            this.aNacimiento = i;
        }
        this.tutor = p1;
    }

    public void setTutor(EX3_persona tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Sexo: " + sexo + "\n" + "Nace: " + aNacimiento + "\n" + "Nombre tutor: "
                + tutor.nombre + "\n"
                + "Sexo tutor: " + tutor.sexo + "\n"
                + "--------------------------------------------------------------------";
    }
}