package Java.U11_Acceso_Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("Java//U11_Acceso_Datos//j.txt"));
            String s = in.readLine();
            while (s != null) {
                System.out.println(s);
                s = in.readLine();

            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
    }
}
