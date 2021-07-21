import java.util.*;
public class PrintDigits {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a single interger value:");
		int a = sc.nextInt();
		int n=0;
		int b=a;
		while (b!=0)
		{
			n++;
			b/=10;
		}
		int d=0;
	
		while (n>0)
		{
			int u=(int) Math.pow(10, n-1);
			d=a/u;
			
			DigitsPrint(d);
			a%=u;
			
			n--;
		}
		
		
		
		
		sc.close();
	}
	
	
	
	private static void DigitsPrint(double d) {
		
		char h0[][]= {{' ','-','-',' '},{'|',' ',' ','|'},{' ',' ',' ',' '},{'|',' ',' ','|'},{' ','-','-',' '}};
		char h1[][]= {{' ',' ',' ',' '},{' ',' ',' ','|'},{' ',' ',' ',' '},{' ',' ',' ','|'},{' ',' ',' ',' '}};
		char h2[][]= {{' ','-','-',' '},{' ',' ',' ','|'},{' ','-','-',' '},{'|',' ',' ',' '},{' ','-','-',' '}};
		char h3[][]= {{' ','-','-',' '},{' ',' ',' ','|'},{' ','-','-',' '},{' ',' ',' ','|'},{' ','-','-',' '}};
		char h4[][]= {{' ',' ',' ',' '},{'|',' ',' ','|'},{' ','-','-',' '},{' ',' ',' ','|'},{' ',' ',' ',' '}};
		char h5[][]= {{' ','-','-',' '},{'|',' ',' ',' '},{' ','-','-',' '},{' ',' ',' ','|'},{' ','-','-',' '}};
		char h6[][]= {{' ','-','-',' '},{'|',' ',' ',' '},{' ','-','-',' '},{'|',' ',' ','|'},{' ','-','-',' '}};
		char h7[][]= {{' ','-','-',' '},{' ',' ',' ','|'},{' ',' ',' ',' '},{' ',' ',' ','|'},{' ',' ',' ',' '}};
		char h8[][]= {{' ','-','-',' '},{'|',' ',' ','|'},{' ','-','-',' '},{'|',' ',' ','|'},{' ','-','-',' '}};
		char h9[][]= {{' ','-','-',' '},{'|',' ',' ','|'},{' ','-','-',' '},{' ',' ',' ','|'},{' ','-','-',' '}};
		if (d==1)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h1[j][i]);
				}
				System.out.println();
			}
		}
		if (d==2)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h2[j][i]);
				}
				System.out.println();
			}
		}
		if (d==3)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h3[j][i]);
				}
				System.out.println();
			}
		}
		if (d==4)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h4[j][i]);
				}
				System.out.println();
			}
		}
		if (d==5)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h5[j][i]);
				}
				System.out.println();
			}
		}
		if (d==6)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h6[j][i]);
				}
				System.out.println();
			}
		}
		if (d==7)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h7[j][i]);
				}
				System.out.println();
			}
		}
		if (d==8)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h8[j][i]);
				}
				System.out.println();
			}
		}
		if (d==9)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h9[j][i]);
				}
				System.out.println();
			}
		}
		if (d==0)
		{
			for (int j=0;j<5;j++)
			{
				for (int i=0;i<4;i++)
				{
					System.out.print(h0[j][i]);
				}
				System.out.println();
			}
		}
		
	}



	
}
