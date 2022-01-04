package aula_9;

public class FormatterUtil {

	public static String cep(Long cep) {
		String cepFormatado = cep.toString().format("%08d", cep);
		cepFormatado = cepFormatado.replaceAll("(\\d{2})(\\d{3})(\\d{3})","$1.$2-$3");
		return cepFormatado;
	}
	
	public static String removerSpecialCaracters(String texto) {
		String textoSemCaracterSpecial = texto.replaceAll("\\D", "");
		return textoSemCaracterSpecial;
	}
	public static void main(String[] args) {
		Long cep = 27937010L;
		
		String cepFormatado = cep(cep);
		System.out.println(cepFormatado);
		
		String cepSemFormatacao = removerSpecialCaracters(cepFormatado);
			System.out.println(cepSemFormatacao);

	}
}

