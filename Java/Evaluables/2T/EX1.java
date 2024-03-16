import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        /*
         * Solicitar por pantalla palabras hasta que se escriba la palabra “FIN”. Por
         * cada palabra escrita, almacenarla en un array y llamar a una función donde se
         * le pase este array y que tiene este prototipo: int longitud (string []).
         * (devuelve un entero y recibe un array de cadenas como parámetro de entrada).
         * Esta función devolverá la longitud de la palabra más larga. Fuera de la
         * función se muestra por pantalla el valor que devuelve. No tener en cuenta la
         * palabra “FIN” a la hora de mostrar el resultado y esta se puede escribir en
         * mayúscula, minúscula o parte en cada cosa. En vez de array se puede utilizar
         * un arrayList.
         */
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[0];
        String palabra;
        do {
            System.out.println("Dime una palabra y para terminar escriba fin");
            palabra = sc.next();
            if (!palabra.equalsIgnoreCase("FIN")) {
                String[] temp = new String[palabras.length + 1];
                for (int i = 0; i < palabras.length; i++) {
                    temp[i] = palabras[i];
                }
                temp[temp.length - 1] = palabra;
                palabras = temp;
            }
        } while (!palabra.equalsIgnoreCase("FIN"));

        System.out.println("La palabra mas larga tiene " + longitud(palabras) + " letras.");

        sc.close();

    }

    static int longitud(String[] palabras) {
        int longitud = 0;
        for (String palabra : palabras) {
            if (palabra.length() > longitud) {
                longitud = palabra.length();
            }
        }
        return longitud;
    }

}
