public class Ponto2D{
    private float x;
    private float y;

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public Ponto2D(float x, float y)
    {
        this.x=x;
        this.y=y;
    }

    public Ponto2D()
    {
        this(0,0);
    }

    public Ponto2D(Ponto2D outroPonto)
    {
        this(outroPonto.getX(), outroPonto.getY());
    }

    public boolean inAxisX()
    {
        return (this.y==0);
    }
    public boolean inAxisY()
    {
        return (this.x==0);
    }

    public boolean inAxis()
    {
        return (!(inAxisX())&&!(inAxisY()));
    }

    public boolean isOrigin()
    {
        return ((inAxisX())&&(inAxisY()));
    }

    public double distance(float x,float y)
    {
        double distanceTwoPoints;
        distanceTwoPoints=(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y);
        return Math.sqrt(distanceTwoPoints);
    }

    public double distance(Ponto2D outroPonto)
    {
        return distance(outroPonto.getX(), outroPonto.getY());
    }

    public double distance()
    {
        return distance(0, 0);
    }

    public String toString()
    {
        String res;
        res = String.format("(%f, %f)", getX(),getY());
        return res;
    }

}