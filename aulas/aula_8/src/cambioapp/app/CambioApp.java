package cambioapp.app;

import java.util.List;

import cambioapp.model.Transacao;
import cambioapp.util.LeitorRemessa;
import cambioapp.util.TransacaoPrint;

public class CambioApp {

	public static void main(String[] args) {
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Transacao> transacoes = leitor.converter("");
//		for(Transacao t: transacoes) {
//			System.out.println(t);
//		}
		
		TransacaoPrint printer = new TransacaoPrint();
//		for(Transacao t: transacoes) {
//			printer.imprimir(t);
//		}
		printer.imprimir(transacoes.get(0));
	}
}
