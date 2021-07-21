import java.util.*;
public class mininumvalue2 {
public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner (System.in);
     int h = sc.nextInt();
     int []a = new int [h];
     for (int i = 0 ;i<h;i++)
    {
        a[i] = sc.nextInt();
    }
    int start = 0;
    int min2 = q1Recursive(a, start);
    System.out.println(min2);
    sc.close();
    }


public static int q1Recursive(int[] a, int start){
    if(start == a.length)
    {
        return Integer.MAX_VALUE;
    }
    int minafterstart = q1Recursive(a, start+1);
    return Math.min(a[start], minafterstart);
}


}
