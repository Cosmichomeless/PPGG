package Java.U11_Acceso_Datos;

public class Try {
    public static void main(String[] args) {

        int c;
        c = 1 / 0;

        try {
            c = 1 / 0; // Intentamos dividir por cero, si se produce error lo capturamos en el catch
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}