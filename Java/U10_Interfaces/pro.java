package Java.U10_Interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class pro {

    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "PC";
        p.codigo = 3;
        p.precio = 1005.99;

        Producto p2 = new Producto();
        p2.nombre = "Movil";
        p2.codigo = 1;
        p2.precio = 150.25;

        Producto p3 = new Producto();
        p3.nombre = "Portatil";
        p3.codigo = 2;
        p3.precio = 300.99;

        ArrayList<Producto> lista = new ArrayList<Producto>();
        lista.add(p);
        lista.add(p2);
        lista.add(p3);

        System.out.println(lista);
        lista.sort(null);
        System.out.println("Ordenado por precio");
        System.out.println(lista);
        System.out.println("Ordenado por codigo");
        lista.sort(new PorCodigo());
        System.out.println(lista);
        System.out.println("Ordenado por nombre");
        lista.sort(new PorNombre());
        System.out.println(lista);

    }

}

class Producto implements Comparable {
    String nombre;
    double precio;
    int codigo;

    @Override
    public String toString() {
        return "Producto [codigo=" + this.codigo + ", nombre=" + this.nombre + ", precio=" + this.precio + "]";
    }

    @Override
    public int compareTo(Object arg0) {
        Producto p = (Producto) arg0;

        return (int) (this.precio - p.precio);
    }

}

class PorCodigo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return (((Producto) o1).codigo - ((Producto) o2).codigo);

    }
}

class PorNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Producto) o1).nombre.compareTo(((Producto) o2).nombre);
    }

}