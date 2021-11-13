package orientaçãoObjetosJava;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		//instanciando um objeto da classe//
		
		Cliente auto1 = new Cliente("CristianeDamaceno"," Rua Cuitelão - Santo andré","calça preta");
		
			auto1.imprimirInfo();
			
			System.out.println("\nTroca feita com sucesso!!!! Volte Sempre");
				
			auto1.setcomprafeita("Calça rosa");
			auto1.imprimirInfo();
			
			
			
			Cliente auto2 = new Cliente("Kaleb Damaceno","Rua Cuitelão - Santo André", "camisa azul");
			
			
				auto2.imprimirInfo();
				
				System.out.println("\nTroca feita com sucesso!!!! Volte sempre");
				
				
				auto2.setcomprafeita("Camiseta preta");
				auto2.imprimirInfo();
				
				
			
		
	}

}
