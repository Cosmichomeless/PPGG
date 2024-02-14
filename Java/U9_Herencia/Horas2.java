package Java.U9_Herencia;

import java.util.Scanner;

/*
 * A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los
segundos. Además de los métodos heredados de Hora, dispondrá de:
HoraExacta(hora, minuto, segundo), que construye un objeto con los datos pasados
como parámetros.
setSegundo(valor), que asigna, si está comprendido entre 0 y 59, el valor indicado a los
segundos.
inc(), que incrementa la hora en un segundo.
 */

class Horas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoraExacta r = new HoraExacta(11, 15, 23);
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escriba los segundos: ");
        int segundos = sc.nextInt();
        if (r.setSegundos(segundos)) {
            System.out.println(r);
        } else {
            System.out.println("No es posible cambiar los segundos");
        }

        
        sc.close();
    }

}

class Hora {
    int hora;
    int minuto;

    public Hora(int i, int j) {
        this.hora = i;
        this.minuto = j;

    }

    public boolean setHora(int hora2) {

        this.hora = hora2;
        if (this.hora >= 0 && this.hora <= 23) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinuto(int min2) {
        this.minuto = min2;
        if (this.minuto >= 0 && this.minuto <= 59) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        return "Hora: " + this.hora + " Minuto: " + this.minuto;
    }
}

class HoraExacta extends Hora {
    int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        this.segundo = segundo;
    }

    public boolean setSegundos(int segundos) {
        this.segundo = segundos;
        if (segundos >= 0 && segundos <= 59) {
            this.segundo = segundos;
            return true;
        } else {
            return false;
        }
    }

    public void inc() {
        if (segundo != 59) {
            segundo++;
        } else if (minuto != 59) {
            minuto++;
            segundo = 0;
        } else if (hora != 23) {
            hora++;
            minuto = 0;
            segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;

        }
    }
    public String toString() {
        return "Hora: " + this.hora + " Minuto: " + this.minuto + " Segundo: " + this.segundo;
    }
}