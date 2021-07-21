import java.util.*;
public class mininumvalue {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int h = sc.nextInt();
        int []a = new int [h];
        for (int i = 0 ;i<h;i++)
        {
            a[i] = sc.nextInt();
        }
       int min1 =  q1Iterative(a);
       System.out.println(min1);
        int start = 0;
       int min2 = q1Recursive(a, start);
       System.out.println(min2);
        sc.close();
    }




private static int q1Iterative(int[] a) {
    int  u = a.length-1;
    int min1 = a[u];
    while (a[u-1]<a[u]) {
        min1 = a[u+1];
        if(u<0)
        {
            break;
        }
    }
    return min1;
}
public static int q1Recursive(int[] a, int start){
    if(start == a.length)
    {
        return a[start];
    }
    
    if (a[start]<=a[a.length-1])
    
       {
        return a[start];
       }
    else
    {
        return q1Recursive(a, start+1);
    }
    

}


}
