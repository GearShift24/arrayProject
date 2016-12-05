package array.model;

public class Array
{

	private String name;
	private int arrayRank;
	
	public Array(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "This hispster's name is " + name;
		description += ", and her/his/xyr hipster rank is " + arrayRank;
		
		return description;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void calculateArrayRank()
	{
		arrayRank = (int) (Math.random() * 10);
	}
	
	public void calculateArrayRank(int scale)
	{
		arrayRank = (int) (Math.random() * scale);
	}
	
	public void calculateArrayRank(int scale, int shift)
	{
		arrayRank = (int) (Math.random() * scale) + shift;
	}
	
	public int getArrayRank()
	{
		return arrayRank;
	}
	
}
