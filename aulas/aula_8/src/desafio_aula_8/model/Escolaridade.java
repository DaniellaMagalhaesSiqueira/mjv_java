package desafio_aula_8.model;

public enum Escolaridade {
	A ("Analfabeto"),
	LE("L� e Escreve"),
	FUND_INC("Fundamental Incompleto"), 
	FUND("Ensino Fundamental"), 
	MED_INC("Ensino M�dio Incompleto"), 
	MED("Ensino M�dio Completo"), 
	SUP("Superior"),
	MESTR("Mestrado"),
	DOUT("Doutorado");
	
	
	private String nome;
	
	private Escolaridade(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
