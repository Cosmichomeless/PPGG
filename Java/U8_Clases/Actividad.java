package Java.U8_Clases;

import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre:");
        String n, s;
        n = sc.nextLine();
        do {
            System.out.println("Introduce sexo");
            s = sc.nextLine();
        } while (!s.equals("MUJER") && !s.equals("HOMBRE") && !s.equals(""));
        if (s.equals(""))
            s = Genero.NSNC.toString();
        Persona p = new Persona(n, Genero.valueOf(s));
        p.mostrar();
        sc.close();
    }
}

enum Genero {
    MUJER, HOMBRE, NSNC
}

class Persona {
    private String nombre;
    private Genero sexo;

    Persona(String n, Genero s) {
        this.nombre = n;
        this.sexo = s;
    }

    void mostrar() {
        System.out.println("Nombre: " + this.nombre + " Sexo: " + this.sexo);
    }
}
