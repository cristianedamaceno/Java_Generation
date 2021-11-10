package exercicioIdade;

import java.util.Scanner;

public class laçoDecisão03 {

	public static void main(String args[]) {
		
		int ano,nasc,idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o ano atual:  ");
		  ano = leia.nextInt();
		  System.out.println("\nDigite o seu ano de nascimento:  ");
		  nasc = leia.nextInt();
		  
		  idade = ano - nasc;
		  
		  if(idade>10 && idade<=14) {
			  
			  System.out.println("\n Você é uma criança. ");
		  }
		  
		  if(idade>15 && idade<=17) {
			  
			  System.out.println("\n Você é um jovem. ");
		  }
		  
		   else if (idade>18 && idade<=25) {
			  
			  System.out.println("\n Você é um adulto. ");
			  	  
		  }
		
	}
	
}
