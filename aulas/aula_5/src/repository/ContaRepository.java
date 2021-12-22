package repository;

import java.util.HashSet;
import java.util.Set;

import banckapp.model.Conta;

public class ContaRepository {
	
	private Set<Conta> contas = new HashSet<>();
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public Set<Conta> getContas() {
	
		
		return contas;
	}

}
