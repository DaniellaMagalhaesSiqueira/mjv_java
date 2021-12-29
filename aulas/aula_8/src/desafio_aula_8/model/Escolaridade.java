package desafio_aula_8.model;

public enum Escolaridade {

	FUND("Fundamental"), 
	MED("Médio"), 
	SUP("Superior");
	
	private String nome;
	
	private Escolaridade(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
