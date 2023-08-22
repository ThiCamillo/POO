package exemplos;

import java.util.Scanner;

public class ProgramaVeiculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Carro c1 = new Carro("Focus", "Ford", 2020, 45000.00, 170);
		Carro c2 = new Carro("Gol", "Volks", 2000, 15000.00, 120);
		Carro c3 = new Carro("Fusca", "Volks", 1080, 35000.00, 190);

		Moto m1 = new Moto("CG-150", "Honda", 2022, 8000.00, 300);
		Moto m2 = new Moto("Ninja-1000", "Kawasaki", 2011, 18000.00, 1000);
		Moto m3 = new Moto("Halley", "Halleya", 1995, 50000.00, 1200);

		Carro[] listaCarros = { c1, c2, c3 };
		Moto[] listaMotos = { m1, m2, m3 };

		// 1 - calcular o valor total do carros
		double valorTotalCarro = calcularValorTotalCarro(listaCarros);
		// System.out.println("Valor total dos carros R$: " + valorTotalCarros);

		// 2 - informar o modelo do carro com maior potencia
		identificarCarroMaiorPotencia(listaCarros);

		// 3 - informar o valor total das motos
		double valorTotalMotos = calcularValorTotalMotos(listaMotos);

		// 4 - informar o modelo e o fabricante da moto mais antiga
		System.out.println("Valor total das motos R$: " + valorTotalMotos);

		// 4 - Informar o modelo e o fabricante da moto mais antiga
		identificarMotoMaisAntiga(listaMotos);

		// 5 - contabilizar o valor de todos os veiculos
		double valorTotal = valorTotalCarro + valorTotalMotos;
		System.out.println("O total de todos os veiculos: " + valorTotal);

		System.out.println("Valor antes da depreciação: " + c1.getValor());
		c1.calcularDepreciacao();
		System.out.println("Valor depois da depreciação: " + c1.getValor());
		System.out.println("-------------------------");
		System.out.println("Valor antes da depreciação: " + m1.getValor());
		m1.calcularDepreciacao();
		System.out.println("Valor depois da depreciação: " + m1.getValor());

		teclado.close();
	}

	// 1 - calcular o valor total do carros
	private static double calcularValorTotalCarro(Carro[] listaCarros) {
		double valorTotalCarro = 0;
		for (int i = 0; i < listaCarros.length; i++) {
			valorTotalCarro += listaCarros[i].getValor();
		}
		System.out.println("\n O Valor total dos carros: " + valorTotalCarro);
		return valorTotalCarro;
	}

	// 2 - informar o modelo do carro com maior potencia
	private static String identificarCarroMaiorPotencia(Carro[] listaCarros) {
		Carro maior = listaCarros[0];
		
		for (int i = 0; i < listaCarros.length; i++) {
			if(i==0) {
			maior = listaCarros[0];
		}

		if (maior.getValor() > listaCarros[i].getValor()) {
			maior = listaCarros[i];
		}

	} 	System.out.println("\n O Modelo do carro de maior potencia é: " + maior.getModelo());
		return maior.getModelo();
		}

	// 3 - informar o valor total das motos
	private static double calcularValorTotalMotos(Moto[] listaMotos) {
		double valorTotalMotos = 0;
		for(int i = 0; i < listaMotos.length; i++) {
		valorTotalMotos += listaMotos[i].getValor();
		}
		return valorTotalMotos;
	}

	// 4 - informar o modelo e o fabricante da moto mais antiga
	private static void identificarMotoMaisAntiga(Moto[] listaMotos ){
		Moto motoMaisAntiga = listaMotos[0];
		for(int i = 0; i > listaMotos.length; i++) {
			if(listaMotos[i].getAno() < motoMaisAntiga.getAno()) {
				motoMaisAntiga = listaMotos[i];
			}
		}
		System.out.println("O modelo e o fabricante da moto mais antiga: " + "\nModelo: " + motoMaisAntiga.getModelo() + "Fabricante: " + motoMaisAntiga.getFabricante());
	}
}