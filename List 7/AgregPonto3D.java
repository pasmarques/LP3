public class AgregPonto3D {
    private Ponto2D ponto2d;
    private float z;

    public float getX()
    {
        return this.ponto2d.getX();
    }

    public float getY()
    {
        return this.ponto2d.getY();
    }

    public float getZ()
    {
        return z;
    }

    public AgregPonto3D(Ponto2D outroPonto2D, float z)
    {
        this.ponto2d=outroPonto2D;
        this.z=z;
    }

    public AgregPonto3D()
    {
        this(new Ponto2D(), 0);
    }

    public AgregPonto3D(AgregPonto3D outroPonto)
    {
        this(outroPonto.ponto2d, outroPonto.getZ());
    }

    public AgregPonto3D(Ponto2D outroponto)
    {
        this(outroponto, 0);
    }
    
    public String toString()
    {
        String res;
        res = String.format("(%f, %f,%f)", ponto2d.getX(),ponto2d.getY(),getZ());
        return res;
    }

    public boolean inAxisX()
    {
        return (this.getY()==0&&this.z==0);
    }
    public boolean inAxisY()
    {
        return (this.getX()==0&&this.z==0);
    }

    public boolean inAxisZ()
    {
        return (this.getX()==0&&this.getY()==0);
    }

    public boolean inAxis()
    {
        return (!(inAxisX())&&!(inAxisY())&&!(inAxisZ()));
    }

    public boolean isOrigin()
    {
        return ((inAxisX())&&(inAxisY())&&(inAxisZ()));
    }

    public double distance(float x,float y, float z)
    {
        double distanceTwoPoints;
        distanceTwoPoints=(this.getX()-x)*(this.getX()-x)+(this.getY()-y)*(this.getY()-y)+(this.getZ()-z)*(this.getZ()-z);
        return Math.sqrt(distanceTwoPoints);
    }

    public double distance(AgregPonto3D outroPonto)
    {
        return distance(outroPonto.getX(), outroPonto.getY(), outroPonto.getZ());
    }

    public double distance()
    {
        return distance(0, 0, 0);
    }
}
