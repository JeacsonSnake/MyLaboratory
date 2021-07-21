import java.util.*;
public class StringAcceptance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean d = IfString(a);
		System.out.println(d);
		sc.close();
	}
	public static boolean IfString(String a) {
		
			if (a.matches(".*[2-9].*"))
			{
				return false;
			}
			
			else
				return true;
	}
}
