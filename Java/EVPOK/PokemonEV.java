import java.util.ArrayList;

public class PokemonEV {
    public static void main(String[] args) {

        Pokemon Pikachu = new Pokemon("Pikachu");

        Pikachu.ficha();

        Pokemon charm = new Pokemon("Charmander", 100, "Fuego");

        charm.ficha();

        Gimnasio g1 = new Gimnasio("Gimnasio Pueblo Pirotin", "Katy");

        g1.addPokemon(Pikachu);
        g1.addPokemon(charm);

        System.out.println("Cantidad gimnasios:" + Gimnasio.cantidadGimnasios());
        System.out.println("Cantidad pokemons en " + g1.getNombre() + ": " + g1.cantidadPokemon());

        g1.ficha();

        Gimnasio g2 = new Gimnasio("Gimnasio de Altamia", "Brais");

        Pokemon Raichu = new Pokemon("Raichu", 200, "Electrico");
        Pokemon squirtle = new Pokemon("Squirtle", 100, "Agua");
        Pokemon gengar = new Pokemon("Gengar", 100, "agua");

        g2.addPokemon(Raichu);
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

    void addPokemon(Pokemon p) {// Añade un pokemon a los pokemons del gimnasio
        pokemons.add(p);
    }

    String getNombre() {// Dice el nombre del gimnasio
        return nombre;

    }

    String getLider() { // Dice el líder del gimnasio
        return lider;

    }

    static int cantidadGimnasios() { // dice la cantidad de gimnasios creados
        return cantidadGimnasios;
    }

    int cantidadPokemon() { // Devuelve el número de pokemons del gimnasio
        int cantidad;
        cantidad = pokemons.size();
        return cantidad;
    }

    void ficha() { // Imprime la ficha del gimnasio

        System.out.println("------------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Lider: " + this.lider);
        System.out.println("------------------------------");
        for (Pokemon recorre : pokemons) {// aqui hay que imprimir los pokemons 1 a 1
            recorre.ficha();
        }

    }

}

class Pokemon {

    String nombre;
    int nivel; // de 1 a 100
    private Tipo tipo;

    enum Tipo {
        Indeterminado, Fuego, Agua, Electrico, Bicho, Acero
    }

    Pokemon(String nombre, int nivel, String tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        tipo = tipo.substring(0, 1).toUpperCase() + tipo.substring(1).toLowerCase();
        this.tipo = Tipo.valueOf(tipo);
    }

    Pokemon(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.tipo = Tipo.Indeterminado;
    }

    void ficha() {

        if (this.nivel < 1 || this.nivel > 100) {
            System.out.println("------------------------------");
            System.out.println("Nombre: " + this.nombre);
            this.nivel = 1;
            System.out.println("Nivel invalido, por defecto nivel: " + this.nivel);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("------------------------------");

        } else {
            System.out.println("------------------------------");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Nivel: " + this.nivel);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("------------------------------");
        }

    }

}
