package banckapp.model;
//poo
//modificadores de acesso
//padr�o java beans
//depura��o da ferramenta eclipse
//atalhos para produtividade de c�digo [menu source -> Generate getters and setters]
// m�todos getters -> getN + ctrl + space autocompleta
public class Conta {
//2 a 3 atributos
	private double saldo;
	private int numero;
	private double chequeEspecial;
	private String tipo;
	
	
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
	
	
	
	
	
}
