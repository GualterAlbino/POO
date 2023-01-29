
package campeonatodefutebol;


import java.util.ArrayList;



public class CampeonatoDeFutebol {

    
    public static void main(String[] args) {
        
        Campeonato Camp = new Campeonato();
        Time Tim = new Time();
        Jogo Jog = new Jogo();
        Funcoes Func = new Funcoes();
        
        //ArrayList<Time> ListaDeTimes = new ArrayList <Time>();
         
        while(true){
        
            int op;

            op = Funcoes.lerInt("1 - Cadastrar Time  " + "\n"
                               +"2 - Simular jogo "  + "\n"
                               +"3 - Imprimir tabela "  + "\n"
                               +"4 - Atual campeão "  + "\n"
                               +"5 - Sair "  + "\n"
                               ,"Selecione uma opção:");
            
            switch (op){
                
                case 1://cadastro de times
                    
                  int QtdDeTimes = Funcoes.lerInt("Digite o número de times para o cadastro:", ""); 
                  Camp.CadastroDeTime(QtdDeTimes);
                  
              
                break;
                
                case 2://Simular Jogos 
                    
                    
                    
                    Camp.CriarJogo();
                   
                    //Escolher times em CAMPEONATO
                    //VErifica se podem jogar em CAMPEONATO
                    //Chama JOGO
                    
                 break;
                 
                case 3:
                    Camp.ImprimirTabela();
                    
                 break;
                 
                case 4:
                    Camp.ComputarVencedor();
                    break;
                    
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
                     
                  
            }
        
        
        
         }
        
           
     }
}
