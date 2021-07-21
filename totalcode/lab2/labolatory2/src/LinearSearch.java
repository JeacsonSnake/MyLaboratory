import java.util.*;
public class LinearSearch {



    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double  a = sc.nextDouble();
		double b[] = new double[(int)a];
		for (int i=0;i<a;i++)
		{
			b[i]=sc.nextDouble();
		}
		double c = sc.nextDouble();
		sc.close();
        boolean t = findElement(c,b);
		if(t)
		{
			System.out.println(c+" was found in the array.");
		}
		else 
		{
			System.out.println(c+" was NOT found in the array.");
		}
	}
	
	
	public static boolean findElement(double c,double []b) {
		boolean t = false;
		for(int i =0;i<b.length;i++)
		{
			if(b[i]==c)
			{
				t=true;
				continue;
			}
			else continue;
		}
		return t;
	}
}
