package poke.model.pokemon;

import java.awt.Color;
import poke.model.Pokemon;
import poke.model.types.Poison;

public class trubbish extends Pokemon implements Poison
{
	public trubbish(String Nick)
	{
		super("Trubbish", Nick);
		super.setAttackPoints(20);
		super.setHP(20);
		super.setIndex(1);
		super.setSpeed(90);
		super.setBGColor(Color.DARK_GRAY);
	}
	public int sting()
	{
		return 70;
	}
	public int gas()
	{
		return 55;
	}
}
