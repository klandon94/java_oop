
public class Pokemon {
	private String name;
	private int health;
	private String type;
	public static int count;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public static int getCount() {
		return count;
	}


	public void attackPokemon(Pokemon poke) {
		poke.health -= 10;
	}
}
