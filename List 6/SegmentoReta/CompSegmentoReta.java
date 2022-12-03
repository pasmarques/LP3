package SegmentoReta;

public class CompSegmentoReta{
    private Point2DConstructor pontoInicial;
    private Point2DConstructor pontoFinal;
    private float dimensao;

    public CompSegmentoReta(float x1, float y1, float x2, float y2)
    {
        this.pontoInicial = new Point2DConstructor(x1,y1);
        this.pontoFinal = new Point2DConstructor(x2, y2);
        this.dimensao = calculaDimensao();
    }

    public String imprimeSegmentoReta()
    {
        String res;
        res = "O segmento de reta inicia no ponto " + pontoInicial.imprimePonto() + "e finaliza" +
        " no ponto " + pontoFinal.imprimePonto() + "com dimensao " + this.dimensao;
        return res;
    }

    public float calculaDimensao()
    {
        return (float) pontoInicial.distance(pontoFinal);
    }
    
}