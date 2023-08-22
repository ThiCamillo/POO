package exemplos;

import java.util.Scanner;

public class Programacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cao[] listaCaes = new Cao[4];
		
		for(int i = 0; i < listaCaes.length; i++) {
			Cao cao = new Cao();
			System.out.println("Informe o nome do cão: ");
			cao.setNome(teclado.nextLine());
			System.out.println("Informe a raça do cão: ");
			cao.setRaca(teclado.nextLine());
			System.out.println("Informe o peso do cão: ");
			cao.setPeso(teclado.nextDouble());
			listaCaes[i] = cao;
			teclado.nextLine();
		}
		
		for(int i = 0; i<listaCaes.length; i++) {
			if(listaCaes[i].getPeso() < 15) {
				System.out.println(listaCaes[i].getNome() + " disse ");
				listaCaes[i].falar();
			}
		}
		teclado.close();
	}
}
