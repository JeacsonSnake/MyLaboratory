import java.util.*;
public class binarysearch
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int step = binary(x,y,n); 
        if(step==1)
        {
            System.out.println("It took "+step+" try!");
        }
        else
        {
            System.out.println("It took "+step+" tries!");
        }
        sc.close();
    }

    public static int binary(int x,int y,int n) {
        int mid = (x+y)/2;
        int step = 1;
        if(mid == n)
        {
            return step;
        }
        else{
            if (mid > n)
            {
                step += binary(x, mid, n);
             }
            else if (mid < n)
            {
                step += binary(mid+1, y, n);
            }
            return step;
        }
    }
}
