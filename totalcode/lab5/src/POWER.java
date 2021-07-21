import java.util.*;

public class POWER {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = powerTO(x,y);
        System.out.println(a);
        sc.close();
    }

    public static int powerTO(int x, int y) {

        if (y==1)
        {

            return x;

        }
        else
        {
            return x*powerTO(x, y-1);
        }
    }
}
