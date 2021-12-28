package desafio;

import java.io.File;
import java.util.regex.Pattern;

public class RelatorioArquivo {

	public static void exibeRelatorioConsole(File file) {
		if (file.isFile()) {
			System.out.println("Esse elemento é um arquivo.");
			String nome = file.getName();
			int index = nome.lastIndexOf('.');
			String extensao = nome.substring(index + 1);
			System.out.println("Sua extensão é ." + extensao);
			System.out.println("Seu tamanho é: " + file.length() + " bytes");
			if (file.canExecute()) {
				System.out.println(file.getName() + " é um arquivo executável.");
			} else {
				System.out.println("Esse não é um arquivo executável.");
			}

		}
		if (file.isDirectory()) {
			System.out.println("Esse elemento é um diretório");
			System.out.println("Seu caminho é: " + file.getPath());
			String lista = file.getPath();
			String[] dir = lista.split(Pattern.quote("\\"));
			System.out.println("O drive deste arquivo é " + dir[0]);
		}
		if (!file.exists()) {
			System.out.println("O elemento enviado não é um arquivo ou diretório válido.");
		}
		System.out.println("-----***----- Fim do Relatório -----***-----");
	}
}
