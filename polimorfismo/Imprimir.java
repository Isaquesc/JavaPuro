package br.com.polimorfismo;

public class Imprimir {
	
	public static void main(String[] args) {
		
		TestaAnimal testa = new TestaAnimal();
		
		testa.fazerAnimalComer(new Cachorro());
		testa.fazerAnimalComer(new Tigre());
		testa.fazerAnimalComer(new Animal());
		
	}

}
