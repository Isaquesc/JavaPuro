package br.com.plataforma.metodos.objetos;

public class Pessoa 
{
	
	//ATRIBUTOS
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	
	
	//CONSTRUTOR
	public Pessoa(String primeiro, String segundo, String ultimo) 
	{
		primeiroNome = primeiro;
		segundoNome = segundo; 
		ultimoNome = ultimo;
	}
	
	//MÉTODOS
	public String getNomeCompleto()
	{
			String nomeCompleto = primeiroNome + " " + segundoNome + " " + ultimoNome;
			return nomeCompleto;
	}

}
