
public class PokemonTest {

	public static void main(String[] args) {
		Pokedex x = new Pokedex();
		Pokemon poke1 = x.createPokemon("Squirtle", 50, "Water");
		Pokemon poke2 = x.createPokemon("Bulbasaur", 50, "Grass");
		Pokemon poke3 = x.createPokemon("Charmander", 50, "Fire");
		
		System.out.println(poke1.getName());
		System.out.println(x.pokemonInfo(poke1));
		
		x.addPokemon(poke1);
		x.addPokemon(poke2);
		x.addPokemon(poke3);
		x.addPokemon(new Pokemon("Mewto", "psychic", 200));
		x.listPokemon();
		
		poke2.attackPokemon(poke1);
		System.out.println(poke1.getHealth());
		
		System.out.println(Pokemon.getCount());
	}

}
