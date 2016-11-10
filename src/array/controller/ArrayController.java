package array.controller;
import array.model.Array;

public class ArrayController
{
	private String [] words = {"this","is","the","next","level","of","hipster","the","initilization","sequence"};
	private int [] numbers;
	private Array [] arrays; //delcare the arrays up here to use below
	
	public ArrayController()
	{
		showHipsterLevelThree();
		arrays = new Array [5];
	}
	
	public void start()
	{
			for(int index = 0; index < arrays.length; index++)
			{
				arrays[index] = new Array("Hipster #" + index);
			}
			
			for(Array current : arrays)
			{
				System.out.println(current);
			}
			
//			for(String s: words)
//			{
//				System.out.println(s);
//			}
	}

	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,9,7,6,5,4,3,2,1};
	}
}
