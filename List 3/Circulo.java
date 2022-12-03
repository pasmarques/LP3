public class Circulo {
    public static final double  PI = 3.14;
    private Point2DConstructor circCoordenates;
    private float raio;
    
    public Circulo (float x, float y, int raio)
    {

        if(validaRaio(raio))
        {
            this.raio=raio;
        }
        else
        {
            this.raio=0;
        }

        circCoordenates = new Point2DConstructor(x,y); //se raio validado cria o circulo
    }

    public Circulo()
    {
        this(0,0,1);
    }

    
    public Circulo(int x,int y)
    {
        this(x,y,1);
    }

    public Circulo(int raio)
    {
       this(0,0,raio);
    }

    public float getRaio()
    {
        return this.raio;
    }

    private boolean validaRaio(float raio)
    {
        return (!(raio<0));
    }

    public boolean isInnerPoint (Point2DConstructor outroPonto)
    {
       double distance = circCoordenates.distance(outroPonto);
       distance = Math.sqrt(distance);
        
       if(distance<raio)
       {
            return true;
       }
       else
       {
            return false;
       }
    }

    public double calcularArea ()
    {
         return (PI*(this.raio*this.raio));
    }

    public double calcularPerimetro()
    {
        return (2*PI*this.raio);
    }

}
