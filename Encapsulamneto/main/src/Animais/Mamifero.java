package Animais;

public class Mamifero extends Animais{
    
    private int velocidade;
    
    private String tipoAlimentacao;

    public Mamifero(String pNome, String pCor, String pHabitat, int pVelocidade, String pTipoAlimentacao) {
        super(pNome, pCor, pHabitat);
        this.velocidade = pVelocidade;
        this.tipoAlimentacao = pTipoAlimentacao;
    }

    public Mamifero() {
        
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
    
}
