
import java.util.*;
public class TestBasicCircle {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int radius1 = sc.nextInt();
    int radius2 = sc.nextInt();
    int radius3 = sc.nextInt();
    BasicCircle r1 = new BasicCircle(radius1);
    BasicCircle r2 = new BasicCircle(radius2);
    BasicCircle r3 = new BasicCircle(radius3);
    r1.radiusprint();
    r2.radiusprint();
    r3.radiusprint();
    r1.Circumprint(radius1);
    r2.Circumprint(radius2);
    r3.Circumprint(radius3);
    r1.Areaprint(radius1);
    r2.Areaprint(radius2);
    r3.Areaprint(radius3);
    sc.close();
}

}
class BasicCircle {
    private int radius ;
    private static int num = 0;
    private int nnum ;
    public void Basiccircle() {
        radius = 1;
        num++;
        nnum = num;
    }
    public BasicCircle(int radius) {
        setRadius(radius);
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
        num++;
        nnum = num;
    }
    public  double getArea(int radius) {
       double A = Math.PI*Math.pow(getRadius(), 2) ;
       return Math.round(A*100.0)/100.0;
    }
    
    public  double getCircumference(int radius) {
        double C = 2*Math.PI*getRadius() ;
        return Math.round(C*100.0)/100.0;
     }
     public void radiusprint(){
        System.out.println("Circle "+nnum+" has a radius of " +getRadius());
     }
     public void Areaprint(int radius){
        System.out.println("Circle "+nnum+" has an area of " +getArea(radius) );
     }
     public void Circumprint(int radius){
        System.out.println("Circle "+nnum+" has an circumference of " +getCircumference(radius) );

     }
    }