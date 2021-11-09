package exercicioIdade;

import java.util.Scanner;

public class laçoDecisão04 {
	
	public static void main(String args[]) {
		
		int numero;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 ==0)
		{
			resultado = Math.sqrt(numero);
		}
		else
		{
			resultado = Math.pow(numero, 2);
		}
		System.out.println("\nResultado: "+resultado);
	}


	


	}
	

