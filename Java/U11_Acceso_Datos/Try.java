package Java.U11_Acceso_Datos;

public class Try {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        int c; // Variable que almacenará el resultado de la división

        try {
            c = 1 / 0; // Intentamos dividir por cero, si se produce error lo capturamos en el catch

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("Fin del programa");
    }
}