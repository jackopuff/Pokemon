package poke.controller;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOPtionPane;
import poke.view.*;
import poke.model.Pokemon;
import poke.model.pokemon.mrMime;
import poke.model.pokemon.nosePass;
import poke.model.pokemon.trubbish;
import poke.model.pokemon.magmar;
import poke.model.pokemon.grimer;
public class PokeController
{
	public PokeController()
	{
		private PokeFrame pokeFrame;
		private ArrayList<Pokemon> pokedex;
		
		public PokeController()
		{
			this.pokedex = new ArrayList<Pokemon>();
			this.buildPokedex();
			pokeFrame = new PokeFrame(this);
		}
	}
	public void start()
	{
		JOptionPane.showMessageDialog(pokemonFrame,"Welcome", "Pokemon", JOptionPane.OK_OPTION, new ImageIcon(getClass().getResource("/poke/view/images/Pokeball.png")));
	}
	public void buildPokedex()
	{
		pokedex.add(new mrMime("creepy dude"));
		pokedex.add(new nosePass("big nose boi"));
		pokedex.add(new trubbish("da trash mannn"));
		pokedex.add(new magmar("spicy boi"));
		pokedex.add(new grimer("stink mcStinkerton"));
		
	}
	public String[] buildPokeText()
	{
		String[] PokeNames = new String[pokedex.size()];
		for(int i = 1; i<=pokedex.size(); i++)
		{
			Pokemon pokemon =pokedex.get(i);
			PokeNames[i] = pokemon.getName() + "   " + pokemon.getNick();
		}
		return PokeNames;
	}
	public void updatePokemon(int i, String name, int HP, int AP, int speed)
	{
		Pokemon pokemon = pokedex.get(i);
		pokemon.setName(name);
		pokemon.setSpeed(speed);
		pokemon.setHealthPoints(HP);
		pokemon.setAttackPoints(AP);
		
	}
	public ArrayList<Pokemon> getPokedex()
	{
		return this.pokedex;
	}
	public PokeFrame getBaseFrame()
	{
		return this.pokeFrame;
	}
}
