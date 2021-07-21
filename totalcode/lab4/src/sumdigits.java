import java.util.*;
public class sumdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int ba = recursiveSum(a);
        System.out.println(ba);
        sc.close();
    }
    private static int recursiveSum(String a) {
        if (a.length() == 1)
        {
            return a.charAt(0) - '0';
        }
        
        return recursiveSum(a.substring(0, a.length()-1)) + ( a.charAt(a.length()-1) - '0');
    }
}
