package lista_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe uma data no formato dd/mm/yyyy: ");
		LocalDate data = LocalDate.parse(teclado.nextLine(), fin);
		
		DateTimeFormatter fout1 = DateTimeFormatter.ofPattern("EEEE");
		
		Locale brasil = new Locale("pt", "BR");
		DateTimeFormatter fout2 = DateTimeFormatter.ofPattern("EEEE", brasil);
		
		System.out.println("Dia da semana: " + data.format(fout1));
		System.out.println("Dia da semana: " + data.format(fout2));
		System.out.println("Dia da semana: " + data.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		
		teclado.close();
	}
}
