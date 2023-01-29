package Animais;

import java.util.Random;

public abstract class  Animais {
    
    private String Nome;
    
    private String Cor;
    
    private String Habitat;
    
    private int Codigo;

    public Animais(String pNome, String pCor, String pHabitat) {
        Random Rand = new Random();
        this.Nome = pNome;
        this.Cor = pCor;
        this.Habitat = pHabitat;
        this.Codigo = Rand.nextInt(20);
    }
    
    public Animais() {
       
    }
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public int getCodigo() {
        return Codigo;
    }

    
    
    
    
    
}
