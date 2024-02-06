package Java.U8_Clases;

public class Edad {
    public static void main(String[] args) {

        persona p = new persona(0);
        p.setEdad(9);
        p.mostrar();
        System.out.println(p.getedad());

    }
}

class persona {
    private int edad;

    persona(int e) {
        this.setEdad(e);
    }

    int getedad() {
        return edad;
    }

    public void setEdad(int i) {

        if (i > 0) {
            this.edad = i;

        } else {
            System.out.println("La edad debe ser mayor a cero");
        }
    }

    void mostrar() {
        System.out.println("Edad: " + this.edad);

    }

}
