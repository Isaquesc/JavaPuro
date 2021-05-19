package br.com.plataforma.metodos.objetos;

public class Sobrecarregados {

	public void testaMetodosSobrecarregados(){
		System.out.printf("Sal�rio em numero inteiro: %d \n",salario(1000));
		System.out.printf("Sal�rio em numero double: %f \n",salario(7.500));
	}
	
	public int salario(int valorInt) {
		System.out.printf("Sal�rio com argumento inteiro: %d \n",valorInt);
		return valorInt * valorInt;
	}
	 public double salario(double valorDouble) {
		 System.out.printf("Sal�rio com argumento inteiro: %f \n",valorDouble);
		 return valorDouble * valorDouble;
	 }

}
