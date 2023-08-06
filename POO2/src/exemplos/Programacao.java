package exemplos;

import java.util.Scanner;

public class Programacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cao[] listaCaes = new Cao[4];
		
		for(int i = 0; i < listaCaes.length; i++) {
			Cao cao = new Cao();
			System.out.println("Informe o nome do cão: ");
			cao.nome = teclado.nextLine();
			System.out.println("Informe a raça do cão: ");
			cao.raca = teclado.nextLine();
			System.out.println("Informe o peso do cão: ");
			cao.peso = teclado.nextDouble();
			listaCaes[i] = cao;
			teclado.nextLine();
		}
		
		for(int i = 0; i<listaCaes.length; i++) {
			if(listaCaes[i].peso < 15) {
				System.out.println(listaCaes[i].nome + " disse ");
				listaCaes[i].falar();
			}
		}
		teclado.close();
	}
}
