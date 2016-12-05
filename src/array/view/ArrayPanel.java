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
		this.dropDown = new JComboBox(baseController.getArray());
	

		
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
	{	baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 58, SpringLayout.SOUTH, myButton);
	baseLayout.putConstraint(SpringLayout.EAST, dropDown, -119, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 79, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, infoLabel, -109, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -156, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, myButton, -67, SpringLayout.EAST, this);
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
		
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.impactArrays();
				repaint();
			}
		});
	}
	

}
