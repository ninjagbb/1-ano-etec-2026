package Atividade;


import javax.swing.JOptionPane;

public class atividadenova {
    public static void main(String[] args) {
        
        // 1. Entrada de dados
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de diárias:"));
        
        // 2. Definição dos valores base
        double valorDiariaBase = 380.00;
        double taxaServico;
        
        // 3. Regra da taxa de serviço (if/else)
        if (dias >= 10) {
            taxaServico = 30.00;
        } else {
            taxaServico = 40.00;
        }
          
        // 4. Cálculos parciais
        double totalDiarias = dias * valorDiariaBase;
        double totalTaxas = dias * taxaServico;
        double totalGeral = totalDiarias + totalTaxas;
        
        // 5. Verificação do Voucher (utilizando o confirmDialog que você usou no exemplo)
        int temVoucher = JOptionPane.showConfirmDialog(null, "Você possui um voucher de desconto?", 
                "Voucher", JOptionPane.YES_NO_OPTION);
        
        double valorDesconto = 0;
        
        if (temVoucher == JOptionPane.YES_OPTION) {
            valorDesconto = totalGeral * 0.10; // 10% de desconto
        }
        
        double valorFinal = totalGeral - valorDesconto;
        
        // 6. Exibição do resultado
        String mensagem = String.format(
            "Resumo da Hospedagem:\n" +
            "Número de dias: %d\n" +
            "Total das diárias: R$ %.2f\n" +
            "Total das taxas: R$ %.2f\n" +
            "Total sem desconto: R$ %.2f\n" +
            "Desconto aplicado: R$ %.2f\n" +
            "---------------------------\n" +
            "VALOR FINAL: R$ %.2f", 
            dias, totalDiarias, totalTaxas, totalGeral, valorDesconto, valorFinal
        );
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}