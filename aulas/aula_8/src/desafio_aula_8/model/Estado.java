package desafio_aula_8.model;

public enum Estado {
	AC("Acre"), AL("Alagoas"), AP("Amap�"),
	AM("Amazonas"), BA("Bahia"), CE("Cear�"), DF("Distrito Federal"), ES("Esp�rito Santo"),
	GO("Goi�s"), MA("Maranh�o"), MT ("Mato Grosso"), MS("Mato Grosso do Sul"), MG("Minas Gerais"),
	PA("Par�"), PB("PAra�ba"), PR("Paran�"), PE("Prenambuco"), PI("Piau�"), RR("Roraima"), RO ("Rond�nia"),
	RJ ("Rio de Janeiro"), RN("Rio Grande do Norte"), RS("Rio Grande do Sul"), SC("Santa Catarina"),
	SP("S�o Paulo"), SE ("Sergipe"), TO ("Tocantins");

	private String nome;
	
	private Estado(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
