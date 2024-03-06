package Java.Evaluables.EV3;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

    /*
     * Si el usuario pulsa 1:
     * Se solicita un nombre y una antigüedad (número de años. No tiene decimales)
     * Si el usuario pulsa 2:
     * Se solicita el nombre de un usuario y se busca en los ya introducidos. Si no
     * se encuentra se
     * saca un mensaje diciendo “cliente no encontrado”. Si se encuentra, se saca el
     * mensaje “Seguro
     * quieres borrarlo?”. Si el usuario pulsa S, se borra, si pulsa N, no se borra.
     * Si el usuario pulsa 3:
     * Se solicita el nombre de un usuario y se busca en los ya introducidos. Si no
     * se encuentra se
     * saca un mensaje diciendo “cliente no encontrado”. Si se encuentra, se muestra
     * la antigüedad y
     * se pide una nueva. A continuación, se modifica la antigüedad del cliente.
     * Si el usuario pulsa 4:
     * Se muestra una lista con los clientes y sus antigüedades
     * Si el usuario pulsa 5:
     * Se muestra la media de las antigüedades de los clientes, que cliente tiene la
     * mayor antigüedad
     * y cuanto es, y que cliente tiene la menor antigüedad y cual es.
     * Si el usuario pulsa 9:
     * Se finaliza el programa.
     * Cada vez que se pulsa una opción (excepto 9), después de realizar las
     * operaciones que tiene
     * que hacer, se vuelve a mostrar el menú para que el usuario pueda hacer otra
     * operación
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Nombres = new ArrayList<>();
        ArrayList<Integer> Ant = new ArrayList<>();

        int opcion;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("1. Alta cliente");
            System.out.println("2. Baja cliente");
            System.out.println("3. Modificacion cliente");
            System.out.println("4. Consulta clientes");
            System.out.println("5. Estadisticas");
            System.out.println("9. Salir");
            System.out.println("-----------------------------------------------");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> AltaCliente(Nombres, Ant, sc);

                case 2 -> BajaCliente(Nombres, Ant, sc);

                case 3 -> ModificaCliente(Nombres, Ant, sc);

                case 4 -> ConsultaCliente(Nombres, Ant, sc);

                case 5 -> Estadisticas(Nombres, Ant, sc);

                case 9 ->
                    System.out.println("Programa finalizado.");

                default ->
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);
        sc.close();
    }

    public static void AltaCliente(ArrayList<String> Nombres, ArrayList<Integer> Ant, Scanner sc) {
        System.out.println("-----------------------------------------------");

        System.out.println("Introduzca el nombre del Cliente ");
        String N = sc.next();
        Nombres.add(N);
        System.out.println("-----------------------------------------------");

        System.out.println("Introduce la antiguedad");
        int a = sc.nextInt();
        System.out.println("-----------------------------------------------");

        Ant.add(a);
        System.out.println("Perfecto cliente dado de alta");
    }

    public static void BajaCliente(ArrayList<String> Nombres, ArrayList<Integer> Ant, Scanner sc) {
        System.out.println("Indica cual cliente quieres borrar");

        String busqueda = sc.next();

        boolean existe = Nombres.contains(busqueda);

        if (existe == false) {
            System.out.println("-----------------------------------------------");
            System.out.println("Cliente no encontrado");
            System.out.println("-----------------------------------------------");

        } else {
            System.out.println("Seguro que quieres borrarlo  S/N");

            char eli = sc.next().charAt(0);

            if (eli == 'S' || eli == 's') {
                int index = Nombres.indexOf(busqueda);
                Nombres.remove(index);
                Ant.remove(index);
                System.out.println("-----------------------------------------------");
                System.out.println("Cliente borrado");
                System.out.println("-----------------------------------------------");

            } else if (eli == 'N' || eli == 'n') {
                System.out.println("-----------------------------------------------");
                System.out.println("Borrado cancelado");
                System.out.println("-----------------------------------------------");

            }
        }
    }

    public static void ModificaCliente(ArrayList<String> Nombres, ArrayList<Integer> Ant, Scanner sc) {
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el nombre del cliente");
        System.out.println("-----------------------------------------------");
        String busqueda = sc.next();

        boolean existe = Nombres.contains(busqueda);
        if (existe == false) {
            System.out.println("-----------------------------------------------");
            System.out.println("Cliente no encontrado");
            System.out.println("-----------------------------------------------");

        } else {
            System.out.println(Nombres.get(Nombres.indexOf(busqueda)) + " tiene " + Ant.get(busqueda.indexOf(busqueda))
                    + " años de antiguedad");
            System.out.println("Introduzca la nueva antiguedad");
            int nueva = sc.nextInt();
            Ant.set(Nombres.indexOf(busqueda), nueva);

        }

    }

    public static void ConsultaCliente(ArrayList<String> Nombres, ArrayList<Integer> Ant, Scanner sc) {
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el nombre del cliente");
        System.out.println("-----------------------------------------------");

        if (Nombres.size() != 0) {
            for (int i = 0; i < Nombres.size(); i++) {
                System.out.println("********************************************");
                System.out.println(Nombres.get(i) + " tiene " + Ant.get(i));
                System.out.println("********************************************");
            }
        } else {
            System.out.println("No tiene clientes en la aplicacion");
        }
    }

    public static void Estadisticas(ArrayList<String> Nombres, ArrayList<Integer> Ant, Scanner sc) {

        int suma = 0;
        double media = 0;

        for (int i = 0; i < Ant.size(); i++) {
            suma = suma + Ant.get(i);
        }
        media = suma / Ant.size();
        int max = Ant.get(0);
        int maxI = 0;
        int min = Ant.get(0);
        int minI = 0;

        for (int value : Ant) {
            if (value > max) {
                max = value;
                maxI = Ant.indexOf(max);

            } else if (value < min) {
                min = value;
                minI = Ant.indexOf(min);
            }
        }

        System.out.println("-----------------------------------------------");

        System.out.println("La media de las edades de sus clientes es " + media);
        System.out.println();

        System.out.println(Nombres.get(minI) + " es el cliente mas nuevo y tiene " + min + " de antiguedad");
        System.out.println();

        System.out.println(Nombres.get(maxI) + " es el cliente mas antiguo y tiene " + max + " de antiguedad");
    }
}
