package exercicioIdade;

import java.util.Scanner;

public class laçoDecisão01 {
	
	public static void main(String args[]) {
		
		 int n1,n2,n3;
		
		
		 Scanner leia = new Scanner(System.in);
		
		  System.out.println("\nDigite o primeiro número: ");
		  n1 = leia.nextInt();
		  System.out.println("\nDigite o segundo número: ");
		  n2 = leia.nextInt();
		  System.out.println("\nDigite o terceiro número: ");
		  n3 = leia.nextInt();
		  
		  
		  if ((n1>n2) && (n1>n3)) {
			  
			  System.out.println("\nO número maior que todos é: " +n1);
			  
		  }
		  
		  
		  else  if ((n2>n1) && (n2>n3)) {
			  
			  System.out.println("\nO número maior que todos é: " +n2);
			  
		  }
		  
		  
		  else if ((n3>n1) && (n3>n2)) {
			  
			  System.out.println("\nO número maior que todos é: " +n3);
			  
		  }
		  
          
       
		
		
		
	}

}
