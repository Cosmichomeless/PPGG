import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

;

public class EX5 {
    /*
     * Crear la clase EX5_casa
     * Propiedades
     * Ciudad (string)
     * mCuadrados (int)
     * Crear la clase EX5_propietario
     * Propiedades
     * Nombre
     * Casas (array de EX5_casa)
     * Métodos
     * addCasa(ciudad,mCuadrados): añade un objeto EX5_casa al array
     * saveCasas(): Graba las casas que hay en un array en un archivo que tenga el
     * nombre del propietario.
     * loadCasas(): Carga la clase propietario con las casas grabadas en disco
     * toString():muestra el nombre del propietario y las casas que tiene
     */
    public static void main(String[] args) {

        EX5_propietario p = new EX5_propietario("Carlos");

        p.addCasa("Madrid", 100);

        p.addCasa("Valencia", 120);

        p.addCasa("Burgos", 105);

        System.out.println(p);

        p.saveCasas();

        EX5_propietario p2 = new EX5_propietario("Carlos");

        p2.loadCasas();

        System.out.println(p2);

    }
}

class EX5_casa {
    private String ciudad;
    private int mCuadrados;

    EX5_casa(String ciudad, int mCuadrados) {
        this.ciudad = ciudad;
        this.mCuadrados = mCuadrados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getmCuadrados() {
        return mCuadrados;
    }

    public String toString() {
        return "-> " + ciudad + "(" + mCuadrados + ")";
    }
}

class EX5_propietario {
    private String nombre;
    private ArrayList<EX5_casa> casas = new ArrayList<>();

    EX5_propietario(String nombre) {
        this.nombre = nombre;
    }

    void addCasa(String ciudad, int mCuadrados) {
        casas.add(new EX5_casa(ciudad, mCuadrados));
    }

    void saveCasas() {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("Java//Evaluables//2T//casas.txt", true))) {
            for (EX5_casa casa : casas) {
                wr.write(casa.getCiudad() + "," + casa.getmCuadrados() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al grabar el archivo");
        }
    }

    void loadCasas() {
        try (BufferedReader br = new BufferedReader(new FileReader("Java//Evaluables//2T//casas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] temp = linea.split(",");
                casas.add(new EX5_casa(temp[0], Integer.parseInt(temp[1])));
            }
        } catch (IOException e) {
            System.out.println("No econtrado ");
        }
    }

    public String toString() {
        String resultado = "Propietario: " + nombre + "\n";
        for (EX5_casa casa : casas) {
            resultado += casa + "\n";
        }
        return resultado;
    }
}