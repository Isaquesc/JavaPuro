package br.com.plataforma.metodos.objetos;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro car = new Carro();
		
		//ALIMENTANDO OS ATRIBUTOS
		car.cor = "Vermelho";
		car.modelo = "HB20";
		car.velocidadeAtual = 0;
		car.velocidadeMaxima = 80;
		
		
		//INVOCANDO OS METODOS
		car.ligar();
		car.acelerar(40);
		System.out.println("O Carro está em: " + car.velocidadeAtual + ("Kmh"));
		car.pegaMarcha();
		
		
		
		
	}
	
	

}
