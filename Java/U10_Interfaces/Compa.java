package Java.U10_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("unused")
public class Compa {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Persona p = new Persona();
        p.nombre = "Amanda";
        p.id = 3;

        Persona p2 = new Persona();
        p2.nombre = "Felipe";
        p2.id = 1;

        Persona p3 = new Persona();
        p3.nombre = "Jesus";
        p3.id = 2;

        // ArrayList<Persona> lista = new ArrayList<Persona>();

        // lista.add(p);
        // lista.add(p2);
        // lista.add(p3);

        // System.out.println(lista);
        // lista.sort(null);
        // System.out.println(lista);

        Persona[] tabla = new Persona[3];
        tabla[0] = p;
        tabla[1] = p2;
        tabla[2] = p3;

        System.out.println(Arrays.toString(tabla));
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));

        PorId ordenId = new PorId();
        Arrays.sort(tabla, ordenId);
        System.out.println(Arrays.toString(tabla));

        PorNombre ordenNombre = new PorNombre();
        Arrays.sort(tabla, ordenNombre);
        System.out.println(Arrays.toString(tabla));

    }

}

@SuppressWarnings("rawtypes")
class Persona implements Comparable {
    String nombre;
    int id;

    public String toString() {
        return "Nombre: " + this.nombre + " id: " + this.id;
    }

    public int compareTo(Object o) {
        Persona p = (Persona) o;
        /*
         * if (this.id < p.id) {
         * return -1;
         * } else {
         * if (this.id > p.id) {
         * return 1;
         * }
         */

        // return this.nombre.compareTo(p.nombre);
        return p.id - this.id;
    }
}

@SuppressWarnings("rawtypes")
class PorId implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Persona) o1).id - ((Persona) o2).id;
    }

}

class PorNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Persona) o1).nombre.compareTo(((Persona) o2).nombre);
    }

}