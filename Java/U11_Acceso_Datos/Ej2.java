package Java.U11_Acceso_Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pedir nombre y edad
        // guardar en archivo
        // leer archivo ordenado

        escribirArchivo(sc);
        leerArchivo(sc);
    }

    private static void leerArchivo(Scanner sc) {
        ArrayList<Persona> personas = new ArrayList<>();
        System.out.println("Dime cual es el nombre del archivo");
        String archivo = sc.next();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Java/U11_Acceso_Datos/" + archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                personas.add(new Persona(nombre, edad));
                System.out.println("Nombre: " + nombre + " Edad: " + edad);
            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            System.out.println("Archivo cerrado");
        }
    }

    private static void escribirArchivo(Scanner sc) {
        System.out.println("Dime cual es el nombre del archivo: ");
        String archivo = sc.nextLine();

        String nombre;

        try (BufferedWriter wr = new BufferedWriter(new FileWriter("Java/U11_Acceso_Datos/" + archivo, true))) {
            int opcion;
            do {
                System.out.println(1 + " - Añadir persona");
                System.out.println(2 + " - Fin");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Dime el nombre: ");
                        nombre = sc.next();
                        System.out.println("Dime la edad: ");
                        int edad = sc.nextInt();
                        wr.write(nombre + ":" + edad);
                        wr.newLine();
                    }
                    default -> {
                        System.out.println("fin");
                    }
                }
            } while (opcion != 2);

        } catch (IOException e) {
            e.getMessage();
        } finally {
            System.out.println("Archivo cerrado");
        }
    }

}

@SuppressWarnings("unused")
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
