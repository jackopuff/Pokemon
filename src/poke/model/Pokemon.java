package poke.model;
import java.awt.Color;

public abstract class Pokemon
{
	private String name;
	private int HP;
	private int index;
	private double speed;
	private int attackPoints;
	private String Nick;
	private Color BGColor;
	
	public Pokemon(String name, String NickName)
	{
		this.name = "No Pokemon";
		this.HP = 0;
		this.index=0;
		this.speed = 0;
		this.attackPoints = 0;
		this.Nick = NickName;
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
	public String getNick()
	{
		return Nick;
	}
	public void setNick(String Nick)
	{
		this.Nick= Nick;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		String description = "This pokemon is" + this.name + ", ID is" + this.index + ", HP is " + HP +
				", Speed is " + this.speed + ", and his nickname is " + this.Nick;
		
		return description;
	}
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	public int getHP()
	{
		return HP;
	}
	public int getIndex()
	{
		return index;
	}
	public void setIndex(int index)
	{
		this.index = index;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setSpeed(double speed)
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
	public void setHP(int HP)
	{
		this.HP = HP;
	}
	public Color getBGColor()
	{
		return BGColor;
	}
	public void setBGColor(Color BGColor)
	{
		this.BGColor = BGColor;
	}
}
