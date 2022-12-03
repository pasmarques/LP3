public class Point2DConstructor{

    private float x;
    private float y;

    public Point2DConstructor(float x, float  y)
    {
       this.x=x;
       this.y=y;
    }
    
    public Point2DConstructor()
    {
        this(0,0);
    }   

    public float getX()
    {
        return this.x;
    }
    public float getY()
    {
        return this.y;
    }

    public boolean isEixoX()
    {
        return (this.y==0);
    }

    public boolean isEixoY()
    {
        return (this.x==0);
    }

    public boolean isEixos()
    {
        return (!(isEixoX())&&!(isEixoY()));
    }

    public final void setPoint2D(float x1, float y1)
    {
        this.x=x1;
        this.y=y1;
    }

    public static int quadrant(Point2DConstructor p)
    {
        if((p.x>0)&&(p.y>0))
        {
            return 1;
        }
        else if((p.x<0)&&(p.y>0))
        {
            return 2;
        }
        else if((p.x<0)&&(p.y<0))
        {
            return 3;
        }
        else if((p.x>0)&&(p.y<0))
        {
            return 4;
        }

        return 0;
    }

    public double distance(float x,float y)
    {
        double distanceTwoPoints;
        distanceTwoPoints=(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y);
        return Math.sqrt(distanceTwoPoints);
    }

    public double distance(Point2DConstructor outroPonto)
    {
        return distance(outroPonto.getX(), outroPonto.getY());
    }
    
    public double distance()
    {
        return distance(0,0);
    }

    public static double distance(Point2DConstructor p1, Point2DConstructor p2)
    {
        double distanceTwoPoints;
        distanceTwoPoints=(p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
        return Math.sqrt(distanceTwoPoints);
    }

    public static double distanceOrigin(Point2DConstructor p1)
    {
        Point2DConstructor origin = new Point2DConstructor(); //construtor que retorna origem
        return distance(p1,origin);
    }

}