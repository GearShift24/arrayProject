package array.controller;
import array.model.Array;
import array.view.ArrayFrame;

public class ArrayController
{
	private String [] words = {"this","is","the","next","level","of","hipster","the","initilization","sequence"};
	private int [] numbers;
	private Array [] arrays; //declare the arrays up here to use below
	private ArrayFrame appFrame;
	
	public ArrayController()
	{
		showHipsterLevelThree();
		arrays = new Array [5];
		for(int index = 0; index < arrays.length; index++)
		{
			arrays[index] = new Array("Hipster #" + index);
		}
		
		appFrame = new ArrayFrame(this);
	}
	
	public void start()
	{

			for(Array current : arrays)
			{
				System.out.println(current);
			}
			
			
			arrays[0].setName("asdasd");
			
			for(Array current : arrays)
			{
				System.out.println(current);
			}
			
		
			

			
	}
	
	public void impactArrays()
	{
		for(Array currentArray : arrays)
		{
			currentArray.calculateArrayRank(10, -5);
		}
	}

	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,9,7,6,5,4,3,2,1};
	}
	
	public Array[] getArray()
	{
		return arrays;
	}
	
	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
	
	
}
