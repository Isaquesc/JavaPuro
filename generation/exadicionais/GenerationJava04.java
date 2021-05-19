package br.com.generation.exadicionais;
/*
 * 4-Faça um programa em que permita a entrada de um número qualquer e exiba se este número 
 * é par ou ímpar. Se for par exiba também a raiz quadrada 
 * do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
import java.util.*;

public class GenerationJava04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Esse numero é par");
			System.out.println("Sua raiz quadrada é: " + Math.sqrt(numero));
		} else {
			System.out.println("Esse numero é impar");
			System.out.println("Seu numero elevado a ele mesmo é: " + Math.pow(numero,2));
		}
		
		leia.close();
	}

}
