package Atividade2;

import javax.swing.JOptionPane;

public class exemploAula09 {
	public static void main (String args[]) {

//  >= maior ou igual  <=  == igual    !=diferente      !negação, inversão
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		/* abaixo de zero = invalida
		 * 0 até 17 = menor
		 * 18 até 64 = adulto
		 * 65 em diante = idoso
		 */
		
		if(idade < 0) {
			JOptionPane.showMessageDialog(null, "Idade Inválida!");
		}else if(idade <=17) {
			JOptionPane.showMessageDialog(null, "Você é Menor: " +  idade + "anos.");
		}else if(idade <= 64) {
			JOptionPane.showMessageDialog(null, "Você é Adulto: " + idade + "anos.");
		}else {
			JOptionPane.showMessageDialog(null, "Você é Idoso: "  + idade + "anos.");
		}
		
		//Case Sensitive
		String resposta = JOptionPane.showInputDialog("Digite uma resposta: Sim ou Não");
		
		if(resposta.equalsIgnoreCase("Sim")) {
			JOptionPane.showMessageDialog(null, "Você Respondeu sim");
		}else if(resposta.equalsIgnoreCase("Não")) {
			JOptionPane.showMessageDialog(null, "Você Respondeu Não");
		}else {
			JOptionPane.showMessageDialog(null, "Você respondeu errado");
		}
		
		int resposta2 = JOptionPane.showConfirmDialog(null, "Você possui descendentes?", "Escolha uma opção",
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(resposta2 == 0) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));
		}else if(resposta2 == 1) {
			JOptionPane.showMessageDialog(null, "Você Não Tem Dependentes: ");
		}else {
			JOptionPane.showMessageDialog(null, "CANCELADO: ");
		}
		
		/* Salário
		 *  menos de 1500,00 = Valor Inválido
		 *  1500,00 até 2000 = 30%
		 *  2000,01 até 3000 = 20%
		 *  3000,01 até 4000 = 10%
		 *  acima de    4000 = 5%
		 * 
		 */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario"));
	    double aumento = 0;
	    double salarioAntigo = salario;
		boolean valido = true;
	
		if(salario <1500) {
			JOptionPane.showMessageDialog(null, "Valor do Salário Imválido");
			valido = false;
		}else if(salario<=2000) {
			aumento = salario * 0.3;
		}else if (salario <=3000) {
			aumento = salario * 0.2;
		}else if (salario <=4000)
		
		
		if(valido) {
			Salario = salario + aumento;
			JOptionPane.showMessageDialog(null, "Salário Antigo: " + salarioAntigo +
		                                        "\nAumento: "      + aumento       +
		                                        "\nSalário Novo: " + salario);
	
		}
		
		//Operadores Lógicas: E (&&)  OU(||)   !negação, inversão
       //Seleção de candidatos a vaga de motorista:
		//idade >=25 e cnh OU experiência
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		String  cnh = JOptionPane.showInputDialog("Possui cnh? Sim ou Não");
		String experiencia = JOptionPane.showInputDialog("Possui experiência? Sim ou Não");
		String tipo = JOptionPane.showInputDialog("Possui cnh tipo D? Sim ou Não");
		//      V/F    V/F
		if(idade >=25 && experiencia.equalsIgnoreCase("Sim") || !cnh.equalsIgnoreCase("Sim")
		
		
		
		
}}
