package orientaçãoObjetosJava;

public class Funcionario {
	
	
	private String nomeFuncionario;
	private String idadeFuncionario;
	private String endereçoFuncionario;
	
			public Funcionario (String nomeFuncionario, String idadeFuncionario, String endereçoFuncionario) {
		
				this.nomeFuncionario = nomeFuncionario;
				this.idadeFuncionario = idadeFuncionario;
				this.endereçoFuncionario = endereçoFuncionario;
				
			}
			
			public void imprimirInfo()
			{
				System.out.println("\n" +nomeFuncionario+ " tem a idade " +idadeFuncionario+ " e mora em " + endereçoFuncionario );
				
			}

			public String getNomeFuncionario() {
				return nomeFuncionario;
			}

			public void setNomeFuncionario(String nomeFuncionario) {
				this.nomeFuncionario = nomeFuncionario;
			}

			public String getIdadeFuncionario() {
				return idadeFuncionario;
			}

			public void setIdadeFuncionario(String idadeFuncionario) {
				this.idadeFuncionario = idadeFuncionario;
			}

			public String getEndereçoFuncionario() {
				return endereçoFuncionario;
			}

			public void setEndereçoFuncionario(String endereçoFuncionario) {
				this.endereçoFuncionario = endereçoFuncionario;
			}
			
			
	
	

}
