package aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Daniella {
	
	//	Exercício proposto na aula 4 para prática de tipos de variáveis
	
	String nome = "Daniella";
	String cpf = "***.***.***-**";
	int idade = 41;
	double altura = 1.59;
	boolean doadorOrgao = true;
	String email = "daniella.****.com";
	String telefone = "022*********";
	//	String dataNascimento = "28/10/1980";
	//em um caso de classe modelo poderíamos apenas informar o tipo como Date dataNascimento = new Date();
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate data = LocalDate.of(1980, 10, 28);
	String dataNascimento = data.format(formato);
	
}
