package Java.U11_Acceso_Datos;

import java.io.*;
import java.util.*;

public class num {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Java//U11_Acceso_Datos//numeros.txt"));
        List<Double> numeros = new ArrayList<>();
        String linea;

        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");
            for (String parte : partes) {
                double num = Double.parseDouble(parte);
                numeros.add(num);
            }
        }
        reader.close();

        double maximo = Collections.max(numeros);
        double minimo = Collections.min(numeros);
        double media = 0;
        for (double num : numeros) {
            media += num;
        }
        media /= numeros.size();

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Media: " + media);
    }
}