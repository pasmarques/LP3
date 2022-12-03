public class RoboSimples {
    private  String nomeDoRobo;
    private int posicaoXAtual,posicaoYAtual;
    private char direcaoAtual;

    RoboSimples(String nome, int px, int py, char d){
        if(validaNome(nome)&&validaDirecao(d))
        {
            nomeDoRobo = nome;
            posicaoXAtual = px;
            posicaoYAtual = py;
            direcaoAtual = d;
        }
    }

    RoboSimples(String nome){
        this(nome, 0, 0, 'N');
    }

    RoboSimples(){
        this("Wally");
    }

    public String getNomeDoRobo()
    {
        return nomeDoRobo;
    }

    public int getPosicaoXAtual()
    {
        return posicaoXAtual;
    }

    public int getPosicaoYAtual()
    {
        return posicaoYAtual;
    }

    public char getDirecaoAtual()
    {
        return direcaoAtual;
    }

    public void move(){
        this.move(1);
    }

    public void move(int passos){
        if (direcaoAtual == 'N') posicaoYAtual += passos;
        if (direcaoAtual == 'S') posicaoYAtual -= passos;
        if (direcaoAtual == 'E') posicaoXAtual += passos;
        if (direcaoAtual == 'O') posicaoXAtual -= passos;
    }

    public void mudaDirecao(char novaDirecao)
    {
        direcaoAtual = novaDirecao;
    }

    public String toString(){
        String str = "\nNome do robo: "+nomeDoRobo+"\n";
        str = str + "Posicao do robo: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
        str = str + "Direcao do robo: "+direcaoAtual;

        return str;
    }

    public boolean validaDirecao(char direcao)
    {
        final char direcoes[]= {'N','S','E','0'};
        int i;
      
        for(i=0;i<direcoes.length;i++)
        {
            if(direcoes[i]==direcao)
            {
                return true;
            }
        }
        return false;
    }

    public boolean validaNome(String nome)
    {
        return (nomeDoRobo!=null);
    }

}