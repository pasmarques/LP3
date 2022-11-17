package Point2D;
public class Point2D {

    private int x;
    private int y;

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
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

    public void setPoint2D(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int quadrant()
    {
        if((this.x>0)&&(this.y>0))
        {
            return 1;
        }
        else if((this.x<0)&&(this.y>0))
        {
            return 2;
        }
        else if((this.x<0)&&(this.y<0))
        {
            return 3;
        }
        else if((this.x>0)&&(this.y<0))
        {
            return 4;
        }

        return 0;
    }

    public double distance(Point2D point2d)
    {
        double distanceTwoPoints;
        distanceTwoPoints=(Math.abs((this.x-point2d.x))* Math.abs((this.x-point2d.x))) + (Math.abs((this.y-point2d.y))*Math.abs((this.y-point2d.y)));
        return Math.sqrt(distanceTwoPoints);
    }
}
