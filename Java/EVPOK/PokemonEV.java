import java.util.ArrayList;

public class PokemonEV {
    public static void main(String[] args) {

        Pokemon pika = new Pokemon("Pikachu");

        pika.ficha();

        Pokemon charm = new Pokemon("Charmander", 100, "Fuego");

        charm.ficha();

        Gimnasio g1 = new Gimnasio("Gimnasio Pueblo Pirotin", "Katy");

        g1.addPokemon(pika);
        g1.addPokemon(charm);

        System.out.println("Cantidad gimnasios:" + Gimnasio.cantidadGimnasios());
        System.out.println("Cantidad pokemons en " + g1.getNombre() + ": " + g1.cantidadPokemon());

        g1.ficha();

        Gimnasio g2 = new Gimnasio("Gimnasio de Altamia", "Brais");

        Pokemon riachu = new Pokemon("Riachu", 200, "Electrico");
        Pokemon squirtle = new Pokemon("Squirtle", 100, "Agua");
        Pokemon gengar = new Pokemon("Gengar", 100, "Agua");

        g2.addPokemon(riachu);
        g2.addPokemon(squirtle);
        g2.addPokemon(gengar);

        System.out.println("Cantidad gimnasios:" + Gimnasio.cantidadGimnasios());
        System.out.println("Cantidad pokemons en " + g2.getNombre() + ": " + g2.cantidadPokemon());
        g2.ficha();
    }
}

class Gimnasio {

    String nombre;
    String lider;
    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private static int cantidadGimnasios;

    Gimnasio(String nombre, String lider) {
        this.nombre = nombre;
        this.lider = lider;
        cantidadGimnasios++;
    }

    void addPokemon(Pokemon p) {
        pokemons.add(p); // Añade un pokemon a los pokemons del gimnasio
    }

    String getNombre() {
        return nombre;
        // Dice el nombre del gimnasio
    }

    String getLider() {
        return lider;
        // Dice el líder del gimnasio
    }

    static int cantidadGimnasios() {
        // dice la cantidad de gimnasios creados

        return cantidadGimnasios;
    }

    int cantidadPokemon() {
        // Devuelve el número de pokemons del gimnasio
        int cantidad;
        cantidad = pokemons.size();
        return cantidad;
    }

    void ficha() {

        System.out.println("------------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Lider: " + this.lider);
        System.out.println("------------------------------");
        for (Pokemon recorre : pokemons) {
            recorre.ficha();
        }
        // aqui hay que imprimir los pokemons 1 a 1

    }

}

class Pokemon {

    String nombre;
    int nivel; // de 1 a 100
    private Pokemon.Tipo tipo;

    enum Tipo {
        Indeterminado, Fuego, Agua, Electrico, Bicho, Acero
    }

    Pokemon(String nombre, int nivel, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        if (nivel < 1 || nivel > 100) {
            this.nivel = 1;
        }
        this.tipo = Tipo.valueOf(tipo);
    }

    Pokemon(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.tipo = Tipo.Indeterminado;
    }

    void ficha() {
        System.out.println("------------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("------------------------------");
    }

}