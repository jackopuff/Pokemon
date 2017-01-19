package poke.model.pokemon;

import java.awt.Color;
import poke.model.Pokemon;
import poke.model.types.Rock;
public class nosePass extends Pokemon implements Rock
{
	public nosePass(String Nick)
	{
		super("NosePass", Nick);
		super.setAttackPoints(40);
		super.setHP(200);
		super.setIndex(1);
		super.setSpeed(15);
		super.setBGColor(Color.DARK_GRAY);
	}
	public int Smash()
	{
		return 70;
	}
	public int EarthQuake()
	{
		return 55;
	}
}
