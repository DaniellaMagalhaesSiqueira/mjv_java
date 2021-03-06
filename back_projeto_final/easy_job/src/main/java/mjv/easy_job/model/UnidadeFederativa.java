package mjv.easy_job.model;

public enum UnidadeFederativa {

		AC("Acre"), AL("Alagoas"), AP("Amapá"),
		AM("Amazonas"), BA("Bahia"), CE("Ceará"), DF("Distrito Federal"), ES("Espírito Santo"),
		GO("Goiás"), MA("Maranhão"), MT ("Mato Grosso"), MS("Mato Grosso do Sul"), MG("Minas Gerais"),
		PA("Pará"), PB("PAraíba"), PR("Paraná"), PE("Prenambuco"), PI("Piauí"), RR("Roraima"), RO ("Rondônia"),
		RJ ("Rio de Janeiro"), RN("Rio Grande do Norte"), RS("Rio Grande do Sul"), SC("Santa Catarina"),
		SP("São Paulo"), SE ("Sergipe"), TO ("Tocantins");

		private String nome;
		
		private UnidadeFederativa(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return this.nome;
		}
}
