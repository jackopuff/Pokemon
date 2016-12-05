package poke.model;

public abstract class Pokemon
{
	private String name;
	private int healthPoints;
	private int index;
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "This Pokemon has the following types:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index ++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		for (String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".","");
			pokemonTypes += temp + "\n";
		}
		return pokemonTypes;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		String description = "This pokemon is";
		
		return description;
	}
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	public int getHealthPoints()
	{
		return healthPoints;
	}
}
