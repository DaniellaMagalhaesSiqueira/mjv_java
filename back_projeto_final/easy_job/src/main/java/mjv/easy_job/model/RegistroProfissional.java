package mjv.easy_job.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class RegistroProfissional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRegistroProfissional;
	@Column(length=100, nullable= false)
	private String nome;
	private LocalDate dataNascimento;
	@Column(length=14)
	private String cpf;
	@Column(length=15)
	private String rg;
	private boolean estrangeiro;
	@Column(length=80)
	private String naturalidade;
	@Column(length=50)
	private String nacionalidade;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_endereco_fk", referencedColumnName= "idEndereco")
	private Endereco idEndereco;
	@Column(length=15)
	private String telefone;
	@Column(length=14)
	private String celular;
	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;
	@Column(length=100)
	private String profissao;
	private Double salarioMinimo;
	private Double salarioMaximo;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Endereco getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Endereco idEndereco) {
		this.idEndereco = idEndereco;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdRegistroProfissional() {
		return idRegistroProfissional;
	}
	
	
}
