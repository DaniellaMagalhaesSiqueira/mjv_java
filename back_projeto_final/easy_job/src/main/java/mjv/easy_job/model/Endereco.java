package mjv.easy_job.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEndereco;
	@Column(length= 100)
	private String logradouro;
	private int numero;
	@Column(length= 80)
	private String bairro;
	@Column(length= 80)
	private String municipio;
	@Enumerated(EnumType.STRING)
	private UnidadeFederativa uf;
	@Column(length= 11)
	private String cep;
	@OneToOne(mappedBy= "idEndereco")
	private RegistroProfissional registroProfissional;
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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
	public UnidadeFederativa getUf() {
		return uf;
	}
	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public RegistroProfissional getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(RegistroProfissional registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	public Integer getIdEndereco() {
		return idEndereco;
	}
	
	
}
