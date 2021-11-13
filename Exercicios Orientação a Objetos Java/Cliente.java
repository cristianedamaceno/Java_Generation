package orientaçãoObjetosJava;

public class Cliente {
	// declaração dos atributos de classe 
	
		private String nomeCliente;
		private String endereço;
		private String comprafeita;
			
		
			// declarar o método construtor 
		
				public Cliente(String nomeCliente, String endereço, String comprafeita)
				{
					
					this.nomeCliente = nomeCliente;
					this.endereço = endereço;
					this.comprafeita = comprafeita;
					
				}
				
				
				//declaração dos demais métodos da classe 
				
				public void imprimirInfo()
				{
					System.out.println("\n" +nomeCliente+ " residente em " +endereço+ " tem a compra feita de um(a) " +comprafeita );
					
				}
				
				//criação dos métodos get e set//
				
				public String getnomeCliente() {
					return nomeCliente;
					
				}
			    	
				public void setnomeCliente(String nomeCliente) {
					this.nomeCliente = nomeCliente;
					
				}
				
				public String getendereço() {
					return endereço;
					
				}
				
				public void setendereço(String endereço) {
					this.endereço = endereço;
					
				} 
				
				public String getcomprafeita() {
					return comprafeita;
					
				} 
				
				public void setcomprafeita(String comprafeita) {
					this.comprafeita = comprafeita;
					
					
				}
	}

	
	
	
