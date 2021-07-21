import java.util.*;
public class ValidName {
	public static void main(String[] args) {
		System.out.println("Please input your first name!");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		judgename(a);
	}
	public static void judgename(String a) {
		if (a.matches("[A-Z]([a-z]{1,24})*"))
		{
			System.out.println("Name is valid");
		}
		
		else
		{
			System.out.println("Name is NOT valid");
			Scanner sc = new Scanner(System.in);
			String g = sc.next();
			judgename(g);
		}
		
	}
}

