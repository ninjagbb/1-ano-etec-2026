package Atividade2;

import javax.swing.JOptionPane;

public class Exemplo2 {
	public static void main (String args[]) {
//		 String nomeDoProduto = JOptionPane.showInputDialog("digite o nome do produto");
//		 double valor = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do produto"));
//		 int quantidade = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de produtos"));
//		 double valorTotal = valor * quantidade;
//		 double compra = Double.parseDouble(JOptionPane.showInputDialog("digite o dia do mês: "));
//		 double entrega = compra + 5;
//		 
//		 
//		 System.out.println("Produto: " + nomeDoProduto );
//		 System.out.println("Valor do produto: R$" +valor );
//		 System.out.println("Valor da compra: R$" + valorTotal );
//		 System.out.println("Entrega dos produtos:  " + entrega + " dias uteis");
//		
//		 JOptionPane.showMessageDialog(null,"Produto:  " + nomeDoProduto +
//                                            "\nValor do produto: " + valor +
//                                            "\nQuantidade de Produtos: " + quantidade  +
//                                            "\nValor da compra: " + valorTotal +
//                                            "\nDia da entrega: " +  entrega + " dias uteis");
//		 JOptionPane.showMessageDialog(null,"Obrigado pela compra" );
		
		 // conversão de uma classe para outra
		 // String para Double: Double.parseDouble(o valor a ser convertido, sera possivel fazer calculos)
		 // String para Int : Integer.parseInt ( valor a ser convertido )
		 
//		 String nome  = JOptionPane.showInputDialog("digite o nome do aluno:");
//		 double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1ª nota:"));
//		 double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2ª nota:"));
//		 double media  = ( nota1 + nota2 ) / 2;
//		 
//		 JOptionPane.showMessageDialog(null,"Nome do aluno:  " + nome +
//                                            "\n1ª nota: " + nota1 +
//                                            "\n2ª nota: " + nota2  +
//                                            "\nMédia Bimestral: " + media );
//		 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		if ( idade>= 18 ) {
			JOptionPane.showMessageDialog(null,"Sua idade é apropriada" );
		}
		else {
			JOptionPane.showMessageDialog(null,"Sua idade não é compátivel" );
		}
			
		
}}
