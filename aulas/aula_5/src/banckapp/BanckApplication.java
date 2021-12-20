package banckapp;

import banckapp.model.Conta;
import banckapp.service.ContaService;

public class BanckApplication {

	public static void main(String[] args) {
//2 a 3 contas de integrantes

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		ContaService terminal = new ContaService();
		
		terminal.depositar(conta1, 50.0);
		terminal.transferir(conta1, conta2, 30.0);
		terminal.criarChequeEspecial(conta2, 20.0);
		terminal.sacar(conta2, 40.0);
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(conta2.getChequeEspecial());
		

	}

}
