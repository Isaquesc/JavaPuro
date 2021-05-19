package br.com.brocode;

import javax.swing.JOptionPane;

public class BrCodeCaixaDeDialogo {

	public static void main(String[] args) {
		
		String nome;
		int idade [] = new int [2];
		
		nome = JOptionPane.showInputDialog("Qual é seu nome?"); //lendo
		//JOptionPane.showMessageDialog(null,"Seja bem vindo " + nome); // mostrando
		
		idade [1] = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem? ")); 
		//JOptionPane.showMessageDialog(null,"Você tem " + idade + " de idade"); // mostrando
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
		
		JOptionPane.showMessageDialog(null,"Olá " + nome + " hoje você tem " + idade[1] + " anos, com " + height + " de altura");
		
		
	}

}
