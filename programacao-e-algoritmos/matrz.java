package pgea;

import javax.swing.JOptionPane;

public class matrz {

	public static void main(String[] args) {
		
		
//		int matriz[][] = new int[3][4]; //3 linhas e 4 colunas
		
		
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("Linha: " + i);
//			for (int j = 1; j <=4; j++) {
//				System.out.println(j + " | ");
//			}
//			System.out.println();
//		System.out.println("-----------------");
//			
//		}
//		int matriz[][] = new int[3][4]; 
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				matriz[i][j] = (int)(Math.random() * 10);
//				System.out.println(matriz[i][j] + " | ");
//			}
//			System.out.println();
//			System.out.println("-----------------");
//				
//		}
//		System.out.println();
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0;j < 4; j++) {
//				matriz[i][j] *= numero ;
//				System.out.println(matriz[i][j] + " | ");
//			}
//			System.out.println();
//			System.out.println("-------------------");
//		}
//		System.out.println();
//		System.out.println(matriz[2][3]);	
		
		
		
		
//		Atividade 1
//		
//		
//		int matrizM[][] = new int[4][6]; 
//		int matrizN[][] = new int[4][6]; 
//		int produto[][] = new int[4][6]; 
//		int soma[][] = new int[4][6]; 
//		int dife[][] = new int[4][6]; 
//		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 6; j++) {
//				matrizM[i][j] = (int)(Math.random() * 10);
//				matrizN[i][j] = (int)(Math.random() * 10);
//			}
//		}
//		
//		
//		System.out.println("MatrizM:");
//		for (int i = 0; i < 4; i++) {
//		    for (int j = 0; j < 6; j++) {
//		        System.out.print(matrizM[i][j] + " | "); 
//		    }
//		    System.out.println(); 
//		}
//
//		System.out.println("-----------------");
//
//		System.out.println("MatrizN:");
//		for (int i = 0; i < 4; i++) {
//		    for (int j = 0; j < 6; j++) {
//		        System.out.print(matrizN[i][j] + " | ");
//		    }
//		    System.out.println();
//		}
//		
//		
//
//		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 6; j++) {
//				produto[i][j] = matrizM[i][j] * matrizN[i][j];
//				soma[i][j] = matrizM[i][j] + matrizN[i][j];
//				dife[i][j] = matrizM[i][j] - matrizN[i][j];
//			}
//		}
//		
//		
//		System.out.println("Produto:");
//		for (int i = 0; i < 4; i++) {
//		    for (int j = 0; j < 6; j++) {
//		        System.out.print(produto[i][j] + " | "); 
//		    }
//		    System.out.println(); 
//		}
//		
//		System.out.println("-----------------");
//
//		System.out.println("Soma:");
//		for (int i = 0; i < 4; i++) {
//		    for (int j = 0; j < 6; j++) {
//		        System.out.print(soma[i][j] + " | ");
//		    }
//		    System.out.println();
//		}
//		
//		System.out.println("-----------------");
//
//		System.out.println("Diferença:");
//		for (int i = 0; i < 4; i++) {
//		    for (int j = 0; j < 6; j++) {
//		        System.out.print(dife[i][j] + " | ");
//		    }
//		    System.out.println();
//		}
//		
		
		
		// Atividade 2
		
//		int[][] matrizM = new int[6][6];
//        int[][] resul = new int[6][6];
//        int valor = 3;
//		
//        for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 6; j++) {
//			matrizM[i][j] = (int)(Math.random() * 10);
//			
//		}
//		}
//        
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                resul[i][j] = matrizM[i][j] * valor;
//            }
//        }
//        
//        
//        
//        System.out.println("Resultado da Matriz M * " + valor );
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print(resul[i][j] + " | ");
//            }
//            System.out.println();
//        
//        
//        
//        
//        
//        
//	}

		
//		Atividade 3
//		int iy = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha"));
//		int jy  = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna"));
//		int[][] matrizM = new int[iy][jy];
//		
//		for (int i = 0; i < iy; i++) { 
//            for (int j = 0; j < jy; j++) { 
//                matrizM[i][j] = (int)(Math.random() * 10); 
//            }}
//	
//		
//		System.out.println("MatrizM:");
//		for (int i = 0; i < iy; i++) {
//		    for (int j = 0; j < jy; j++) {
//		        System.out.print(matrizM[i][j] + " | "); 
//		    }
//		    System.out.println(); 
//		}
//
//		System.out.println("-----------------");
//		
//		for (int i = 0; i < iy; i++) {
//		    for (int j = 0; j < jy; j++) {
//		        System.out.println("Posição: " + i + " x " + j + " = " + matrizM[i][j]);
//		    }
//		    System.out.println(); 
//		}
//		
//		
//		
//		
		
//		Atividade 4
//		int iy = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha"));
//		int jy  = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna"));
//		int matrizM[][] = new int[4][6]; 
//		int soma = 0;
//		
//		
//		System.out.println("\t\t\t\t" + "Matriz");
//		for (int i = 0; i < iy; i ++) {
//				for (int j = 0; j < jy; j ++ ) {
//					matrizM[i][j] = (int)(Math.random() * 10);
//					System.out.print( matrizM[i][j] + " | ");
//	             
//					
//					soma = soma + matrizM[i][j];
//	                
//                				
//				}
//				System.out.print("= " + soma);
//                soma = 0;
//				
//					System.out.println();
//					System.out.println("-----------------------------------------------------------------------------------");
//	
//				
//		
//          	}
		
//		Atividade 5
	
		int MatrizM[][] = new int [10][10];			
		
		
		System.out.println("Matriz M");
		for (int i = 0; i < 10; i ++) {
				for (int j = 0; j < 10; j ++ ) {
					MatrizM[i][j] = (int)(Math.random() * 10);
					System.out.print(MatrizM[i][j] + " | ");
	
					
				     							
				}
					System.out.println();
					System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		
					
		
		}
		
int consulta = JOptionPane.showConfirmDialog(null,"Deseja consultar se algum número está na matriz ?","Sim ou Não",JOptionPane.YES_NO_OPTION);
int repetir = 0;	
		
		if(consulta == JOptionPane.YES_OPTION) {
		
				do {
						int resposta = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
						boolean  encontrado = false;
							
						for (int i = 0; i < 10; i ++) {
							for (int j = 0; j < 10; j ++ ) {
								
									if(resposta == MatrizM[i][j]) {
										System.out.println("Número Existente :" + i + "x" + j + "=" + resposta);
										encontrado = true;	
									}
						
						    }
						
						}
					
				if(!encontrado){
						
					System.out.println("Este número não existe");
						
				}		
					
		
												
					
				repetir = JOptionPane.showConfirmDialog(null,"Deseja repetir o programa ?","Sim ou Não",JOptionPane.YES_NO_OPTION);	
					
				}while (repetir == JOptionPane.YES_OPTION);
		
		
		
		}				
		
		System.out.println("Sistema Finalizado!");


}}