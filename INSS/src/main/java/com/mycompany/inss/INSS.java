
package com.mycompany.inss;
import java.util.Scanner;

public class INSS {

    public static void main(String[] args) {
        
        int codigo;
        double salarioBase;
        String nome;
        
        Scanner ler = new Scanner(System.in);
        Funcionario trabalhador = new Funcionario();
        
        System.out.printf("Informe o codigo do funcionario: ");
        codigo = ler.nextInt();
        trabalhador.setCodigo(codigo);
        
        System.out.printf("Informe o nome do funcionario: ");
        nome = ler.next();
        
        System.out.printf("Informe o salario base do funcionario: ");
        salarioBase = ler.nextDouble();
        trabalhador.setSalarioBase(salarioBase);
        
        
        trabalhador.calcINSS();
        trabalhador.calcIR();
        trabalhador.calcSalarioLiquido();
        
        
        System.out.println("THE END!");
    }
}
