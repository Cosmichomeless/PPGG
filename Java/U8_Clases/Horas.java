
import java.util.Scanner;

/*
  Hora(hora, minuto), que construye un objeto con los datos pasados como parámetros.
• void inc(), que incrementa la hora en un minuto
• boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve true o false según haya sido posible modificar los minutos o no.
• boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.
• String toString(), que devuelve un String con la representación de la hora.
package resuelta08.pkg01;
import java.util.Scanner;
 */
public class Horas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora(11, 30); // las 11:30
        System.out.println(h);
        for (int i = 1; i <= 61; i++) { // incrementamos 61 minutos
            h.inc();
        }
        System.out.println(h); // mostramos
        System.out.println("Escriba una hora:");
        int hora = sc.nextInt();

        boolean cambio = h.setHora(hora); // cambiamos la hora

        if (cambio == true) {
            System.out.println(h);
        } else {
            System.out.println("La hora no se pudo cambiar");
        }
        sc.close();

    }
}
