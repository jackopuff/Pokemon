package poke.model.pokemon;
import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Poison;
public class grimer extends Pokemon implements Poison
{
	public grimer(String Nick)
	{
		super("Grimer", Nick);
		super.setAttackPoints(100);
		super.setHP(70);
		super.setIndex(1);
		super.setSpeed(20);
		super.setBGColor(Color.MAGENTA);
	}
	public int sting()
	{
		return 40;
	}
	public int gas()
	{
		return 50;
	}
}
