import java.util.*;
public class mathfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int an1 = q2Iterative(n);
        int an2 = q2Recursive(n);
        System.out.println(an1);
        System.out.println(an2);
        sc.close();
    }
    public static int q2Iterative(int n)
    {
        int h = 2;
        int an1 = 2;
        while (h<n)
        {
            an1 = 4*an1 - 3*(h+1);
            h++;
        }
        return an1;
    }
    public static int q2Recursive(int n)
    {
        if (n == 1)
        {
            return 2;
        }
        else{
            return 4*q2Iterative(n-1)-3*n;
        }
    }

}
