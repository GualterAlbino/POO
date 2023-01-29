
package com.mycompany.inss;


public class Funcionario {
    
    /*Declaração de variaveis*/
    
    private String nome;
    private int codigo;
    private double salarioBase;
    private double salarioLiquido;
    
    /*Metodos GET & SET*/
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String pNome){
        nome = pNome;
    }
    
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int pCodigo){
         codigo = pCodigo;  
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double pSalarioBase){
        salarioBase= pSalarioBase;
    }
    
    public double getSalarioLiquido(){
        return salarioLiquido;
    }
    public void setSalarioLiquido(float pSalarioLiquido){
        salarioLiquido=pSalarioLiquido;
    }   
    
    
    
    /*Metodos*/
    
    public double calcINSS(){
        
        double INSS = getSalarioBase();
       
        
        if(INSS <=  1212){
            INSS = ((INSS*7.5)/100);
            System.out.println("O desconto do INSS é de: " + INSS);
            return INSS;
            
        }else if((INSS >= 1213) && (INSS <= 3500)){
            INSS = ((INSS*9)/100);
            System.out.println("O desconto do INSS é de: " + INSS);
            return INSS;
            
        }else{
            
            INSS =((INSS*12)/100);
            System.out.println("O desconto do INSS é de: " + INSS);
            return INSS;
        }
        
    }
  
    public double calcIR(){
        
       double IR = getSalarioBase();
       
       if(IR <=  1212){
            IR =((IR*7.5)/100);
            System.out.println("O desconto do IR é de: " + IR);
            return IR;
            
        }else if((IR >= 1213) && (IR <= 3500)){
            IR =((IR *9)/100);
            System.out.println("O desconto do IR é de: " + IR);
            return IR;
            
        }else{
            IR = ((IR *12)/100);
            System.out.println("O desconto do IR é de: " + IR);
            return IR;
        }
       
    }
        
   public void calcSalarioLiquido(){
       
       double salarioLiquido;
       double IR = calcIR();
       double INSS = calcINSS();
       
       salarioLiquido= getSalarioBase()- IR - INSS;
       
       System.out.println("O salario liquido é de: " + salarioLiquido);
       
       
   } 
 




    
    
}
