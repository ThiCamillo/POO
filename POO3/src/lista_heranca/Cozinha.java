package lista_heranca;

public class Cozinha {

	public static void main(String[] args) {
		// geladeira
		Geladeira g1 = new Geladeira("Stilo", "Eletrolux", 5, 443);

		// microondas
		MicroOndas m1 = new MicroOndas("SP67", "Panasonic", 3, 24);

		// Fogao
		Fogao f1 = new Fogao("Mais Sabor", "Continental", 7, 4);

		// lavalouca
		LavaLouca ll1 = new LavaLouca("LL14X", "Continental", 4, 45);
		fornoEletrico fe1 = new fornoEletrico("forninho", "Mondial", 3, 15);

		double consumoMensal = g1.calcularConsumo() + f1.calcularConsumo() + m1.calcularConsumo()
				+ ll1.calcularConsumo() + fe1.calcularConsumo();
		System.out.println("Consumo Mensal da cozinha: " + consumoMensal);

		double consumoPeriodo = g1.calcularConsumo(10) + f1.calcularConsumo(10) + m1.calcularConsumo(10)
				+ ll1.calcularConsumo(10) + fe1.calcularConsumo(10);
		System.out.println("Consumo no periodo de 10 dias da cozinha: " + consumoPeriodo);
	}

}
