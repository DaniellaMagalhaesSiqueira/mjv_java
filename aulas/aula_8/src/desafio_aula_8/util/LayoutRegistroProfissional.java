package desafio_aula_8.util;

import desafio_aula_8.model.RegistroProfissional;

//Classe Layout possui tanto o método imprimir como o criar que poderá ser usado para a construção do arquivo
public class LayoutRegistroProfissional {

	public String criar(RegistroProfissional rp) {
		
		StringBuilder saida = new StringBuilder();
		saida.append(String.format(rp.getProfissao()));
		saida.append(String.format("%s%s\n", "Nome: ", rp.getNome()));
		saida.append(String.format("%s%s%s%s\n", "Salário Requerido: Mínimo: R$ ", FormatterUtil.virgula(rp.getSalarioMinimo()), 
				"  Máximo: R$ ", FormatterUtil.virgula(rp.getSalarioMaximo())));
		saida.append("Data de Nasc.: ");
		saida.append(FormatterUtil.data(rp.getDataNascimento()));
		saida.append(String.format("%s%s"," CPF: ", FormatterUtil.cpf(rp.getCpf())));
		saida.append(String.format("%s%s\n"," RG:", rp.getRg()));
		saida.append(String.format("%s%s\n", "Endereço: ", rp.getEndereco()));
		saida.append(String.format("%s%s","Nº: ", rp.getNumero()));
		saida.append(String.format("%s%s"," Bairro: ", rp.getBairro()));
		saida.append(String.format("%s%s"," Município: ", rp.getMunicipio()));
		saida.append(String.format("%s%s\n","UF:", rp.getUf()));
		saida.append(String.format("%s%s","Cep: ", FormatterUtil.cep(rp.getCep())));
		saida.append(String.format("%s%s"," Naturalidade: ", rp.getNaturalidade()));
		saida.append(String.format("%s%s\n"," País: ", rp.getPais()));
		saida.append("Telefone:  ");
		saida.append(FormatterUtil.telefone(rp.getTelefone()));
		saida.append(String.format("%s%s\n"," Celular:  ", FormatterUtil.telefone(rp.getCelular())));
		saida.append(String.format("%s%s\n","E-mail: ", rp.getEmail()));
		saida.append(String.format("%s%s\n","Grau de Instrução: ", rp.getEscolaridade().getNome()));

		return saida.toString();
	}
	
	public void imprimir(RegistroProfissional rp) {
		String saida = criar(rp);
		System.out.println(saida);
	}
	
}
