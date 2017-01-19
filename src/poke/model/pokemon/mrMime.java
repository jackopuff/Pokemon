package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Psychic;

public class mrMime extends Pokemon implements Psychic
{
	public mrMime(String Nick)
	{
		super("Mr. Mime", Nick);
		super.setAttackPoints(80);
		super.setHP(165);
		super.setIndex(1);
		super.setSpeed(80);
		super.setBGColor(Color.PINK);
	}
	public int Confusion()
	{
		return 70;
	}
	public int PsyBeam()
	{
		return 55;
	}
}

