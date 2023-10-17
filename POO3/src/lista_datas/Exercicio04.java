package lista_datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
		DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a sua data de nascimento no padrão dd/MM/yyyy");
		LocalDate data = LocalDate.parse(teclado.nextLine(), fin);
		LocalDate hoje = LocalDate.now();
		
		Period tempo = Period.between(data, hoje);
		System.out.println("Você já viveu: ");
		System.out.println("Anos: " + tempo.getYears());
		System.out.println("Meses: " + tempo.getMonths());
		System.out.println("Dias: " + tempo.getDays());
		teclado.close();
	}
}
