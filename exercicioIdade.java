package exercicioIdade;

import java.util.Scanner;

public class exercicioIdade {

	public static void main(String args[]) {
		
		
		
		int ano, mes, dias, totalDias;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu nome: ");
		nome = leia.next();
		System.out.println("\nEntre com a quantidade de anos: ");
		ano = leia.nextInt();
		
		System.out.println("\nEntre com a quantidade de meses: ");
		mes = leia.nextInt();
		
		System.out.println("\nEntre com a quantidade de dias: ");
		dias = leia.nextInt();
		
		totalDias = ano*365 + mes*30 + dias;
		System.out.println("\nVocê viveu: "+totalDias+" dias de vida...");
		
		
	}
	
}

