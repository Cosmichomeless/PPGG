import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class EX4 {
    /*
     * Leer el archivo “números.txt” y mostrar por pantalla todos los números en
     * orden descendente y el máximo, el mínimo y la media.
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Java//Evaluables//2T//numeros.txt"));
        ArrayList<Integer> numeros = new ArrayList<>();
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");

            for (String parte : partes) {
                double num = Integer.parseInt(parte);
                numeros.add((int) num);
            }
        }
        reader.close();

        double suma = 0;
        double media = 0;
        double maximo = Collections.max(numeros);
        double minimo = Collections.min(numeros);

        for (double num : numeros) {
            media += num;
        }
        for (double num : numeros) {
            suma += num;
        }
        media /= numeros.size();
        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println(numeros);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
