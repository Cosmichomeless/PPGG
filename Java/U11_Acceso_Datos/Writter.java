package Java.U11_Acceso_Datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {
    public static void main(String[] args) {
        BufferedWriter wr = null;
        try {
            wr = new BufferedWriter(new FileWriter("Java//U11_Acceso_Datos//j.txt"));

            String linea = "Vamos a realizar una prueba de escritura en un archivo";

            for (int i = 0; i < linea.length(); i++) {
                wr.write(linea.charAt(i));
                //wr.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                wr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Archivo escrito");

    }

}
