package br.com.plataforma.interfaces;

public class TesteTodas {
	
	public static void main(String[] args) {
		
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;
		
		
		System.out.println("O participante está lendo" + leitor.lendo());
		
		
		String java = "BUNDA";
		
		leitor.pensando(java.toCharArray());
		
		System.out.println(" E programando: " + participante.digitando());
	}

}
