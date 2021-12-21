package banckapp.model;

import java.util.ArrayList;
import java.util.List;

//poo
//modificadores de acesso
//padrão java beans
//depuração da ferramenta eclipse
//atalhos para produtividade de código [menu source -> Generate getters and setters]
// métodos getters -> getN + ctrl + space autocompleta
public class Conta {
//2 a 3 atributos
	private double saldo;
	private int numero;
	private double chequeEspecial;
	private String tipo;
	private List <Historico> historico = new ArrayList<>();
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<Historico> getHistorico() {
		return historico;
	}
	public void setHistorico(List<Historico> historico) {
		this.historico = historico;
	}

	
	
	
	
	
	
}
