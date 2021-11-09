package exercicioIdade;

import java.util.Scanner;

public class exercicioidadeDias {

	public static void main(String args[]) {
		
		
		int ano,mes,dias,totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos dias você já viveu: ");
		totalDias = leia.nextInt();
		
		ano = totalDias/365;
		mes = (totalDias % 365) /30;
		dias = (totalDias % 30);
		
		System.out.println("\nVocê viveu :"+ano+ "anos(s)" +mes+"mes(es)" +dias+ "dia(s) de vida!!");
		
		
		
		
	}
}
