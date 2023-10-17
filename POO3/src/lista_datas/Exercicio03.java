package lista_datas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio03 {

public static void main(String[] args) {
	DateTimeFormatter fin = DateTimeFormatter.ofPattern("HH:mm:ss");
	Scanner teclado  = new Scanner (System.in);
	System.out.println("Informe o horário de inicio da partida no padrão HH:mm:ss: ");
	LocalTime horaInicio = LocalTime.parse(teclado.nextLine(), fin);
	System.out.println("Informe o horário de término da partida no padrão HH:mm:ss: ");
	LocalTime horaTermino = LocalTime.parse(teclado.nextLine(), fin);
	
	Duration tempo = Duration.between(horaInicio, horaTermino);
	System.out.println("A partida durou: ");
	// Funciona na versao 17 do Java.
	System.out.println("Horas: " + tempo.toHoursPart());
	System.out.println("Minutos: " + tempo.toMinutesPart());
	System.out.println("Segundos: " + tempo.getSeconds());
	
	//para funcionar em versões anteriores a 17
	System.out.println("Horas: " + tempo.toHours());
	System.out.println("Minutos: " + (tempo.toMinutes()%60));
	System.out.println("Segundos: " + (tempo.getSeconds()%60));
	teclado.close();
	}
}
