package desafio_aula_8.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import cambioapp.model.Moeda;

public class FormatterUtil {

	public static String moeda(Double valor, Moeda moeda) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		if (moeda == Moeda.BRL) {
			symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
		}
		DecimalFormat formatter = new DecimalFormat("¤ ###,###.###", symbols);
		return formatter.format(valor);
	}

	public static String cpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return cpfFormatado;
	}

	public static LocalDate converterData(String data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		return LocalDate.parse(data, formatter);

	}
}
