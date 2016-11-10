package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;

public class ArrayPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private ArrayController baseController;
	
	public ArrayPanel(ArrayController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("click the button");
		this.infoLabel =  new JLabel("wow words!");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 138, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -89, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 132, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, infoLabel, -194, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 193, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, dropDown, -29, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		
	}
	

}
