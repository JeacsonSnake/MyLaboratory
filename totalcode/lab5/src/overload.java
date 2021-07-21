import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class overload {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n+1];
        for (int i = 0;i<n;i++)
        {
            s[i] = sc.next().toLowerCase();
        }
        int x = sc.nextInt();
        int x1 = sc.nextInt();
        char c = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);
        StringBuilder b=new StringBuilder();
        for (int i = 0; i <n; i++) {
            b.append(s[i] + " ");
        }
        String text=b.toString().toLowerCase();
        System.out.println(text);
        System.out.println(MethodOverLoading.manipulation(s));
        System.out.println(MethodOverLoading.manipulation(s, c));
        System.out.println(MethodOverLoading.manipulation(text, x));
        System.out.println(MethodOverLoading.manipulation(text, x, x1)); 
        System.out.println(MethodOverLoading.manipulation(text, c, c1));
        System.out.println(MethodOverLoading.manipulation(text, c, x));
        sc.close();
    }
}

class MethodOverLoading {

    public static String manipulation (String a[])
    {
        StringBuilder b=new StringBuilder();
        for (int i = 0; i <a.length-1; i++) {
            b.append(a[i]);
        }
        String text=b.toString().toLowerCase(); 
        return text;
    }
    public static String manipulation (String a[], char b)
    {
        for (int i = 0;i<a.length-1;i++)
        {
            for (int j = 0;j<a[i].length();j++)
            {
                if(b==(a[i].charAt(j)))
            {
                a[i] = a[i].replace(String.valueOf(a[i].charAt(j)), "");
            }
            }
        }
        StringBuilder o =new StringBuilder();
        for (int p = 0; p <a.length-1; p++) {
            o.append(a[p] + " ");
        }
        String text=o.toString().toLowerCase();
        return text;
    }
    public static String manipulation (String a, int c)
    {
        a=a.replace(a.substring(c,c+1), "");
        return a;
    }
    public static String manipulation (String a, int d, int e)
    {
        a=a.replace(a.substring(d+1, e), "");
        return a;
    }
    public static String manipulation (String a, char f, char g)
    {

        a=a.replace(a.substring(a.indexOf(f)+1, a.lastIndexOf(g)), "");
        return a;

    }
    public static String manipulation (String a, char f, int h)
    {
        int g = location(a,f,h);
        
        a = a.substring(g,a.length()-1);
        return a;


    }
    public static int location(String a, char f, int h) {
        int g = 0;
        int i = 1;
        Pattern pat = Pattern.compile(String.valueOf(f));
        Matcher find = pat.matcher(a);
        while (find.find()&&i<=h)
        {
            g = find.start();
            i++;
        }
        return g;
    }
}
