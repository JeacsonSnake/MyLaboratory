import java.util.*;
public class DoubleSize {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input two value:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		determinesize(a,b);
		sc.close();
	}
	
	
	
	public static void determinesize(double a,double b)
	{
		
		
		if(a<b)
		{
			System.out.println(a+"is the smallest.");
			System.out.println(b+"is the biggest");
		}
		else if(a>b)	
		{
			System.out.println(b+"is the smallest.");
			System.out.println(a+"is the biggest");
		}
		else
		{
			System.out.println("They contain the same value.");
			
		}
			
			
	}

	
	
}
