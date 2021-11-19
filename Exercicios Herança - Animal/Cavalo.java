package ExercicioAnimal;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super("Animal Cavalo");
		
	}

	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nQual o nome do cavalo: " +nomeAnimal);
		
	}

	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nQual a idade do cavalo: " +idadeAnimal);
		
		
	}

	@Override
	public void som(String somAnimal) {
		System.out.println("\nQual é o som que o cavalo emite: " +somAnimal);
		
		
	}
		public void Corre() {
			
			System.out.println("\nUma das caracteristicas do cavalo é correr livremente pelo campo!!!!");
			
		}
}
