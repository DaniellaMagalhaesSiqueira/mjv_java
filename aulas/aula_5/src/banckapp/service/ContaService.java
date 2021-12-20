package banckapp.service;

import banckapp.model.Conta;

public class ContaService {
//2 a 3 recursos
	public void depositar(Conta conta, double valorDepositado) {
		conta.setSaldo(valorDepositado);
	}
	public void sacar(Conta conta, double valorSacado) {
		if(valorSacado > conta.getSaldo() + conta.getChequeEspecial()) {
			System.out.println("Saldo insuficiente para realizar a opera��o");
			return;
		}else {
			if(conta.getSaldo() < valorSacado) {
				conta.setChequeEspecial(conta.getSaldo() + conta.getChequeEspecial() - valorSacado);
				conta.setSaldo(0.0);
			}else {
				
				conta.setSaldo(conta.getSaldo() - valorSacado);
			}
		}
	}
	
	public void transferir(Conta depositante, Conta depositada, double valorTransferido) {
		if(depositante.getSaldo() + depositante.getChequeEspecial() < valorTransferido) {
			System.out.println("Saldo insuficiente para realizar a opera��o");
			return;
		}else {
			if(depositante.getSaldo() < valorTransferido) {
				depositante.setChequeEspecial(depositante.getSaldo() + depositante.getChequeEspecial() - valorTransferido);
				depositante.setSaldo(0.0);
				this.depositar(depositada, valorTransferido);
			}else {
				depositante.setSaldo(depositante.getSaldo() - valorTransferido);
				this.depositar(depositada, valorTransferido);
			}
		}
		
	}
	
	public void criarChequeEspecial(Conta conta, double valorLimite) {
		conta.setChequeEspecial(valorLimite);
	}
}
