package array.model;

public class Array
{

	private String name;
	
	public Array(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "This hispster's name is " + name;
		
		return description;
	}
}
