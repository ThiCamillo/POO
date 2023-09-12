package exemplos;

import java.util.Scanner;

public class Programacao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cao1[] listaCaes = new Cao1[4];
		
		for(int i = 0; i < listaCaes.length; i++) {
			Cao1 cao = new Cao1();
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
