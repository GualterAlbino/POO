package heranca;

import Animais.Animais;

import Animais.Mamifero;

import Animais.Peixes;

import Animais.Reptil;

import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;
        
public class Heranca {

    public static void main(String[] args) {
       
    Mamifero objMamiefero = new Mamifero("Vaca", "Ranjada", "Pasto", 2, "Capim e Sal");
    Peixes objPeixes = new Peixes("Tilapia", "Prateado", "Lagoa", 40, 2);
    Reptil objReptil = new Reptil("Lagarto", "Marron", "Galinheiro", 4, false);
    Funcoes Fun = new Funcoes();
    
    List <Animais> Lista;
    Lista = new ArrayList<Animais>();
           
    Lista.add(objMamiefero);
    Lista.add(objPeixes);
    Lista.add(objReptil);
    
    
      int tam = Lista.size();
    
    for(int i=0; i < tam; i++){
       if (Lista.get(i).getCodigo() < 10){
           
           String Inicio = ("Nome: "+Lista.get(i).getNome() + "\nCor: " + Lista.get(i).getCor() + "\nHabitat: "+ Lista.get(i).getHabitat() + "\nCodigo: " + Lista.get(i).getCodigo());
        
           if(Lista.get(i).getClass() == objMamiefero.getClass()){
               Mamifero obj = new Mamifero();
               
               obj = (Mamifero) Lista.get(i);
                  
               String msgM = (Inicio + "\nTipo de Alimentacao: " + obj.getTipoAlimentacao() + "\nVelocidade: " +obj.getVelocidade() + "\n");
               Fun.ImprimirString(msgM);
           }
           
           if(Lista.get(i).getClass() == objPeixes.getClass()){
               Peixes obj0 = new Peixes();
               
               obj0 = (Peixes) Lista.get(i);
               
               String msgP = (Inicio + "\nComprimento: " + obj0.getComprimento() + "\nBarbatana: " + obj0.getQntBarbatana() + "\n");
               Fun.ImprimirString(msgP);
           }
           if(Lista.get(i).getClass() == objReptil.getClass()){
               Reptil obj6 = new Reptil();
               
               obj6 = (Reptil) Lista.get(i);
               
               String msgR = (Inicio + "\nQuantidade de patas: "+ obj6.getQntPatas() + "\nAnfibio: " + obj6.isAnfibio());
               Fun.ImprimirString(msgR);
               
               
           }
               
               
   
       }
      
    }
    
    }
    
}
