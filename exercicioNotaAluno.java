package exercicioIdade;

import java.util.Scanner;

public class exercicioNotaAluno {

	public static void main(String args[]) {
		
		float n1,n2,n3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1*2+n2*3+n3*5)/10;
		
		System.out.println("\nSua média foi de: " +media);
	}
	
}
