package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Fire;

public class magmar extends Pokemon implements Fire
{
		public magmar(String Nick)
		{
			super("magmar", Nick);
			super.setAttackPoints(75);
			super.setHP(100);
			super.setIndex(1);
			super.setSpeed(60);
			super.setBGColor(Color.RED);
		}

		public int blaze()
		{
			return 70;
		}
		public int fire()
		{
			return 55;
		}
	}
