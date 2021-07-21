
public class TestSquare {
    public static void main(String[] args) {
        square[] s = new square[5];
        for (int i = 1 ;i<=4;i++)
        {
             s[i] = new square(6,8);
        }
        s[1].setLength(10);
        s[3].setLength(10);
        for (int i = 1 ;i<=4;i++)
        {
            System.out.println("Square "+i+" has a side length of "+ s[i].getLength());
        }
        for (int i = 1 ;i<=2;i++)
        {
            System.out.println("Square "+i+" has a area of "+ s[i].getArea());
        }
        s[3].toString();
    }
}
class square {
    private int length;
    private int width;
    public square(){
        length = 1;
    }
    public square(int length,int width){
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getArea() {
        int A = (int)Math.pow(getLength(), 2);
        return A;
     }

     @Override
     public String toString() {
        String detail =  "LENGTH: "+ getLength() ;
        return detail;
     }
}
