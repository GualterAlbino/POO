
package campeonatodefutebol;
import java.util.ArrayList;
import java.util.Random;

public class Campeonato {
    
    private String NomeDoCampeonato;
    private int QtdDeJogos;
    private String Campeao;
    private ArrayList<Time> ListaDeTimes; //Array que associa varios times ao campeonato
  
    
   
    Random gerador = new Random();//Objeto para gerar numero aleatorios
    
    
    public Campeonato(){
        
        NomeDoCampeonato = "Campeonatinho";
        QtdDeJogos = 10;
        ListaDeTimes = new ArrayList<>();
        
    } 
    
    public void addTime(Time objTime){//Metodo para adicionar time
        ListaDeTimes.add(objTime);
    }
    
    public Time getTime(int idx){
        return ListaDeTimes.get(idx); //Metodo para consultar time pelo indice
    }
    
    
    
    
    //Metodos GETS e SETTES
    
    public String getNome(){
        return NomeDoCampeonato;
    }
    
    public void setNome(String pNome){
        this.NomeDoCampeonato = pNome;
    }
    
    public int getQtdDeJogos(){
        return QtdDeJogos;
    }
    
    public void setQtdDeJogos(int pQtdDeJogos){
        this.QtdDeJogos = pQtdDeJogos;
    }
    
    public String getCampeao(){
        return Campeao;
    }
    
    public void setCampeao(String pCampeao){
        this.Campeao = pCampeao;
    }
    
    
    //Metodos
    
    public void CadastroDeTime(int pQtdDeTimes){
        
        for(int i=0; i<pQtdDeTimes; i++){
            
           Time Times = new Time();
           
           Times.setNome( Funcoes.LerString( "Digite o nome do Time: ","Time de número: " + i));

           ListaDeTimes.add(i, Times);
            
            
        }
        
    }
      
    public void ImprimirTabela(){
        
        if(ListaDeTimes.isEmpty() == true){
            Funcoes.ImprimirString("ERRO! Não há times cadastrados.");
        }
        
        for(int i=0; i<ListaDeTimes.size(); i++){
            ListaDeTimes.get(i).ImprimirInformacoes();
        }
        
    }
    
    public void CriarJogo(){
        
        int time1;
        int time2;
      
        int SaldoDeGols1;
        int GolsMarcados1;

        int SaldoDeGols2;
        int GolsMarcados2;
    

        if(ListaDeTimes.isEmpty() == true){//Verifica se há times cadastrados 
            Funcoes.ImprimirString("Não há times cadastrados!");
            
        }else{
             
             for(int i = 0; i < ListaDeTimes.size(); i++){
                 System.out.println("Time: "+ i + " - " + ListaDeTimes.get(i).getNome());
             }
             time1 = Funcoes.lerInt("Selecione o primeiro time: ",  "Seguindo os indices do console, escolha:" );
           
             time2 = Funcoes.lerInt("Selecione o segundo time: ", "Seguindo os indices, escolha:");
             
                   
            GolsMarcados1=  gerador.nextInt(10);//Gera numeros de gols aleatorios
            GolsMarcados2= gerador.nextInt(10);
            
            if(GolsMarcados1 > GolsMarcados2){//Verifica quem fez mais gols
                
                SaldoDeGols1 = GolsMarcados1 - GolsMarcados2;
                SaldoDeGols2 = GolsMarcados2 - GolsMarcados1;
                
                //Computa a vitoria
                ListaDeTimes.get(time1).AtualizarPontuacao(3, GolsMarcados1, GolsMarcados2,SaldoDeGols1,1, 0, 0);
                
                //Computa a Derrota
                ListaDeTimes.get(time2).AtualizarPontuacao(0, GolsMarcados2, GolsMarcados1, SaldoDeGols2, 0, 1, 0);
                
                Funcoes.ImprimirString("O Time Vencedor é: " +ListaDeTimes.get(time1).getNome());
                
                
            }else if(GolsMarcados1 < GolsMarcados2){
                
                SaldoDeGols1 = GolsMarcados1 - GolsMarcados2;
                SaldoDeGols2 = GolsMarcados2 - GolsMarcados1;
                
                //Computa a vitoria
                ListaDeTimes.get(time2).AtualizarPontuacao(3, GolsMarcados2, GolsMarcados1, SaldoDeGols2, 1, 0, 0);
                
                //Computa a derrota
                 ListaDeTimes.get(time1).AtualizarPontuacao(0, GolsMarcados1, GolsMarcados2,SaldoDeGols1,0, 1, 0);
                
                Funcoes.ImprimirString("O Time Vencedor é: " +ListaDeTimes.get(time2).getNome());
                
                
            }else if(GolsMarcados1 == GolsMarcados2){//Caso de empate
                SaldoDeGols1 = GolsMarcados1 - GolsMarcados2;
                SaldoDeGols2 = GolsMarcados2 - GolsMarcados1;
                
                //Computa o empate
                ListaDeTimes.get(time2).AtualizarPontuacao(3, GolsMarcados2, GolsMarcados1, SaldoDeGols2, 0, 0, 1);
                
                //Computa o empate
                 ListaDeTimes.get(time1).AtualizarPontuacao(0, GolsMarcados1, GolsMarcados2,SaldoDeGols1,0, 0, 1);
                
                Funcoes.ImprimirString("Houve um empate entre: " +ListaDeTimes.get(time1).getNome() + " e " +ListaDeTimes.get(time2).getNome());
            }
        
           
        }
       
        

    }
    
   public void ComputarVencedor(){
        
        int vencedor = ListaDeTimes.get(0).getPontuacao();
        Campeao =ListaDeTimes.get(0).getNome();
        
        
        for(int i = 0; i<ListaDeTimes.size() ; i++){
           
            if( vencedor < ListaDeTimes.get(i).getPontuacao()){
                
                Campeao =ListaDeTimes.get(i).getNome();
            }
                
        }
        
        Funcoes.ImprimirString("O atual vencedor é: " + Campeao);
        
        
}
}
    
    
    