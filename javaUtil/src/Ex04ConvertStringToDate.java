/******************************************************************************************
 * Implementar um método que receba uma data no formato string e a retorne no formato Date. 
 ******************************************************************************************/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex04ConvertStringToDate {

	public static Date converter(String dataEmFormatoString) {
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmFormatoString);
		} catch (ParseException e) {			
			e.printStackTrace();
			return null;
		}	
		return date;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma data: ");
		String data = scan.nextLine();
		
		Date dataFormatada = converter(data);
		System.out.println(dataFormatada);
		scan.close();
	}
}
