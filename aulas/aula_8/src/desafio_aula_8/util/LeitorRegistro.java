package desafio_aula_8.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import desafio_aula_8.model.Escolaridade;
import desafio_aula_8.model.RegistroProfissional;
import desafio_aula_8.model.Sexo;

public class LeitorRegistro {

	//método usado apenas dentro da classe
	private List<String> ler(String caminho){
		 try  {
			 //Por causa de caracteres especiais foi necessário alterar o Charset
			 //https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html
			  List<String> registros = Files.readAllLines(Paths.get(caminho), StandardCharsets.ISO_8859_1);

			  return registros;

	        } catch (IOException e) {
	        	System.out.println("Exceção: " + e);
	            e.printStackTrace();
	            return null;
	        }
	}
//	Cpf, Data Nascimento, Nome, Sexo, Escolaridade, Profissão, Salário (Mínimo/Máximo) 
//	Pretendido,Telefone para contato (DDD+numero) e Estrangeiro;
	
	public List<RegistroProfissional> converter(String caminho){
		List<String> linhas = ler(caminho);
		
		List <RegistroProfissional> registros = new ArrayList<>();
		for(String linha: linhas) {
			//poderia ser qualquer delimitador, por exemplo "/", " ", ":"
			String [] campos = linha.split(";"); 
			RegistroProfissional rp = new RegistroProfissional();
			rp.setCpf(campos[0]);
			//Classe FormatterUtil adaptada para não precisar criar formatadores aqui
			String data = campos[1];
			rp.setDataNascimento(FormatterUtil.converterData(data));
			rp.setNome(campos[2]);
			rp.setSexo(Sexo.valueOf(campos[3]));
			rp.setEscolaridade(Escolaridade.valueOf(campos[4]));
			rp.setProfissao(campos[5]);
			rp.setSalarioMinimo(Double.parseDouble(campos[6]));
			rp.setSalarioMaximo(Double.parseDouble(campos[7]));
			rp.setTelefone(campos[8]);
			int estrangeiro = Integer.parseInt(campos[9]);
			rp.setEstrangeiro(estrangeiro == 1 ? true : false);
			
			registros.add(rp);
		}
		return registros;
	}
}
