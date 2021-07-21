import java.util.*;
class Factorial {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n>m)
		{
			int u;
			u=n;
			n=m;
			m=u;
		}
		if (n>0&&m>0)
			getFactorial(n,m);
		else
			System.out.println("Not Valid!");
		sc.close();
	}
	
	
	public static void getFactorial(int n,int m) {
		int j=n;
		System.out.println(j);
		for(int i =n+1;i<=m;i++)
		{
			j*=i;
			System.out.println(j);

		}
	}
}

