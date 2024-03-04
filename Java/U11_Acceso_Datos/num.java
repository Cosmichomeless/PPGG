package Java.U11_Acceso_Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class num {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Java//U11_Acceso_Datos//numeros.txt"));
        ArrayList<Double> numeros = new ArrayList<>();
        String linea;

        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");

            for (String parte : partes) {
                double num = Double.parseDouble(parte);
                numeros.add(num);
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
        
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}