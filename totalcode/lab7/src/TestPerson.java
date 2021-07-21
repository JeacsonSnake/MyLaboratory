import java.util.*;
public class TestPerson {
    public static void main(String[] args) {
        Person[] n = new Person[3];
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ;i<n.length;i++)
         {
            System.out.println("Please enter the name for person number "+(i+1));
            String a = sc.nextLine();
            System.out.println("Please enter the Adress for person number "+(i+1));
            String b =sc.nextLine();
            n[i] = new Person(a, b, i+1);
         }
         sc.close();
         System.out.println("Person 1 is called "+n[0].getName());
         System.out.println("Who lives in "+n[0].getAddress());
         System.out.println("Their PPS Number is "+n[0].getPPSNo());
        n[1].setName("Paul Smyth");
        n[1].setAddress("Dublin");

        for (int i = 0 ;i<n.length;i++)
         {
             n[i].showPerson();
            
         }
         System.out.println(n[2].toString());
    }
}

