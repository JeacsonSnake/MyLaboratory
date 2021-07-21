import java.util.*;
public class FlightCodes {
	public static void main(String[] args) {
		System.out.println("Please input a flight code!");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		judgecode(a);
		sc.close();
	}
	public static void judgecode(String a) {
		if (a.matches("[A-Z]{2,3}[0-9]{3,4}"))
		{
			System.out.println("Flight code is valid");
		}
		
		else
		{
			System.out.println("Flight code is NOT valid");
			Scanner sc = new Scanner(System.in);
			String g = sc.next();
			judgecode(g);
		}
		
	}
}
