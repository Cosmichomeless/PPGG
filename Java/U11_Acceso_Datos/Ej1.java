package Java.U11_Acceso_Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) throws IOException {
        // pedir nombre de archivo y texto interior
        // pedir nombre archivo y mostrar contenido
        Scanner sc = new Scanner(System.in);

        escribirArchivo(sc);
        leerArchivo(sc);
    }

    private static void leerArchivo(Scanner sc) {
        System.out.println("Dime cual es el nombre del archivo");
        String texto = sc.nextLine();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Java/U11_Acceso_Datos/" + texto));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("----------------------------------------");
                System.out.println(linea);
                System.out.println("----------------------------------------");

            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    private static void escribirArchivo(Scanner sc) {
        System.out.println("Dime cual es el nombre del archivo: ");
        String archivo = sc.nextLine();
        System.out.println("Dime el texto que quieres escribir: ");
        String texto = sc.nextLine();
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("Java/U11_Acceso_Datos/" + archivo, true))) {
            wr.write(texto);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            System.out.println("Archivo cerrado");
        }

    }

}
