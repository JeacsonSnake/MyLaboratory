import java.util.*;

public class checkforsub {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String m = sc.next();
        int n = sc.nextInt();
        boolean t = checkForSub(x, m, n);
        System.out.println(t);
        sc.close();
    }
    public static Boolean checkForSub( String x,String m,int n) {
        boolean t = false ;
        if (x.matches(".*"+m+".*"))
        {
            if(n==0)
            {
                t = true;
            }
            else
            {
                t = checkForSub(x.substring(x.indexOf(m)), m, n-1);
            }

        }
        else
        {
            return false;
        }
        return t ;
    }

}