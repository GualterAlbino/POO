package Animais;

public class Peixes extends Animais{
   
    private double Comprimento;
    
    private int qntBarbatana;

    public Peixes(String pNome, String pCor, String pHabitat, double pComprimento, int pqntBarbatana) {
        super(pNome, pCor, pHabitat);
        this.Comprimento = pComprimento;
        this.qntBarbatana = pqntBarbatana;
    
    }
    
    public Peixes() {
       
    
    }
    
    public double getComprimento() {
        return Comprimento;
    }

    public void setComprimento(double Comprimento) {
        this.Comprimento = Comprimento;
    }

    public int getQntBarbatana() {
        return qntBarbatana;
    }

    public void setQntBarbatana(int qntBarbatana) {
        this.qntBarbatana = qntBarbatana;
    }

    

}
