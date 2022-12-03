package Triangulo;

public class Triangulo {
    private Point2DConstructor pontoA;
    private Point2DConstructor pontoB;
    private Point2DConstructor pontoC;

    public Triangulo(Point2DConstructor pontoA, Point2DConstructor pontoB, Point2DConstructor pontoC)
    {
        if(validaTriang())
        {
            this.pontoA=pontoA;
            this.pontoB=pontoB;
            this.pontoC=pontoC;
        }
        else
        {
            this.pontoA = new Point2DConstructor();// os pontos vao pra origem
            this.pontoB = new Point2DConstructor();
            this.pontoC = new Point2DConstructor();
        }
    }

    private boolean verificaPontoIgual(Point2DConstructor p1, Point2DConstructor p2)
    {
        return ((p1.getX()==p2.getX()) && (p1.getY()==p2.getY()));
    }

    private boolean validaTriang()
    {
        if(verificaPontoIgual(pontoA, pontoB))
        {
            return false;
        }
        else if(verificaPontoIgual(pontoA, pontoC))
        {
            return false;
        }
        else if(verificaPontoIgual(pontoB, pontoC))
        {
            return false;
        }

        return true;
    }

    public boolean isTrianguloIssoceles()
    {
        float lado1,lado2,lado3;
        lado1= (float) pontoA.distance(pontoB);
        lado2= (float) pontoA.distance(pontoC);
        lado3= (float) pontoB.distance(pontoC);

        if(lado1==lado2&&lado1!=lado3)
        {
            return true;
        }
        
        else if(lado3==lado1&&lado3!=lado2)
        {
            return true;
        }

        else if(lado3==lado2&&lado3!=lado1)
        {
            return true;
        }

        return false;
    }

    public boolean isTrianguloEquilatero()
    {
        float lado1,lado2,lado3;
        lado1 = (float) pontoA.distance(pontoB);
        lado2 = (float) pontoA.distance(pontoC);
        lado3 = (float) pontoB.distance(pontoC);

        if(lado1==lado2&&lado1==lado3)
        {
            return true;
        }
    
        return false;
    }

    public boolean isTrianguloRetangulo()
    {
        float lado1,lado2,lado3;
        lado1= (float) pontoA.distance(pontoB);
        lado2= (float) pontoA.distance(pontoC);
        lado3= (float) pontoB.distance(pontoC);

        if(lado1==(lado2*lado2)+(lado3*lado3))
        {
            return true;
        }
        
        else if(lado2==(lado1*lado1)+(lado3*lado3))
        {
            return true;
        }

        else if(lado3==(lado1*lado1)+(lado2*lado2))
        {
            return true;
        }

        return false;
    }


}
