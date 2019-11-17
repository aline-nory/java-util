/******************************************************************
 * Faça um programa que implemente um método que receba uma String
 * ou Long de CPF e devolva o mesmo no formato String com máscara.
 * 	Ex: 35264914885 => 352.649.148-85	
 *******************************************************************/

public class Ex03MascaraCPF  {
	
	private static String formatacaoCpf(String cpf) {
		String blocoCpf1 = cpf.substring(0, 3); 
		String blocoCpf2 = cpf.substring(3, 6);
		String blocoCpf3 = cpf.substring(6, 9); 
		String blocoCpf4 = cpf.substring(9, 11);
		return cpf = String.format("%s.%s.%s-%s", blocoCpf1, blocoCpf2, blocoCpf3, blocoCpf4);
	}

	public static void main(String[] args) {
		String cpfFormatado = formatacaoCpf("88888888888");
		System.out.println(cpfFormatado);			
	}
}