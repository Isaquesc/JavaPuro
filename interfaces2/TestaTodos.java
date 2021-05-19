package br.com.interfaces2;

public class TestaTodos {
	
	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari();
		
		
		ferrari.acelera();
		
		
		ferrari = new Fusca();
		ferrari.acelera();
		
	}

}
