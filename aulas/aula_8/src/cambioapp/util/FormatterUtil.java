package cambioapp.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import cambioapp.model.Moeda;

public class FormatterUtil {

	public static String moeda(Double valor, Moeda moeda) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		//TODO
		if(moeda == Moeda.BRL)
			symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
		DecimalFormat formatter = new DecimalFormat("###,###.###", symbols);
		return formatter.format(valor);
	}
}
