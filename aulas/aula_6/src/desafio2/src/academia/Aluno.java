package academia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aluno {

	File file;
	String nome;
	String matricula;
	
	Aluno(String nome, String matricula){
		this.nome = nome;
		this.matricula = matricula;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void preencheArquivo() {
		if(this.file.exists()) {
			if (file.isFile()) {
				try {
					FileWriter arqTxt = new FileWriter(file.getPath());
					arqTxt.write("Nome: " + this.nome + "\n");
					arqTxt.write("Matrícula: " + this.matricula + "\n");
					arqTxt.close();
					System.out.println("Arquivo do aluno preenchido com informações");
				} catch (IOException e) {
					System.out.println("Não foi possível executar a operação.");
				}
			}
		}else {
			System.out.println("O arquivo aluno não existe.");
		}
	}
}
