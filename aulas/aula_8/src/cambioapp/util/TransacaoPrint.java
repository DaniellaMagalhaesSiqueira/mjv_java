package cambioapp.util;

import cambioapp.model.Moeda;
import cambioapp.model.Transacao;

public class TransacaoPrint {

	public void imprimir(Transacao transacao) {
		StringBuilder cupom = new StringBuilder();
		cupom.append("---------------------------\n");
		cupom.append("SIS CAMBIO - COMPROVANTE DE TRANSA��O\n");
		cupom.append("TRANSA��O DE CAMBIO\n");
		cupom.append("---------------------------\n");
		cupom.append("NOME: " + transacao.getNome());
		cupom.append("\n" + "CPF: " + transacao.getCpf());
		cupom.append("---------------------------\n");
		cupom.append("VALOR VENDIDO: " + FormatterUtil.moeda(transacao.getValorVendido(), Moeda.USD));
	}
}
