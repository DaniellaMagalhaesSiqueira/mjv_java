package cambioapp.model;

public enum Moeda {

	USD ("DOLAR"),
	BRL ("REAL");
	
	private String nome;
	private Moeda(String nome) {
		this.nome = nome;
	}
	
	public String getSimbolo() {
		return nome;
	}
}
