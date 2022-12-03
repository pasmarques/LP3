public class HeraPonto3D extends Ponto2D{
    private float z;

    public float getZ()
    {
        return z;
    }

    public HeraPonto3D(float x, float y, float z)
    {
        super(x, y);
        this.z=z;
    }

    public HeraPonto3D()
    {
        this(0,0,0);
    }

    public HeraPonto3D(Ponto2D outroPonto)
    {
        this(outroPonto.getX(), outroPonto.getY(), 0);
    }

    public HeraPonto3D(HeraPonto3D outroPonto)
    {
        this(outroPonto.getX(), outroPonto.getY(), outroPonto.getZ());
    }

    @Override
    public String toString()
    {
        String res;
        res = String.format("(%f, %f,%f)", getX(),getY(),getZ());
        return res;
    }

    @Override
    public boolean inAxisX()
    {
        return (this.getY()==0&&this.z==0);
    }

    @Override
    public boolean inAxisY()
    {
        return (this.getX()==0&&this.z==0);
    }

    public boolean inAxisZ()
    {
        return (this.getX()==0&&this.getY()==0);
    }

    @Override
    public boolean inAxis()
    {
        return (!(inAxisX())&&!(inAxisY())&&!(inAxisZ()));
    }

    @Override
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

    public double distance(CompPonto3D outroPonto)
    {
        return distance(outroPonto.getX(), outroPonto.getY(), outroPonto.getZ());
    }

    public double distance()
    {
        return distance(0, 0, 0);
    }
    
}