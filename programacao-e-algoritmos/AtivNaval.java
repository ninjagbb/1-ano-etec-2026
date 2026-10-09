package AtivNaval;

import javax.swing.JOptionPane;

public class AtivNaval {

	public static void main(String[] args) {	
		
        String MatrizM[][] = new String [5][5];			
		
        
		for (int i = 0; i < 5; i ++) {
				for (int j = 0; j < 5; j ++ ) {
					MatrizM[i][j] = ("| Água  |");
					System.out.print(MatrizM[i][j]);
				}
					System.out.println();
					System.out.println("---------------------------------------------");
		}
		
		
		System.out.println();
		System.out.println();
			
					for (int i = 0; i < 5; i ++) {
						int coluna = (int)(Math.random() * 5);
						int linha = (int)(Math.random() * 5);
					    MatrizM [linha][coluna]= "| Navio |" ;
					}
					
					
					for (int i = 0; i < 5; i ++) {
						for (int j = 0; j < 5; j ++ ) {
							System.out.print(MatrizM[i][j]);
						}
						System.out.println();
						System.out.println("---------------------------------------------");
					}
					
					
					int repetir = 0;

					do {
					int linha = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha de ataque:")) ;
					int coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna de ataque:")) ;
					
					
					if (MatrizM[linha][coluna] ==("| Navio |")) {
						JOptionPane.showMessageDialog(null, "ACERTOU O NAVIO!");
						System.out.println("Linha\tColuna");
						System.out.println(linha + "\t" + coluna);
						repetir = JOptionPane.showConfirmDialog(null,"Deseja repetir o jogo ?","Sim ou Não",JOptionPane.YES_NO_OPTION);	
					}else{
						JOptionPane.showMessageDialog(null, "Deu água!!!");
						System.out.println("Linha\tColuna");
						System.out.println(linha + "\t" + coluna);
      				}
					
					
					
	}while (repetir == JOptionPane.YES_OPTION);



}				
	{
System.out.println("Jogo Finalizado!");
	}
}