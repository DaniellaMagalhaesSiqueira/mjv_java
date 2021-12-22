package desafio;

import java.io.File;

public class MainArquivo {
	public static void main(String[] args) {
		
		File arq = new File("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\texto.txt");
//		arq.delete();
		
		System.out.println(arq.canRead());
	}

}
