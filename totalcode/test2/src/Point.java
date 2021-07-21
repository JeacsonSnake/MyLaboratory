public class Point
{
	//Instance variables
	private int x;
	private int y;
	
	//Constructors
	public Point()
	{
		//set default values
		x = 0;
		y = 0;
	} 
		
	public Point(int num1 , int num2)
	{
		x = num1; //set values equal to inputted values
		y = num2;
	}
	
	//Setter MEthods
	public void setX(int num)
	{
		x = num;
	}
	public void setY(int num)
	{
		y = num;
	}
	//Getter methods
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;		
	}
	
	//functionality in the form of methods
	public void printPoints()
	{
		System.out.println("The coordinates are: " + getX() + " and " + getY());
	}
	
	
}