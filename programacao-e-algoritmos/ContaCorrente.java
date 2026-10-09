package ContaCorrente;

import javax.swing.JOptionPane;

public class ContaCorrente {

    double saldo = 1000;

    public static void main(String[] args) {

        // Instanciação do objeto da classe
        ContaCorrente cc = new ContaCorrente();

        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal" +
                    "\n1 - Consultar Saldo" +
                    "\n2 - Sacar" +
                    "\n3 - Depositar" +
                    "\n4 - Verificar Senha" +
                    "\n5 - Financiar" +
                    "\n0 - Sair"));

            switch (opcao) {
                case 0:
                    opcao = JOptionPane.showConfirmDialog(null, "Deseja Encerrar o Programa?", 
                            "Sair", JOptionPane.YES_NO_OPTION);

                    if (opcao == 0) {
                        System.exit(0);
                    }
                    break;

                case 1:
                    // com ret e sem param
                    JOptionPane.showMessageDialog(null, "Saldo: " + cc.consultarSaldo());
                    break;

                case 2:
                    // sem ret e com param
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                    cc.sacar(saque);
                    break;

                case 3:
                    // sem ret e sem param
                    cc.depositar();
                    break;

                case 4:
                    // com ret e com param
                    int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));

                    if (cc.verificarSenha(senha)) {
                        JOptionPane.showMessageDialog(null, "Senha Confere");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha Inválida");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, cc.financiar());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, opcao + " - Opção Inválida");
                    break;
            }
        } while (opcao != 0);

    } // fim do método main ()


    // void: sem retorno

    // método sem retorno e sem parâmetro
    public void depositar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do depósito"));
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
    }

    // método sem retorno e com parâmetro
    public void sacar(double saque) {
        saldo -= saque;
    }

    // método com retorno e sem parâmetro
    public double consultarSaldo() {
        return saldo;
    }

    // método com retorno e com parâmetro
    public boolean verificarSenha(int senha) {
        if (senha == 123) {
            return true;
        } else {
            return false;
        }
    }

    public boolean score() {
        int score = 1000;
        if (score >= 1000) {
            return true;
        } else {
            return false;
        }
    }

    public String financiar() {
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
        if (score() && verificarSenha(senha)) {
            return "Crédito Aprovado";
        } else {
            return "Crédito Reprovado";
        }
    }

}
