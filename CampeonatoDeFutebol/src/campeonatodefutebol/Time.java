
package campeonatodefutebol;


public class Time {
    
    private String Nome;
    private int Pontuacao;
    private int SaldoDeGols;
    private int GolsMarcados;
    private int GolsSofridos;
    private int QtdJogos;
    private int QtdVitorias;
    private int QtdDerrotas;
    private int QtdEmpate;
    
    
    private Campeonato Joga; //Atributo que associa o time ao campeonato
    
    public Campeonato getJoga(){
        return Joga;
    }
    
    public void setJoga( Campeonato pJoga){
        Joga = pJoga;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(int Pontuacao) {
        this.Pontuacao = Pontuacao;
    }

    public int getSaldoDeGols() {
        return SaldoDeGols;
    }

    public void setSaldoDeGols(int SaldoDeGols) {
        this.SaldoDeGols = SaldoDeGols;
    }

    public int getGolsMarcados() {
        return GolsMarcados;
    }

    public void setGolsMarcados(int GolsMarcados) {
        this.GolsMarcados = GolsMarcados;
    }

    public int getGolsSofridos() {
        return GolsSofridos;
    }

    public void setGolsSofridos(int GolsSofridos) {
        this.GolsSofridos = GolsSofridos;
    }

    public int getQtdJogos() {
        return QtdJogos;
    }

    public void setQtdJogos(int QtdJogos) {
        this.QtdJogos = QtdJogos;
    }

    public int getQtdVitorias() {
        return QtdVitorias;
    }

    public void setQtdVitorias(int QtdVitorias) {
        this.QtdVitorias = QtdVitorias;
    }

    public int getQtdDerrotas() {
        return QtdDerrotas;
    }

    public void setQtdDerrotas(int QtdDerrotas) {
        this.QtdDerrotas = QtdDerrotas;
    }

    public int getQtdEmpate() {
        return QtdEmpate;
    }

    public void setQtdEmpate(int QtdEmpate) {
        this.QtdEmpate = QtdEmpate;
    }
    
    
    
   /* Metodos */
    
    public void AtualizarPontuacao(int pPontuação , int pGolsMarcados, int pGolsSofridos, int pSaldoDeGols, int pQtdVitorias,int pQtdDerrotas, int pQtdEmpate){
        
        
        setPontuacao(pPontuação + Pontuacao);
        //Soma a antiga pontuação a nova
        
        setGolsMarcados(GolsMarcados + pGolsMarcados);
        //Soma os gols
        
        setGolsSofridos(GolsSofridos + pGolsSofridos);
        //Soma os gols
        
        setSaldoDeGols(SaldoDeGols + pSaldoDeGols);
        
        setQtdVitorias(QtdVitorias + pQtdVitorias);
        
        setQtdDerrotas(QtdDerrotas+ pQtdDerrotas);
        
        setQtdEmpate(QtdEmpate+pQtdEmpate);
        
    }
    
    public void ImprimirInformacoes(){
        
        Funcoes.ImprimirString("Nome do time: " + Nome +"\n"
                                +"Pontuação do Time: " + Pontuacao +"\n"
                                +"Saldo de gols: " + SaldoDeGols +"\n"
                                +"Gols Marcados: " + GolsMarcados +"\n"
                                +"Gols sofridos: " + GolsSofridos +"\n"
                                +"Quantidade de Jogos: " + QtdJogos +"\n"
                                +"Quantidade de Vitorias: " + QtdVitorias +"\n"
                                +"Quantidade de Derrotas: " + QtdDerrotas +"\n"
                                +"Quantidade de Empates: " + QtdEmpate +"\n"
                              );

        System.out.println(" \n " );
       
        
 
        
    }
    
    
    
    
    
    
    
    
    
    
}
