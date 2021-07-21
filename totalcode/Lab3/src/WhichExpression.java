import java.util.*;
public class WhichExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringSatisfy(a);
		sc.close();
	}
	public static void StringSatisfy(String a) {
		
		boolean e=false;
		if (a.matches("a(b|a)b")==true)
		{
			System.out.println("1");
			e = true;
		}
		if (a.matches("(ab)*b")==true)
		{
			System.out.println("2");
			e = true;
		}
		if (a.matches("a(b|a)*")==true)
		{
			System.out.println("3");
			e = true;
		}
		if (a.matches("((a|b)a)*")==true)
		{
			System.out.println("4");
			e = true;
		}
		if(!e) 
		{
			System.out.println("Not in the language");
		}
		
	}
}
