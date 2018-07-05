import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons;
	
	public Pokedex() {
		myPokemons = new ArrayList<Pokemon>();
	}
	
	public void addPokemon(Pokemon poke) {
		myPokemons.add(poke);
	}
	
	public void listPokemon() {
		System.out.println("Pokemon in Pokedex:");
		for (Pokemon x:myPokemons) {
			System.out.print(x.getName() + " ");
		}
		System.out.println("");
	}
}
