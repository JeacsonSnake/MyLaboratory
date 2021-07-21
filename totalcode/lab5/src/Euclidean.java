import java.util.*;
public class Euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int y = GCD(a, b);
       System.out.println(y);
       sc.close();
    }
    public static int GCD(int a,int b) {
        int y = 0;
        if (a==0)
        {
            return b;
        }
        else if (b==0)
        {
            return a;
        }
        else
        {
            if(a>=b)
            {
                y =a%b;
            }
            else
            {
                y =b%a;
            }
            return GCD(b, y);
        }
    }
}
