
import java.util.*;
public class MethodsArrays {

	
	public static void main(String[] args) {
		
		
		int b[] =fillArray();
		int sum = sumArray(b);
		System.out.println("sum = "+sum);
		double avg = avgArray(b);
		System.out.println("avg = "+avg);
		printArray(b);
		
	}
	
	public static int[] fillArray() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		for (int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		sc.close();
		return b;
		
	}
	public static int sumArray(int[] b) {
		
		int sum =0;
		for (int i = 0 ;i<b.length;i++)
		{
			sum+=b[i];
		}
		return sum;
	}
	public static double avgArray(int[] b) {

		int sum =0;
		for (int i = 0 ;i<b.length;i++)
		{
			sum+=b[i];
		}
		double avg =sum/b.length;
		return avg;

	}
	public static void printArray(int[] b) {
		
		for(int i =0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");

		}
	}
}

