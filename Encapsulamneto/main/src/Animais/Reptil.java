package Animais;

public class Reptil extends Animais{
    
    private int qntPatas;
    
    private boolean anfibio;

     public Reptil(String pNome, String pCor, String pHabitat, int qntPatas, boolean anfibio) {
        super(pNome, pCor, pHabitat);
        this.qntPatas = qntPatas;
        this.anfibio = anfibio;
    }
    
     public Reptil() {
        
    }
    
    public int getQntPatas() {
        return qntPatas;
    }

    public void setQntPatas(int qntPatas) {
        this.qntPatas = qntPatas;
    }

    public boolean isAnfibio() {
        return anfibio;
    }

    public void setAnfibio(boolean anfibio) {
        this.anfibio = anfibio;
    }
    
    
}

