public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.addPokemon("Charizard", 100, "Fuego");
        pokedex.addPokemon("Juan", 150, "Tierra");
        pokedex.listPokemon();
    }
}