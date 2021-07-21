import java.util.*;

public class StarTriangle {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a single interger value:");
		int a = sc.nextInt();
		printStarTriangle(a);
		sc.close();
	}
	
	
	
	public static void printStarTriangle(int a)
	{
		
		
		for (int j=0;j<a;j++)
		{
			for(int i=0;i<j+1;i++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}

	
	
}
