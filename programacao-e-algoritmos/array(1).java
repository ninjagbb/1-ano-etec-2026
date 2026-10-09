package ativArray;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class array {

	public static void main(String[] args) {
	
		
//		String nome[] = new String[50];
//		//É como se fosse 50 variaveis
//
//		double valor[] = new double[1000];
//		//aceita 1000 numeros
//
//		int idade[] =new int[20];
//
//		boolean verificado[] =new boolean[100];
//		
//		
//		nome[0] = JOptionPane.showInputDialog("Entre com o nome");
//		nome[1] = "Maria";
//		System.out.println("Nome:  " + nome[0]);
//		System.out.println("Nome:  " + nome[1]);
//		
//		valor[0] = 1000;
//		valor[1] = 3;
//		double total = valor[0] * valor[1];
//		System.out.println("Total:  " + total);
//		
//		for (int i = 0; i < 1000; i++) {
//			valor[1] = (int)(Math.random() * 100);
//			System.out.println(valor[i]);
//		}
		
		
//		String alunos[]= {"Gabriel Ribeiro","Joao Pedro","Jose Elias"};
//		
//		double nota1[] = new double[3];
//		double nota2[] = new double[3];
//		double media[] = new double[3];
//        String situacao[] = new String[3];
//        int apr = 0, rep = 0, rec = 0;
//        double maiorMedia = 0, menorMedia = 11;
//        String nomeMaior = "", nomeMenor = "" ;
//        
//        
//        System.out.println("====================================================");
//        System.out.println("Nome:\t\tNota 1:\tNota 2:\tMédia:\tSituacao:");
//        System.out.println("====================================================");
//        for (int i = 0; i < alunos.length; i++) {
//        	nota1[i] = (int)(Math.random() * 11);
//        	nota2[i] = (int)(Math.random() * 11);
//        	media[i] = (nota1[i] + nota2[i]) /2;
//        	
//        	if(media[i] > maiorMedia) {        	
//        		maiorMedia = media[i];
//        		nomeMaior = alunos[i];
//        	}
//        	if(media[i] > menorMedia) {
//        		menorMedia = media[i];
//        		nomeMenor = alunos[i];
//        	}
//        	
//        	
//        	if(media[i] <= 4.9) {
//        		situacao[i] = "Reprovado";
//        		rep++;
//        	}else if(media[i] <=6.9)
//        	{
//        		situacao[i] = "Recuperação";
//        		rec++;
//        		}else {
//        			situacao[i] = "Aprovado";
//        			apr++;
//        		}
//        	System.out.println(alunos[i] + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + media[i] + "\t" + situacao[i]);
//        	
//        	}
//				
//		
//		System.out.println("====================================================");
//		System.out.println("\t\t\tReprovados:\t" + rep);
//		System.out.println("\t\t\tRecuperação:\t" + rec);
//		System.out.println("\t\t\tAprovados: \t" +apr);
//		System.out.println("====================================================");
//		System.out.println("\t\t\tMaior Média:\t" + rep);
//		System.out.println("\t\t\tNome:\t" + rec);
//		System.out.println("\t\t\tMenor Média" +apr);
//		System.out.println("\t\t\tNome" +apr);
//		System.out.println("====================================================");			
//		
		
		int  matricula[] = new int [20];
		double bruto[] = new double[3000];
		double liquido[] = new double[20];
		double desconto[] = new double [20];
		String valor[] = new String[20];
		double mediab = 0; 
		double medial= 0; 
		double totalb = 0;
		double totall = 0;
		boolean continuar = true;
		
		
	    String funcionario[] = {"Gabriel Ribeiro","João Pedro","José Antonio","José Elias",
	    		   "Kauã Ribeiro","Luis Antonio","Lyncon Gabriel","Manuela Reis",
	    		   "Maria Fernanda","Mariana Silva","Messias Castro","Murillo ",
	    		   "Rebecca Jesus","Rinaldo Silva","Samuel Sousa","Sophia Campos",
	    		   "Taisa Nunes","Tiago Dias","Valentina ","Yuri Gabriel"};
	    
	    
	      System.out.println("====================================================================");
	       System.out.println("matr.:\tfuncionario:\t\tsalario bruto: \tvalor:\t salario liquido:");
	       System.out.println("====================================================================");
	    
	    
	       for (int i = 0; i < funcionario.length; i++) {
	    	   matricula[i] = (int)(Math.random() * 1001);
	    	   bruto[i] = (int)(Math.random() * 3001);
	    	   totalb += bruto[i];
	
	    	   
	       	if (bruto[i]<= 1000) {
	   			desconto[i] = 0.9;
	   			liquido[i] =Math.floor( bruto[i] * desconto[i]);
	   			valor[i] = "10%";
	       	}else if(bruto[i] <= 2000) {
	       		desconto[i] = 0.85;
	       		liquido[i] =Math.floor( bruto[i] * desconto[i]);
	   			valor[i] = "15%";
	   		}else{
	   			desconto[i] = 0.8;
	   			liquido[i] =Math.floor( bruto[i] * desconto[i]);
	   			valor[i] = "20%";
	   		}
	      
	    	
	
	
	       	
	       	totall += liquido[i];
	       	
	       	System.out.println(matricula[i] + "\t" + funcionario[i] + "\t" + "\t" + bruto[i] + "\t\t" + valor[i] + "\t" + liquido[i]);
	       	System.out.println("");
	       	
	       }
	
	       
	       mediab = Math.floor(totalb/ 20);
	       medial = Math.floor(totall/ 20); 
	       System.out.println("=================================================================================================");
	       System.out.println("\tMédia dos salarios brutos: " + mediab);
	       System.out.println("\tMédia dos salarios liquidos: " + medial);
	       System.out.println("=================================================================================================");
	       
	       
	       do {
	      int resposta = JOptionPane.showConfirmDialog(null, "Deseja efetuar uma consulta?", null, JOptionPane.YES_NO_OPTION);
	      
	    switch (resposta) {
	    case 0:
	    	String numeroMatr = JOptionPane.showInputDialog("Digite o número da matrícula");
	    	int procurarMatr = Integer.parseInt(numeroMatr); 
	    	boolean encontrar = false;
	    	String nomeFun = "";
	    	double salBru = 0;
	    	double salLiq = 0;
	    	
	    	
	    	
	    for (int j = 0; j < matricula.length; j++) {
			if(matricula[j] == procurarMatr) {
				encontrar = true;
				nomeFun = funcionario[j];
				salBru = bruto[j];
				
				if (salBru <= 1000) {
					salLiq = salBru - ((salBru/100) *10);
				}else if (salBru <= 2000) {
					salLiq = salBru - ((salBru/100) *15);
				}else {
					salLiq = salBru - ((salBru/100) *20);
				}
				break;
			}
		}
	    if(encontrar) {
	    	System.out.println("Matrícula: " + procurarMatr + "\t\t" + "Nome: " + nomeFun +
	    			            "\t" + "Salário: " + salBru + "\t" + "Salário líquido: " + salLiq);
	    }else {
	    	System.out.println("Matrícula: " + procurarMatr + "Não encontrada");
	    }
	    break;
	    
	    case 1:
	    	JOptionPane.showMessageDialog(null, "Saindo do Programa");
	    	continuar = false;
	    	break;
	    	default: 
	    		continuar = false;
	    }
	       }while(continuar);  
	
	}}



