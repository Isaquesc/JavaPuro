package br.com.generation.matrix.vetor;

public class ExemploMatriz01 {
	
	public static void main(String[] args) {
		
	
	
	double [][] notasAlunos = new double [2][4];
	
	notasAlunos[0][0] = 10.0;
	notasAlunos[0][1] = 7.9;	
	notasAlunos[0][2] = 6.5;
	notasAlunos[0][3] = 8.5;
	
	notasAlunos[1][0] = 8.8;
	notasAlunos[1][1] = 7.5;
	notasAlunos[1][2] = 5.5;
	notasAlunos[1][3] = 9.0;
	
	
	//IMPRIMINDO A MATRIX
	for(int linhas = 0; linhas < notasAlunos.length; linhas++) {
		for(int coluna = 0; coluna < notasAlunos.length; coluna++) {
			System.out.println(notasAlunos[linhas][coluna] + " | ");
		}
	}
  }
}
