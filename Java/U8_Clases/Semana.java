package Java.U8_Clases;

public class Semana {
    public static void main(String[] args) {

        DiaDeLaSemana l = DiaDeLaSemana.Lunes;
        DiaDeLaSemana M = DiaDeLaSemana.Martes; // Enumerados
        DiaDeLaSemana X = DiaDeLaSemana.Miercoles; // Enumerados
        DiaDeLaSemana J = DiaDeLaSemana.Jueves; // Enumerados
        DiaDeLaSemana V = DiaDeLaSemana.Viernes; // Enumerados
        DiaDeLaSemana S = DiaDeLaSemana.Sabado; // Enumerados
        DiaDeLaSemana D = DiaDeLaSemana.Domingo; // Enumerados

        System.out.println(l);
        System.out.println(M);
        System.out.println(X);
        System.out.println(J);
        System.out.println(V);
        System.out.println(S);
        System.out.println(D);

    }

    enum DiaDeLaSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }; // Enumerado de los días de la semana

}
