package array.view;

import javax.swing.JFrame;
import array.controller.ArrayController;
import java.awt.Dimension;


public class ArrayFrame extends JFrame
{
	private ArrayController baseController;
	private ArrayPanel appPanel;
	
	public ArrayFrame(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new ArrayPanel(baseController);
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("this is a crappy app");
		this.setSize(new Dimension(800,800));
		this.setResizable(false);
		this.setVisible(true);
	}
}
