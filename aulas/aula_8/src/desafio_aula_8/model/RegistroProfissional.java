package desafio_aula_8.model;

import java.time.LocalDate;

public class RegistroProfissional {

//	Criar uma classe que represente um Registro Profissional no sistema contendo os campos: 
//	Cpf, Data Nascimento, Nome, Sexo, Escolaridade, Profissão, Salário (Mínimo/Máximo) 
//	Pretendido,Telefone para contato (DDD+numero) e Estrangeiro;
	
	private String cpf;
	private LocalDate dataNascimento;
	private Sexo sexo;
	private Escolaridade escolaridade;
	private String profissao;
	private Double salarioMinimo;
	private Double salarioMaximo;
	private String telefone;
	private boolean estrangeiro;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public Double getSalarioMaximo() {
		return salarioMaximo;
	}
	public void setSalarioMaximo(Double salarioMaximo) {
		this.salarioMaximo = salarioMaximo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	
	
	
}
