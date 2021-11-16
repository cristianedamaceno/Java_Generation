package exercicioanimal;

public class Preguiça extends Animal {
	
	private String subirArvore;
	
	public Preguiça(String nome, int idade, String som, String corre, String subirArvore) {
		
		super(nome,idade,som,corre);
		this.subirArvore = subirArvore;	
	}
	 public void imprimirInfo() {
		 
		 System.out.println("\nNome do animal: "+getNome()+"\nidade:" +getIdade()+"\nsom" +getSom()+ "\ncorre" +getCorre()+ "subir na árvore" +subirArvore);
		 
	 }
	public String getSubirArvore() {
		return subirArvore;
	}
	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	 
	 

}
