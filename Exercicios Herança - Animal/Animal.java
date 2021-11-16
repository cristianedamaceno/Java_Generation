package exercicioanimal;

public class Animal {

	
		private String nome;
		private int idade;
		private String som;
		private String corre;
		
		public Animal(String nome, int idade, String som, String corre) {
			
			this.nome = nome;
			this.idade = idade;
			this.som = som;
			this.corre = corre;
			}
		
		public void imprimirinfo() {
			
			System.out.println("\n" +nome+ " possui a idade " +idade+  "emite o som" +som+ " e deve correr " +corre );
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}

		public String getCorre() {
			return corre;
		}

		public void setCorre(String corre) {
			this.corre = corre;
		}
		
		

	}



