package Atividade2;

import javax.swing.JOptionPane;

public class Exemplo {
	public static void main (String args[]) {
        //criar variáveis: tipo nome de variável
        //inicializa
        double precoUnitario = 25.5;
        int quantidade = 10;
        double total = precoUnitario * quantidade;
        
        String nome = JOptionPane.showInputDialog("digite o nome");
        String endereço = JOptionPane.showInputDialog("digite seu endereço");;
        String cpf =  JOptionPane.showInputDialog("digite seu cpf");
        String rg =  JOptionPane.showInputDialog("digite seu rg");
        
        // + concatenação
        System.out.println("Preço unitario: R$" + precoUnitario);
        System.out.println("Quantidade Comprada:" + quantidade);
        System.out.println("Total da compra: R$" + total);
        System.out.println("Cliente: " + nome  );
        System.out.println("Endereço: " + endereço  );
        
        System.out.println("-------------------------------------");
        
        System.out.println("Preço Unitário" + precoUnitario +
        		           "\nQuantidade Comprada:" + quantidade +
        		           "\nTotal da compra: R$" + total);
       
        
        //boolean: armazena somente true (verdadeiro) ou false (falso)
        boolean maior = true;
        boolean dependente = false;
        boolean matriculado = true;
        
        // String : é uma classe, não variável, e armazena qualquer caracter do teclado
        // sempre estar entre aspas duplas para armazenar
        
        /* Operadores aritmeticos: + - / divisão  *multiplicação
         * Operadores relacionais: > < >= ==igualdade =!diferente !negação,inversão
         * Operadores Lógicos: && ("e" de adição) || ( ou )
         */
        
        JOptionPane.showMessageDialog(null,"Nome: " + nome +
                                           "\nEndereço: " + endereço +
                                           "\nCPF: " + cpf  +
                                           "\nRG: " + rg );
        
        
        
}}
