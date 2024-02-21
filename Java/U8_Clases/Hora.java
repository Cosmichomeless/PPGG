
public class Hora {
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

    public void inc() {

        if (minuto != 59) {
            minuto++;
        } else if (hora != 23) {
            hora++;
            minuto = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
        }

    }

    public String toString() {
        return "Hora: " + this.hora + " Minuto: " + this.minuto;
    }
}