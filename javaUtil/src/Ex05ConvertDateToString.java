/*************************************************************************************
 * Implementar um método que receba uma data no formato Date e a transforme em String 
 * ***********************************************************************************/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex05ConvertDateToString {
	public static String converter(Date dataEmFormatoDate) {
		String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataEmFormatoDate);	
		return dataFormatada;
	}

	public static void main(String[] args) {
		Date dataAtual = new Date();
		String dataFormatada = converter(dataAtual);
		System.out.println(dataFormatada);
	}
}
