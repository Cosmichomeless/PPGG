package Java.U11_Acceso_Datos;

public class edad {
    public static void main(String[] args) {
        int edad = 0;
        try {
            edad = pideEdad();
            System.out.println("Edad: " + edad);
        } catch (edadErronea e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(edad);
    }

    private static int pideEdad() throws edadErronea {
        int edad = 12;

        if (edad < 0)
            throw new edadErronea();
        if (edad > 99) {
            throw new edadErronea();
        }

        return edad;
    }

}

class edadErronea extends Exception {

    public String toString() {
        return "Edad negativa";

    }

}
