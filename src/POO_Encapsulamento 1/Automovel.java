public class Automovel {
    public String cor;
    public String marca;
    public int tamanho;
    private int velocidade;

    public Automovel (String cor, String marca, int tamanho, int velocidade){
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
    }
    public void acelerar(int aceleracao){
        this.velocidade +=aceleracao;
    }
    public void inicializaVelocidade(int inicial){
        this.velocidade = inicial;
    }
    public int retornaVelocidade(){
        return this.velocidade;
    }
}
