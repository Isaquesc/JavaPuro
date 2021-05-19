package br.com.plataforma.interfaces;

public class ParticipanteForum implements Leitor {

	//ATRIBUTO
	public String pensamento;
	
	
	@Override
	public void pensando(char[] ideias) {
		pensamento = new String(ideias);
	}

	
	@Override
	public String lendo() {
		return " O retorno da String";
	}

	@Override
	public String digitando() {
		return pensamento;
	}
	
	public String aprendendo() {
		return "JAVA";
	}
	
	

}
