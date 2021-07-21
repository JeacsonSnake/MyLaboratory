import java.util.*;

public class task1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        int o = 1;
        int p = 2;
        int q = 3;
        int step = 1;
        step = Hanoitower(t,o,p,q,step);
        System.out.println("total step: "+(step-1));
        sc.close();
    }
    public static int Hanoitower(int t,int o,int p,int q,int step) {
        
        if (t==2)
        {
            System.out.println("step "+step+": Move \""+(t-1)+"\" from Pole"+o+" --> Pole" +p);
            step++;
        }
        else
        {
            step = Hanoitower(t-1,o,q,p,step);
        }

        System.out.println("step "+step+": Move \""+t+"\" from Pole"+o+" --> Pole" +q);
        step++;
        if (t==2)
        {
            System.out.println("step "+step+": Move \""+(t-1)+"\" from Pole"+p+" --> Pole" +q);
            step++;
        }
        else
        {
            step = Hanoitower(t-1,p,o,q,step);
        }
        return step;
    }
}
