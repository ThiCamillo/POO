package lista_datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio05 {
	
public static void main(String[] args) {
			
			DateTimeFormatter fin = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			Scanner teclado = new Scanner(System.in);
			System.out.print("Informe a sua data de nascimento no padrão dd/MM/yyyy HH:mm:ss: ");
			LocalDateTime data = LocalDateTime.parse(teclado.nextLine(), fin);
			LocalDateTime hoje = LocalDateTime.now();
			
			Duration tempo = Duration.between(data, hoje);
			System.out.println("Você ja viveu: ");
			//Funciona na versão 17 do Java.
			System.out.println("Horas: " + tempo.toHoursPart());
			System.out.println("Minutos: " + tempo.toMinutesPart());
			System.out.println("Segundos: " + tempo.toSecondsPart());
//			System.out.println("Horas: " + tempo.toHours());
//			System.out.println("Minutos: " + (tempo.toMinutes()%60));
//			System.out.println("Segundos: " + (tempo.getSeconds()%60));
			teclado.close();
		}

}
