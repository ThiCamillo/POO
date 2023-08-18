package exemplos;

public class ProgramaVeiculo {

	public static void main(String[] args) {

		Carro c1 = new Carro("Focus", "Ford", 2020, 45000.00, 170);
		Carro c2 = new Carro("Gol", "Volks", 2000, 15000.00, 120);
		Carro c3 = new Carro("Fusca", "Volks", 1080, 35000.00, 190);

		Moto m1 = new Moto("CG-150", "Honda", 2022, 8000.00, 300);
		Moto m2 = new Moto("Ninja-1000", "Kawasaki", 2011, 18000.00, 1000);
		Moto m3 = new Moto("Halley", "Halleya", 1995, 50000.00, 1200);

		Carro[] listaCarros = { c1, c2, c3 };
		Moto[] listaMotos = { m1, m2, m3 };

//		// 1 - calcular o valor total do carros
//		double valorTotalCarros = calcularValorTotalCarros(listaCarros);
//		System.out.println("Valor total dos carros R$: " + valorTotalCarros);
//		
//						
//		// 2 - informar o modelo do carro com maior potencia
//identificarCarroMaiorPotencia(listaCarros);
//
//
//		Carro carro = listaCarros[0];
//		for(int i=0; i < listaCarros.length; i++) {
//			if(listaCarros[i].getPotenciaHP() > carro.getPotenciaHP()) {
//				carro = listaCarros[i];
//			}
//		}
//		System.out.println("O carro com maior potencia é: " + carro.getModelo());
//	


	

//	// 1 - calcular o valor total do carros
//	private void double calcularValorTotalCarros(Carros[] listaCarros) {
//		double acumulador = 0;
//		for(int i=0; i < listaCarros.length; i++) {
//			acumulador += listaCarros[i].getValor();
//		}
//		return acumulador;
//	}
//	
//	// 2 - informar o modelo do carro com maior potencia
	
//	
//	private static void calcularValorTotal(listaCarros) {
//	}
//	// 3 - informar o valor total das motos
//	
//	// 4 - informar o modelo e o fabricante da moto mais antiga
//	private static void calcularVeiculoMaisAntigo() {
//	}
//	// 5 - contabilizar o valor de todos os veiculos
//	private static void calcularValor() {
//	}

}
	
}