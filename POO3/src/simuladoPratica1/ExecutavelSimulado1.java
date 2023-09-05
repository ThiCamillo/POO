package simuladoPratica1;

public class ExecutavelSimulado1 {

	public static void main(String[] args) {

		Endereco endLegrand = new Endereco("RUA DOS REMÉDIOS", 100, "CENTRO", "PALHOÇA", "SANTA CATARINA");
		Endereco endMedley = new Endereco("RUA DA MEDICAÇÃO", 200, "ESTREITO", "FLORIANÓPOLIS", "SANTA CATARINA");
		Endereco endFarm = new Endereco("RUA JARDIM SILVA", 360, "CENTRO", "FLORIANÓPOLIS", "SANTA CATARINA");

		Laboratorio lab1 = new Laboratorio("Legrand", "12.345.678/0001-11", endLegrand);
		Laboratorio lab2 = new Laboratorio("Medley", "12.345.678/0001-22", endMedley);

		Remedio rem1 = new Remedio("Rosuvas", 55.00, lab1);
		Remedio rem2 = new Remedio("GLIFAGE", 35.00, lab1);
		Remedio rem3 = new Remedio("ARADOIS H", 50.00, lab1);
		Remedio rem4 = new Remedio("TRANDILAX", 10.00, lab1);

		Remedio rem5 = new Remedio("ROSUVASTATINA", 50.00, lab2);
		Remedio rem6 = new Remedio("LEXOTAN", 40.00, lab2);
		Remedio rem7 = new Remedio("LOSARTANA", 45.00, lab2);
		Remedio rem8 = new Remedio("TORSILAX", 15.00, lab2);

		Remedio remedios[] = { rem1, rem1, rem1, rem1, rem2, rem2, rem2, rem3, rem3, rem4, rem5, rem6, rem6, rem7, rem7,
				rem7, rem8, rem8, rem8, rem8 };

		Farmacia far1 = new Farmacia("FARMÁCIA DO SENAC", "12.345.678/0001-33", endFarm);

		Estoque est1 = new Estoque("Luciano", remedios);

		//3a
		System.out.println("O responsável pelo estoque é o: " + est1.getClass());
		
	}
}
