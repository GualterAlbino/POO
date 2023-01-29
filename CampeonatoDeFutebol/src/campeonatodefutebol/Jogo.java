
package campeonatodefutebol;
import java.util.Random;

public class Jogo {
    
    private int TimeA;
    private int TimeB;
    private int GolsTimeA;
    private int GolsTimeB;
    
    Random gerador = new Random();
    
    private Campeonato Partida; //Atributo que associa o jogo ao campeonato
    
    
    public Campeonato getPartida(){
        return Partida;
    }
    
    public void setPartida( Campeonato pPartida){
        Partida = pPartida;
    }
    
    
    
    
    
    
    
    //Metodos GETS e SETTES

    public int getTimeA() {
        return TimeA;
    }

    public void setTimeA(int TimeA) {
        this.TimeA = TimeA;
    }

    public int getTimeB() {
        return TimeB;
    }

    public void setTimeB(int TimeB) {
        this.TimeB = TimeB;
    }

    public int getGolsTimeA() {
        return GolsTimeA;
    }

    public void setGolsTimeA(int GolsTimeA) {
        this.GolsTimeA = GolsTimeA;
    }

    public int getGolsTimeB() {
        return GolsTimeB;
    }

    public void setGolsTimeB(int GolsTimeB) {
        this.GolsTimeB = GolsTimeB;
    }
    
    

    
    
    
}
