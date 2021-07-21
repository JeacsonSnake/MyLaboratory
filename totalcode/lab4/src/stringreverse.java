import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String A = reverseRecursive(a);
        System.out.println(A);
        sc.close();
    }
    private static String reverseRecursive(String a) {
        if (a.length()==1)
        {
            return a;
        }
        return reverseRecursive(a.substring(1, a.length()))+a.substring(0,1);
    }
}
