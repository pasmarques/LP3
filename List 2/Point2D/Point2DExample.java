package Point2D;
public class Point2DExample {
    public static void main (String args[])
    {
        Point2D ponto1 = new Point2D();
        ponto1.setPoint2D(3, 5);
        Point2D ponto2 = new Point2D();
        ponto2.setPoint2D(6, 1);
        System.out.println(ponto1.distance(ponto2));
    }
}
