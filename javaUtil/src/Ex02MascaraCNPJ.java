/******************************************************************
 * Faça um programa que implemente um método que receba uma String
 * ou Long de CNPJ e devolva o mesmo no formato String com máscara.
 * 	Ex: 24220632000129 => 24.220.632/0001-29
 *******************************************************************/

public class Ex02MascaraCNPJ  {

	private static String formatacaoCnpj(String cnpj) {
		String blocoCnpj1 = cnpj.substring(0, 3); 
		String blocoCnpj2 = cnpj.substring(3, 6);
		String blocoCnpj3 = cnpj.substring(6, 9); 
		String blocoCnpj4 = cnpj.substring(9, 13);
		String blocoCnpj5 = cnpj.substring(13, 15); 

		return cnpj = String.format("%s.%s.%s/%s-%s", blocoCnpj1, blocoCnpj2, blocoCnpj3, blocoCnpj4, blocoCnpj5); 
	}

	public static void main(String[] args) {
		String cnpjFormatado = formatacaoCnpj("88888888888888");
		System.out.println(cnpjFormatado);			
	}
}