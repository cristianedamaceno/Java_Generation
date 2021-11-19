package ExercicioAnimal;

public class Preguiça extends Animal {
	
	public Preguiça() {
		super("Animal Preguiça");
		
	}

	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nQual o nome da Preguça:" +nomeAnimal);
		
		
	}

	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nQuantos anos a Preguiça tem:" +idadeAnimal);
		
	}

	@Override
	public void som(String somAnimal) {
		System.out.println("\nQual o som que a preguiça emite :" +somAnimal);
		
	}
	
	public void SubirArvores() {
		System.out.println("\nUma das caracteristicas da preguiça é subir em árvores altas e verdes!!!!");
		
	}

}
