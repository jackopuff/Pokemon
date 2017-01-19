package poke.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import poke.controller.PokeController;
import poke.model.Pokemon;
public class PokePanel extends JPanel {
private PokeController baseController;
	
	private SpringLayout baseLayout;
	
	private Font pokemonFont;
	
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JTextField numberField;
	private JTextField nameField;
	private JTextField nickNameField;
	private JTextField healthField;
	private JTextField speedField;
	private JTextArea advancedArea;
	private JComboBox<String> pokedexSelector;
	private JLabel advancedLabel;
	private JLabel NickLabel;
	private JLabel HPLabel;
	private JLabel speedLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel pokemonLabel;

	public PokePanel(PokeController baseController)
	{
		super();
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/PokeBall.png"));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(20);
		this.nickNameField = new JTextField(20);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10, 25);
		this.advancedLabel = new JLabel("Advanced information");
		this.NickLabel = new JLabel("Nick Name:");
		this.HPLabel = new JLabel("Health Points:");
		this.speedLabel = new JLabel("Speed:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("Name:");
		this.pokemonLabel = new JLabel("Current:", pokemonIcon, JLabel.CENTER);
	
		
		this.setupComponents();
		this.setupPanel();
		this.setupLayout();
		this.setupListeners();
	}
	public void setupComponents(){
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		numberField.setEditable(false);
		nameField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);

		numberField.setFont(this.pokemonFont);
		nameField.setFont(this.pokemonFont);
		nickNameField.setFont(this.pokemonFont);
		healthField.setFont(this.pokemonFont);
		speedField.setFont(this.pokemonFont);
		advancedArea.setFont(this.pokemonFont);
		advancedLabel.setFont(this.pokemonFont);
		NickLabel.setFont(this.pokemonFont);
		HPLabel.setFont(this.pokemonFont);
		speedLabel.setFont(this.pokemonFont);
		numberLabel.setFont(this.pokemonFont);
		nameLabel.setFont(this.pokemonFont);
		pokemonLabel.setFont(this.pokemonFont);
		pokedexSelector.setFont(this.pokemonFont);
		updateButton.setFont(this.pokemonFont);
}
	public void setupPanel(){
		super.setLayout(baseLayout);
		
		this.setSize(900, 900);
		this.setBackground(Color.BLUE);
		
		super.add(updateButton);
		super.add(nameField);
		super.add(nickNameField);
		super.add(healthField);
		super.add(speedField);
		super.add(numberField);
		super.add(advancedArea);
		super.add(pokedexSelector);
		super.add(advancedLabel);
		super.add(NickLabel);
		super.add(HPLabel);
		super.add(speedLabel);
		super.add(numberLabel);
		super.add(nameLabel);
		super.add(pokemonLabel);
}
	public void setupLayout(){
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, nickNameField, 6, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nickNameField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, nickNameField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 6, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, nickNameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nickNameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -44, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -6, SpringLayout.NORTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.NORTH, NickLabel, 5, SpringLayout.NORTH, nickNameField);
		baseLayout.putConstraint(SpringLayout.EAST, NickLabel, 0, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, HPLabel, 5, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, HPLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 5, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, 0, SpringLayout.SOUTH, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 0, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, pokemonLabel);
}
	public void changeImageDisplay(String pokemonName){
		String path = "/poke/view/images/";
		String defaultName = "PokeBall";
		String extension = ".png";
		try{
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + pokemonName + extension));
		}catch(NullPointerException missingFile){
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		pokemonLabel.setText("My name is: " + pokemonName);
		repaint();
}	
	public String getPokemonTypesString(Pokemon pokemon)
		{
		String types = "";
		for(Class<?> inter : pokemon.getClass().getInterfaces())
		{
			types += inter.getSimpleName().toLowerCase().replaceAll("type", "") + " ";
		}
		return types;
	}
	public void setupListeners(){
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ValidInt(healthField.getText()) && ValidInt(speedField.getText())){
					int selected = pokedexSelector.getSelectedIndex();
					baseController.updatePokemon(selected, nickNameField.getText(), Integer.parseInt(healthField.getText()), Integer.parseInt(numberField.getText()),Double.parseDouble(speedField.getText()));
					pokedexSelector.repaint(); // DOESN'T WORK :(
					pokedexSelector.setSelectedIndex(selected);
				}
			}
		});
		
		pokedexSelector.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Pokemon pokemon = baseController.getPokedex().get(pokedexSelector.getSelectedIndex());
				numberField.setText(String.valueOf(pokemon.getIndex()));
				nameField.setText(pokemon.getName());
				nickNameField.setText(pokemon.getNick());
				healthField.setText(String.valueOf(pokemon.getHP()));
				speedField.setText(String.valueOf(pokemon.getSpeed()));
				advancedArea.setText(pokemon.getName() + " is of type(s) " + getPokemonTypesString(pokemon) + "\n\n" );	
				setBackground(pokemon.getBGColor());
				changeImageDisplay(pokemon.getName());
			}
});
	}
	private boolean ValidInt(String input){
		boolean valid = false;
		try{
			Integer.parseInt(input);
			valid = true;
		}catch(NumberFormatException e){
			valid = false;
		}
		return valid;
}
}
