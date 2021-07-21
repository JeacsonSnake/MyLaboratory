import java.util.*;
public class ValidAge {
	public static void main(String[] args) {
		System.out.println("Please input your age!");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		judgeage(a);
		sc.close();
	}
	public static void judgeage(String a) {
		if (a.matches("[0-1]+[0-4]+[0-9]")||a.equals("150")||a.matches("[0-9]+[0-9]")||a.matches("[0-9]"))
		{
			System.out.println("Age is valid");
		}
		
		else
		{
			System.out.println("Age is NOT valid");
			Scanner sc = new Scanner(System.in);
			String g = sc.next();
			judgeage(g);
		}
	}
}
