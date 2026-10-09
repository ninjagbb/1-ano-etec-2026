package Arrayt;

import javax.swing.JOptionPane;

public class Arrayt {

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
		
		
		String alunos[]= {"Gabriel Ribeiro","Joao Pedro","Jose Elias"};
		
		double nota1[] = new double[3];
		double nota2[] = new double[3];
		double media[] = new double[3];
        String situacao[] = new String[3];
        int apr = 0, rep = 0, rec = 0;
        double maiorMedia = 0, menorMedia = 11;
        String nomeMaior = "", nomeMenor = "" ;
        
        
        System.out.println("====================================================");
        System.out.println("Nome:\t\tNota 1:\tNota 2:\tMédia:\tSituacao:");
        System.out.println("====================================================");
        for (int i = 0; i < alunos.length; i++) {
        	nota1[i] = (int)(Math.random() * 11);
        	nota2[i] = (int)(Math.random() * 11);
        	media[i] = (nota1[i] + nota2[i]) /2;
        	
        	if(media[i] > maiorMedia) {        	
        		maiorMedia = media[i];
        		nomeMaior = alunos[i];
        	}
        	if(media[i] > menorMedia) {
        		menorMedia = media[i];
        		nomeMenor = alunos[i];
        	}
        	
        	
        	if(media[i] <= 4.9) {
        		situacao[i] = "Reprovado";
        		rep++;
        	}else if(media[i] <=6.9)
        	{
        		situacao[i] = "Recuperação";
        		rec++;
        		}else {
        			situacao[i] = "Aprovado";
        			apr++;
        		}
        	System.out.println(alunos[i] + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + media[i] + "\t" + situacao[i]);
        	
        	}
				
		
		System.out.println("====================================================");
		System.out.println("\t\t\tReprovados:\t" + rep);
		System.out.println("\t\t\tRecuperação:\t" + rec);
		System.out.println("\t\t\tAprovados: \t" +apr);
		System.out.println("====================================================");
		System.out.println("\t\t\tMaior Média:\t" + rep);
		System.out.println("\t\t\tNome:\t" + rec);
		System.out.println("\t\t\tMenor Média" +apr);
		System.out.println("\t\t\tNome" +apr);
		System.out.println("====================================================");			
		
		
		
		
		
		
		
		
		
		
		
}}
