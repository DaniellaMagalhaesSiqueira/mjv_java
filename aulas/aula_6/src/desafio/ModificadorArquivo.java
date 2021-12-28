package desafio;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ModificadorArquivo {

	public static void mudaConte�do(File file) {
		if (file.isFile()) {
			String nome = file.getName();
			int index = nome.lastIndexOf('.');
			String extensao = nome.substring(index + 1);
			if (file.canExecute()) {
				System.out.println(file.getName() + " � um arquivo execut�vel.");
			} else {
				System.out.println("Esse n�o � um arquivo execut�vel.");
			}
			if (extensao.equals("txt")) {

				Scanner entrada = new Scanner(System.in);
				System.out.println("Esse � um arquivo txt. Voc� gostaria de modific�-lo? S/N");
				String resposta = entrada.nextLine().toUpperCase();
				if (resposta.equals("S")) {
					System.out.println("Escreva o texto: ");
					String texto = entrada.nextLine();
					try {
						FileWriter arqTxt = new FileWriter(file.getPath());
						arqTxt.write(texto);
						arqTxt.close();
						System.out.println("Seu arquivo foi modificado.");
						System.out.println("Agora o arquivo possui " + file.length() + " bytes.");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else {
				System.out.println("Esse n�o � um arquivo txt.");
			}
		}
	}
}
