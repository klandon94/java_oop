
public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		// TODO Auto-generated method stub
		Pokemon poke = new Pokemon(name, type, health);
		return poke;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return ("Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType());
	}

}
