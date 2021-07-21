import java.util.*;

public class OddEven {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a single value:");
		int a = sc.nextInt();
		if (a<0)
		{
			System.out.println("Not a valid entry!");
			
		}
		else
		{
			int d = isEven(a);
			switch (d) {
			case 0:
			{
				System.out.println("Odd");
				break;
			}
			case 1:
			{
				System.out.println("Even");
				break;
			}
			default:
				break;
			}
		}
		sc.close();
	}
	
	
	
	private static int isEven(int a) {
	
		int n = 0;
		if (a%2==1)
		{
			n=0;
			
		}
		if (a%2==0)
		{
			n=1;
			
		}
		return n;
}



	

}
