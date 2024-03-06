package Java.U11_Acceso_Datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {
    public static void main(String[] args) {

        try (BufferedWriter wr = new BufferedWriter(new FileWriter("Java//U11_Acceso_Datos//j.txt", true))) {
            // wr = new BufferedWriter(new FileWriter("Java//U11_Acceso_Datos//j.txt",
            // true));
            String linea = "Vamos a realizar una prueba de escritura en un archivo";
            for (int i = 0; i < linea.length(); i++) {
                wr.write(linea.charAt(i));
            }
            wr.newLine();
            String linea2 = "Vamos a realizar una prueba de escritura en un archivo";
            wr.write(linea2);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            System.out.println("Archivo cerrado");
        }
        System.out.println("Archivo escrito");

    }

}
