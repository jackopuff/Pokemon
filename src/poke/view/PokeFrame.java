package poke.view;
import java.awt.Dimension;
import javax.swing.JFrame;
import poke.controller.PokeController;
public class PokeFrame extends JFrame
{
private PokeController baseController;
private PokePanel panel;

public PokeFrame(PokeController baseController)
{
	super();
	this.baseController = baseController;
	this.panel = new PokePanel(baseController);
	this.setupFrame();
}
private void setupFrame()
{
	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	super.setSize(900,900);
	super.setMinimumSize(new Dimension( 400,300));
	super.setTitle("Pokedex");
	super.setVisible(true);
}
public PokePanel getPanel()
{
	return this.panel;
}
}
