package lista_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias = Integer.parseInt(teclado.nextLine());
		
		LocalDate data = LocalDate.now();
		data = data.plusDays(dias);
		
		DateTimeFormatter fout1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fout2 = DateTimeFormatter.ofPattern("EEEE");
		
		System.out.println("Daqui a " + dias + "dias será dia " + data.format(fout1) + "(" + data.format(fout2) + ").");
		
		
		teclado.close();
}
}
