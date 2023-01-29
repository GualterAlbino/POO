
package projetinho;

public class Triangulo {
    
    /*Atributos*/
    
    private int lado1;
    private int lado2;
    private int lado3;
    
    /* Metodos gettes e settes */
    
    public int getLado1(){
        return lado1;
    }
    
    public void setLado1( int pLado ){
        if((pLado > 0 ) && (pLado <= 1000)){
            lado1 = pLado;
            
        }
    
    }
    
    
    
    public int getLado2(){
        return lado2;
    }
    
    public void setLado2( int pLado ){
        if((pLado > 0 ) && (pLado <= 1000)){
            lado2 = pLado;
            
        }
    
    }
    
    
    public int getLado3(){
        return lado3;
    }
    
    public void setLado3( int pLado ){
        if((pLado > 0 ) && (pLado <= 1000)){
            lado3 = pLado;
            
        }
    
    }
    
    
    
    /*Metodos*/
    
    public int calculaPerimetro(){
        
        return lado1 + lado2 + lado3;
    }
    
    public void imprimirDados(){
        String mensagem = ">>Triangulo<<" + 
                           "\nlado 1 = " + lado1 + 
                           "\nlado 2 = " + lado2 +
                           "\nlado 3 = " + lado3 +
                           "\nPerimetro = " + calculaPerimetro();
        
        System.out.println(mensagem);
    }
    
    public int maiorLado(){
        
        int maior = lado1;
        maior = lado1;
        
        if(maior < lado2){
            maior = lado2;
            
        }else if(maior < lado3){
            maior = lado3;
        }
        
        return maior;
    }
    
    public void imprimeMaior(){
        String mensagem = "O maior lado e: ";
        System.out.println(mensagem + maiorLado());
    }
    
    
    
}
