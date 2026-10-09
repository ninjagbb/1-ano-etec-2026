package asd;

import javax.swing.JOptionPane;

public class asdativ {
		public static void main(String args[]) {
  /*      
	int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitores que deseja."));
	int can1 = 0;
	int can2 = 0 ;
	int can3 = 0 ;
	int can4 = 0 ;
	int nulo = 0 ;
	
	
			String n1 = JOptionPane.showInputDialog("digite o nome do primeiro candidato");
			String n2 = JOptionPane.showInputDialog("digite o nome do segundo candidato");
			String n3 = JOptionPane.showInputDialog("digite o nome do terceiro candidato");
			String n4 = JOptionPane.showInputDialog("digite o nome do quarto candidato");
			
			
			for( int i = 1; i<=quantidade; i ++ ) {
				int votos =  (int) (Math.random() * 5 );
					if(votos == 1) {
					  can1 += 1;
					}else if (votos == 2) {
					 can2 += 1;	
					}else if(votos == 3){
					 can3 += 1;
					}else if(votos == 4) {
					 can4 += 1;
					}else {
					 nulo += 1;
					}
			}
				  String lista = "\ntotal de elitores: " +quantidade  +
						            "\ntotal de votos do "+n1 + ": " + can1    +
						            "\ntotal de votos do "+n2 + ": " + can2       +
						            "\ntotal de votos do "+n3 + ": " + can3  +
						            "\ntotal de votos do "+n4 + ": " + can4  +
						            "\ntotal de votos nulos: " + nulo;
				        JOptionPane.showMessageDialog(null,lista);	

*/
		
			
	int resposta = 0;
	 do {
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitores que deseja."));
			int can1 = 0;
			int can2 = 0 ;
			int can3 = 0 ;
			int can4 = 0 ;
			int nulo = 0 ;
			
			
			
			
					String n1 = JOptionPane.showInputDialog("digite o nome do primeiro candidato");
					String n2 = JOptionPane.showInputDialog("digite o nome do segundo candidato");
					String n3 = JOptionPane.showInputDialog("digite o nome do terceiro candidato");
					String n4 = JOptionPane.showInputDialog("digite o nome do quarto candidato");
					
					
						for( int i = 1; i<=quantidade; i ++ ) {
							int votos =  (int) (Math.random() * 5 );
								if(votos == 1) {
								  can1 += 1;
								}else if (votos == 2) {
								 can2 += 1;	
								}else if(votos == 3){
								 can3 += 1;
								}else if(votos == 4) {
								 can4 += 1;
								}else {
								 nulo += 1;
								}
						} 
					
					
					double por =(100* can1)/quantidade;
					double por2 =(100* can2)/quantidade;
					double por3 =(100* can3)/quantidade;
					double por4 =(100*can4)/quantidade;
					double pon =(100* nulo)/quantidade;


					int votacao = Math.max(Math.max(can1, can2),
							               Math.max(can3, can4));
					
			       String ven = "";
					if( votacao == can1) {
						ven = n1;
					}else if(votacao == can2){
						ven = n2;
					}else if(votacao == can3) {
						ven = n3;
					}else {
						ven = n4;
					}
					
							                                   
						  String lista = "\ntotal de elitores: " + quantidade +
								    "\n-------------------------------------" +
                                    "\n O vencedor é :"  + " " +    ven	      +
                                    "\n-------------------------------------" +
						            "\ntotal de votos do "+ n1 + ": " + can1  +" | "+ por + "%"  +
                                    "\ntotal de votos do "+ n2 + ": " + can2  +" | "+ por2 + "%" +
						            "\ntotal de votos do "+ n3 + ": " + can3  +" | "+ por3 + "%" +
						            "\ntotal de votos do "+ n4 + ": " + can4  +" | "+ por4 + "%" +
						            "\ntotal de votos nulos: " + nulo +" | "+ pon +"%";
						        JOptionPane.showMessageDialog(null,lista);	
            
			resposta =JOptionPane.showConfirmDialog(null,"deseja executar novamente? "," ",JOptionPane.YES_NO_OPTION);			        
						        
	 }while(resposta == 0);        
						        
        }}