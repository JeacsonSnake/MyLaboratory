public class TestPoint {
    public static void main(String[] args) {
        int[] x1 = {2,3,2,3,5,7,4,8,9,4};
        int[] y1 = {3,3,4,3,4,2,6,3,1,4};

        Point[] Points = new Point[11];
        for (int i = 0;i<10;i++)
        {
            int x = x1[i];
            int y = y1[i];
            Points[i] = new Point(x,y);
        }
        int n1 = NumOutlier(Points);
        System.out.println(n1);
        Point n2 = FarestOutlier(Points);
        n2.printPoints();
    }


    public static int NumOutlier(Point[] Points) {
        int n1 = 0;
        for (int i = 0;i<10;i++)
        {
            double a = Math.sqrt(Math.pow((Points[i].getX()-2), 2)+Math.pow((Points[i].getY()-2), 2));
            if(a <= 4)
            {
                n1++;
            }
        }
        return n1;
    }

    public static Point FarestOutlier(Point[] Points) {
        Point p = new Point();
        double[] a = new double[11]; 
        for (int i = 0;i<10;i++)
        {
            a[i] = Math.sqrt(Math.pow((Points[i].getX()), 2)+Math.pow((Points[i].getY()), 2));
        }
        for (int i = 1;i<10;i++)
        {
            for (int j = 0;j<i;j++)
            {
                if(a[i] < a[j])
                {
                    p = Points[j];
                }
                else
                {
                    p = Points[i];
                }
            }
        }
        return p;
    }
}
