package br.com.generation.exadicionais;

//1-	Faça um programa que receba três inteiros e diga qual deles é o maior.


import java.util.Scanner;

public class GenerationJava01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int um, dois, tres, maior;
		
		System.out.print("Digite um valor: ");
		um = leia.nextInt();
		System.out.print("Digite um valor: ");
		dois = leia.nextInt();
		System.out.print("Digite um valor: ");
		tres = leia.nextInt();
		leia.close();
		
		if(um > dois && um > tres) {
			maior = um;
		} else if (dois > um && dois > tres) {
			maior = dois;
		} else if (tres > um && tres > dois) {
			maior = tres;
		} else {
			System.out.println("os numeros são todos iguais");
			return;
		}		
		System.out.println("O maior numero é digital foi: " + maior);
		
	}

}