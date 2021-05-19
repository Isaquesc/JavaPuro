package br.com.generation.lacos;

import java.util.Scanner;

public class GenerationLacos05 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int numero, total = 0;
		
		
		do {
			
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			total += numero;
			
			
		} while(numero != 0);
	
		
		System.out.println("A soma entre todos os numero digitado é: " + total);
		
	}

}
