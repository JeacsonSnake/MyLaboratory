import java.util.*;


public class WeatherReport {

	public static void main(String[] args) {
		
	
		printWeatherReport();
		
		
	}
	
	
	
	public static void printWeatherReport()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a single interger value:");
		int a = sc.nextInt();
		
		if (0<=a&&a<=8)
		{
			System.out.println("It is cold outside , bring a jacket!");
		}
		else if (9<=a&&a<=16)
		{
			System.out.println("The sun is coming out , and it is getting warmer");
		}
		else if (17<=a&&a<=32)
		{
			System.out.println("Time to sit beside the pool and relax");
		}
		else if (33<=a&&a<=45)
		{
			System.out.println("Too hot , can't move!");
		}
		else
		{
			System.out.println("Not a valid number!");
		}
			
		
		sc.close();
		
	}
}
