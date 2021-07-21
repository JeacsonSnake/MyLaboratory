import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean b = ValidPhoneNumber(a);
        System.out.println(b);
        sc.close();
    }

    public static boolean ValidPhoneNumber(String a) {
        boolean b = false;
        String PAT0 = "[0-9]{10}";
        String PAT1 = "[0-9]{3}";
        String PAT2 = "[0-9]{4}";
        String PAT3 = "\\t[x][0-9]{4}";
        String PAT4 = "\\t[ext][0-9]{4}";
        if (a.matches(PAT0))
        {
            b = true;
            return b;
            
        }
        else if (a.matches(PAT1+"[-]"+PAT1+"[-]"+PAT2))
        {
            b = true;
            return b;
        }
        else if (a.matches(PAT1+"[-]"+PAT1+"[-]"+PAT2+PAT3))
        {
            b = true;
            return b;
        }
        else if (a.matches(PAT1+"[-]"+PAT1+"[-]"+PAT2+PAT4))
        {
            b = true;
            return b;
        }
        else if (a.matches("[(]"+PAT1+"[)][-]"+PAT1+"[-]"+PAT2))
        {
            b = true;
            return b;
        }
        else if (a.matches(PAT1+"\\."+PAT1+"\\."+PAT2))
        {
            b = true;
            return b;
        }
        else if (a.matches(PAT1+" "+PAT1+" "+PAT2))
        {
            b = true;
            return b;
        }
        return b;
    }

}
