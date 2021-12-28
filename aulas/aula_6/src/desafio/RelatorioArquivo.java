package desafio;

import java.io.File;
import java.util.regex.Pattern;

public class RelatorioArquivo {

	public static void exibeRelatorioConsole(File file) {
		if (file.isFile()) {
			System.out.println("Esse elemento � um arquivo.");
			String nome = file.getName();
			int index = nome.lastIndexOf('.');
			String extensao = nome.substring(index + 1);
			System.out.println("Sua extens�o � ." + extensao);
			System.out.println("Seu tamanho �: " + file.length() + " bytes");
			if (file.canExecute()) {
				System.out.println(file.getName() + " � um arquivo execut�vel.");
			} else {
				System.out.println("Esse n�o � um arquivo execut�vel.");
			}

		}
		if (file.isDirectory()) {
			System.out.println("Esse elemento � um diret�rio");
			System.out.println("Seu caminho �: " + file.getPath());
			String lista = file.getPath();
			String[] dir = lista.split(Pattern.quote("\\"));
			System.out.println("O drive deste arquivo � " + dir[0]);
		}
		if (!file.exists()) {
			System.out.println("O elemento enviado n�o � um arquivo ou diret�rio v�lido.");
		}
		System.out.println("-----***----- Fim do Relat�rio -----***-----");
	}
}
