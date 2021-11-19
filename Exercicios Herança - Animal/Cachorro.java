package ExercicioAnimal;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super("Animal Cachorro");
		
	}

	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nQual o nome do cachorro: " +nomeAnimal);
		
		
	}

	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nQual a idade  do cachorro: " +idadeAnimal);
		
	}

	@Override
	public void som(String somAnimal) {
		System.out.println("\nQue som o cachorro faz: "+somAnimal);
		
	}
	
	public void Corre() {
		System.out.println("\nUma das caracteristicas do cachorro é correr livremente!!!");
		
	}

}
