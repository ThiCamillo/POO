package lista_construtores_heranca2;

public class Oficina {

	public static void main(String[] args) {
		Furadeira f1 = new Furadeira("Furao", "Still", 20.0, 12, 110, 45, 220);
		Lixadeira l1 = new Lixadeira("Lixinha", "Mondial", 20, 80, 200, 66, 220);
		Serra s1 = new Serra("Castor", "Corta corta", 2.0, 50, 10, 30, 110);
		Alicate al1 = new Alicate("Ali", "Bosch", 23, 34, "corte", 2.4);
		Alicate al2 = new Alicate("cate", "Bosch", 32, 41, "bico", 3);
		Martelo m1 = new Martelo("bate bate", "Schi", 12, 34, "unha", 23);
		Martelo m2 = new Martelo("bate prego", "Still", 40, 20, "pena", 40);
		Serrote se1 = new Serrote("Serrador", "Bosch", 12, 34, "carpinteiro", 12, 78);

		double consumoDiario = (f1.getPotencia() * 3) + (l1.getPotencia() * 2) + (s1.getPotencia() * 4);
		System.out.println("Consumo mensal: " + (consumoDiario * 30));
		System.out.println("Consumo semanal: " + (consumoDiario * 7));

//	//maior vida util
//	if(al1.calcularVidaUtil() > al2.calcularVidaUtil())
//		&& (al1.calcularVidaUtil() > al2.calcularVidaUtil())
//		{
//		System.out.println();

		FerramentaManual[] fm = { al1, al2, m1, m2, se1 };
		FerramentaManual resultado = fm[0];
		for (int i = 0; i < fm.length; i++) {
			if (resultado.calcularVidaUtil() < fm[i].calcularVidaUtil()) {
				resultado = fm[i];
			}
		}
		System.out.println("Ferramenta: " + resultado.getModelo());
		System.out.println("Vida �til: " + resultado.calcularVidaUtil());

	}
}
