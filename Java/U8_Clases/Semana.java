
import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {

        DiaDeLaSemana L = DiaDeLaSemana.Lunes; // Enumerados en java, se crean a partir de una clase llamada "enum

        System.out.println(L);

        Scanner sc = new Scanner(System.in);
        String dia = sc.next();
        L = DiaDeLaSemana.valueOf(dia); // Conversión de string a enum
        System.out.println("Hoy es " + L);
        System.out.println(L.name());
        sc.close();

    }
}

enum DiaDeLaSemana {
    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
}; // Enumerado de los días de la semana
