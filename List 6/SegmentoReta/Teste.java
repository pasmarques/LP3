package SegmentoReta;

public class Teste {
    
    public static void main (String args[])
    {
        Point2DConstructor p1 = new Point2DConstructor(3,5);
        Point2DConstructor p2 = new Point2DConstructor(6,1);
        AgregSegmentoReta seg1 = new AgregSegmentoReta(p1,p2);
        System.out.println(seg1.imprimeSegmentoReta());
        
        CompSegmentoReta seg2 = new CompSegmentoReta(3, 5, 6, 1);
        System.out.println(seg2.imprimeSegmentoReta());

    }
}
