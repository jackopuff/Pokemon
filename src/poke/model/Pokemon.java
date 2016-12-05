package poke.model;

public abstract class Pokemon
{
	private String name;
	private int healthPoints;
	private int index;
	private int speed;
	private int attackPoints;
	
	public Pokemon()
	{
		this.name = "No Pokemon";
		this.healthPoints = 0;
		this.index=0;
		this.speed = 0;
		this.attackPoints = 0;
	}
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
	public int getIndex()
	{
		return index;
	}
	public void setIndex(int index)
	{
		this.index = index;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public int getAttackPoints()
	{
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
}
