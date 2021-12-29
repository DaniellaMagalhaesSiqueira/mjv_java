package desafio_aula_8.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import desafio_aula_8.model.RegistroProfissional;

public class FabricaArquivo {

	public static void criarRegistro(RegistroProfissional rp, String caminho) {
		
		LayoutRegistroProfissional layout = new LayoutRegistroProfissional();
		
		File diretorio = new File(caminho);
		
		if(new File(diretorio.getAbsolutePath() + "/" + rp.getCpf() + ".txt").exists()) {			
			File arquivo = new File(diretorio.getAbsolutePath() + "/" + rp.getCpf() + ".txt");
			try {
				
				FileWriter arqTxt = new FileWriter(arquivo.getPath());
				String ficha = layout.criar(rp);
				arqTxt.write(ficha);
				arqTxt.close();
				System.out.println(String.format("%s%s%s", "Arquivo de ",rp.getNome(), " criado com sucesso!"));
				System.out.println("Encontre o arquivo no diretório informado com o formato CPF.txt");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			File arquivo = new File(diretorio.getAbsolutePath() + "/" + rp.getCpf() + ".txt");
			try {
				arquivo.createNewFile();				
				FileWriter arqTxt = new FileWriter(arquivo.getPath());		
				String ficha = layout.criar(rp);
				arqTxt.write(ficha);
				arqTxt.close();
				System.out.println(String.format("%s%s%s", "Arquivo de ",rp.getNome(), " criado com sucesso!"));
				System.out.println("Encontre o arquivo no diretório informado com o formato CPF.txt");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
}
