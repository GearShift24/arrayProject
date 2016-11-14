package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;

import array.controller.ArrayController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




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
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -194, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, dropDown);
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -38, SpringLayout.NORTH, dropDown);
		baseLayout.putConstraint(SpringLayout.SOUTH, dropDown, -27, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -116, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 114, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				infoLabel.setText(dropDown.getSelectedItem().toString());
				
			}
		});
	}
	

}
