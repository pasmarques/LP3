package SegmentoReta;

public class AgregSegmentoReta {
    private Point2DConstructor pontoInicial;
    private Point2DConstructor pontoFinal;
    private float dimensao;

    public AgregSegmentoReta(Point2DConstructor pontoInicial, Point2DConstructor pontoFinal)
    {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
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
