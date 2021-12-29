package desafio_aula_8.app;

import java.util.List;

import desafio_aula_8.model.RegistroProfissional;
import desafio_aula_8.util.LeitorRegistro;

public class RegistroProfissionalApp {

	public static void main(String[] args) {
		
		LeitorRegistro leitor = new LeitorRegistro();
		
		List<RegistroProfissional> registros = 
				leitor.converter("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_8\\src\\registrosDelimitados.txt");
		
		for(RegistroProfissional rp: registros) {
			System.out.println(rp);
		}
		
	}
}
