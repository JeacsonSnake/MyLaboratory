import java.util.*;
public class arraytimes10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int b = sc.nextInt();
        int []a = new  int[b];
        for (int i = 0;i<b;i++)
        {
            a[i] = sc.nextInt();
        }
        int c = 0;
        System.out.println(checkArray(a, c));
        sc.close();
    }
    private static boolean checkArray(int []a,int c) {
        if (c == a.length)
        {
            return false;
        }
       else{
        for (int i = a.length-1;i>0;i--)
        {
            if(a[0]*10 == a[i])
            {
                return true;
            }
        }
        int []a1 = new  int[a.length-1];
        System.arraycopy(a, 1, a1, 0, a1.length);
        return checkArray(a1, 0);
       }
    }
}