package Ativis;


import javax.swing.JOptionPane;

public class AtivPOO {
	double kmInicial;
	double kmFinal;
	int quantidade;
	double precoUni;
	String nomeProduto;
	double valorFinal;
	double frete;
	double kmRodados;
	String porcentagem;
	double valorTotal;
	
	public static void main (String ARGS[]) {
		
		AtivPOO mercadoria = new AtivPOO();
		
		int opcao = 0;
		
		do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu principal"                             +
		                                                                   "\n1 - ler dados"                      +
						                                                   "\n2 - calcular KM rodados"            +
						                                                   "\n3 - calcular valor das mercadorias" +
						                                                   "\n4 - calcular valor do frete"        +
						                                                   "\n5 - exibir os dados"                +
						                                                   "\n0 - sair"));
				
				
				switch (opcao) {
				       case 0:
				    	   opcao = JOptionPane.showConfirmDialog(null,"deseja Encerrar o Programa?", "Sair",JOptionPane.YES_NO_OPTION);
				    	   
				    	   if (opcao == 0) {
				    		   System.exit(0);
				    	   }
				    	   break;
				    	   
				       case 1:
				    	   mercadoria.lerdados();
				    	   break;
				    	   
				       case 2:
				    	   mercadoria.calcularkmrodados(mercadoria.kmFinal,mercadoria.kmInicial);
				    	   break;
				    	   
				       case 3:
				    	   mercadoria.calcularvalordamercadoria();
				    	   break;
				    	   
				       case 4:
				    	   mercadoria.calculafrete(mercadoria.valorFinal);
				    	   break;
				    	   
				       case 5:
				    	   mercadoria.exibirdados();
				    	   break;
				    	   
				       default:
				    	   JOptionPane.showMessageDialog(null,opcao + " - Opção Invalida");
				    	   break;
				    	   
						}
		} while(opcao != 0);
		
		
	}
	
	 public void lerdados() {
		    
		    kmInicial = (Double.parseDouble(JOptionPane.showInputDialog("Entre com a quilometragem inicial da mercadoria")));
		    kmFinal = (Double.parseDouble(JOptionPane.showInputDialog("Entre com a quilometragem final da mercadoria")));		
		    quantidade = (Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade (unidades) da mercadoria")));
		    precoUni = (Double.parseDouble(JOptionPane.showInputDialog("Entre com o preço unitario da mercadoria")));
		    nomeProduto = JOptionPane.showInputDialog("Entre com o nome do produto");
		    
	        }
 
		   
	 public void calcularkmrodados(double kmfinal,double  kminicial) {
		    	    
		    	 kmRodados = kmfinal - kminicial;
			    JOptionPane.showMessageDialog(null,"Total de KM rodados pela mercadoria: " + kmRodados);
			    	
 
                 }
		    
		    
    public double calcularvalordamercadoria() {
		
	    	valorFinal = quantidade * precoUni;
	
		    JOptionPane.showMessageDialog(null,valorFinal);	
	    	
		    return valorFinal;
		    	
		    }
 
    public double calculafrete(double valorfinal) {
				
		    if(kmFinal <= 500) {
		    
		     frete = valorfinal * 0.1;	
		     porcentagem = "10%";
		     valorfinal = valorfinal + frete;
		    
		    }else if(kmFinal <= 1000) {
		    	
		     frete = valorfinal * 0.15;
		     porcentagem = "15%";
		     valorfinal = valorfinal + frete;
		     
		    }else if(kmFinal <= 1500) {
		    	
		     frete = valorfinal * 0.20;	
		     porcentagem = "20%";
		     valorfinal = valorfinal + frete;
		     
		    }else {
		    
		     frete = valorfinal * 0.25;
		     porcentagem = "25%";
		     valorfinal = valorfinal + frete;
		     
		    }
		
		    JOptionPane.showMessageDialog(null,porcentagem);
		    
			    return frete;
			    	
			    }
    
    
    public void exibirdados() {
    
    valorTotal = valorFinal + frete;	
    	
    JOptionPane.showMessageDialog(null,"\nNome do produto: " + nomeProduto                      	+
    		                           "\nquantidade do produto (unidades): " + quantidade      	+
    		                           "\nPreço do produto por unidade: " + precoUni            	+
    		                           "\nquilometragem que a mercadoria percorreu: "+ kmRodados	+
    		                           "\nFrete imposto em cima da mercadoria: " + porcentagem  	+
    		                           "\nValor final após o acresimo do frete: " + valorTotal);
     
                }
			
			 }
	
 
 