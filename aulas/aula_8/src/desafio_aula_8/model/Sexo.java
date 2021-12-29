package desafio_aula_8.model;

public enum Sexo {

	M ("MASCULINO"),
	F ("FEMININO");
	
	private String nome;
	private Sexo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
