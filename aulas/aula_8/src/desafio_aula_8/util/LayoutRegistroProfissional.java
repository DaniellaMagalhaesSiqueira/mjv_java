package desafio_aula_8.util;

import desafio_aula_8.model.RegistroProfissional;

//Classe Layout possui tanto o método imprimir como o criar que poderá ser usado para a construção do arquivo
public class LayoutRegistroProfissional {

	public String criar(RegistroProfissional rp) {
		
		StringBuilder saida = new StringBuilder();
		saida.append(String.format("%s%s\n", "PROFISSÃO: ", 
			rp.getProfissao() == null ? "________________________________________________________" : rp.getProfissao()));
		saida.append(String.format("%s%s\n", "Nome: ", 
			rp.getNome() == null ? "_____________________________________________________________" : rp.getNome()));
		saida.append(String.format("%s%s%s%s\n", "Salário Requerido: Mínimo: R$ ", 
			rp.getSalarioMinimo() == null ? "____________" : FormatterUtil.virgula(rp.getSalarioMinimo()), 
				"  Máximo: R$ ", 
			rp.getSalarioMaximo() == null ? "____________" : FormatterUtil.virgula(rp.getSalarioMaximo())));
		saida.append("Data de Nasc.: ");
		saida.append(rp.getDataNascimento() == null ? "__/__/____" : FormatterUtil.data(rp.getDataNascimento()));
		saida.append(" CPF: ");
		saida.append(rp.getCpf() == null ? "______________" : FormatterUtil.cpf(rp.getCpf()));
		saida.append(" RG: _________________\n");
		saida.append("Endereço: _________________________________________________________\n");
		saida.append("Nº: _____ Bairro: _______________ Município: ______________ UF: ___\n");
		saida.append("Cep: ______________ Naturalidade: __________________ País: ________\n");
		saida.append("Telefone:");
		saida.append(rp.getTelefone() == null ? "_______________________" : FormatterUtil.telefone(rp.getTelefone()));
		saida.append("  Celular: ____________________\n");
		saida.append("E-mail: ___________________________________________________________\n");
		saida.append("Grau de Instrução: \n");
		if(rp.getEscolaridade() == null) {
			saida.append("Analfabeto               Ensino Fundamental          Superior\n");
			saida.append("Le e Escreve             Ensino Médio Incompleto     Mestrado\n");
			saida.append("Fundamental Incompleto   Ensino Médio Completo       Doutorado\n");
		}else {			
			saida.append(rp.getEscolaridade().getNome());
		}
		return saida.toString();
	}
	
	public void imprimir(RegistroProfissional rp) {
		String saida = criar(rp);
		System.out.println(saida);
	}
	
}
