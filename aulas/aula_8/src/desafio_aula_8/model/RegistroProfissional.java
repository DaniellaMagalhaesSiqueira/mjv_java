package desafio_aula_8.model;

import java.time.LocalDate;

public class RegistroProfissional {

//	Criar uma classe que represente um Registro Profissional no sistema contendo os campos: 
//	Cpf, Data Nascimento, Nome, Sexo, Escolaridade, Profissão, Salário (Mínimo/Máximo) 
//	Pretendido,Telefone para contato (DDD+numero) e Estrangeiro;
	
	private String cpf;
	private LocalDate dataNascimento;
	private String nome;
	private Sexo sexo;
	private Escolaridade escolaridade;
	private String profissao;
	private Double salarioMinimo;
	private Double salarioMaximo;
	private String telefone;
	private String celular;
	private boolean estrangeiro;
	private String rg;
	private String endereco;
	private int numero;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String naturalidade;
	private String pais;
	private String email;
	
	
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
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public boolean isEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "RegistroProfissional [cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", nome=" + nome + ", sexo="
				+ sexo + ", escolaridade=" + escolaridade + ", profissao=" + profissao + ", salarioMinimo="
				+ salarioMinimo + ", salarioMaximo=" + salarioMaximo + ", telefone=" + telefone + ", estrangeiro="
				+ estrangeiro + "]";
	}
	
	
	
}
