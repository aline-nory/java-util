/******************************************************************
 * Faça um programa que implemente um método que receba uma String
 * ou Long de CPF ou CNPJ e devolva o mesmo sem qualquer tipo de 
 * caractere.
 * 	Ex: 13508-970 => 13508970
 *******************************************************************/

public class Ex01FormataDados {

	public static String formataDados(String dado){
		return dado.replaceAll("[^0-9]+", "");
		// Leia-se: Remover espaço vazio e todo dígito de 0 a 9.
	}

	public static void main(String[] args) {
		System.out.println(formataDados("13508-970"));
		System.out.println(formataDados("157.108.950-08 10"));
	}
}
