package simuladoPratica1;

public class ExecutavelSimulado1 {

	public static void main(String[] args) {

		Endereco endLegrand = new Endereco("RUA DOS REMÉDIOS", 100, "CENTRO", "PALHOÇA", "SANTA CATARINA");
		Laboratorio legrand = new Laboratorio("Legrand", "12.345.678/0001-11", endLegrand);
		
		
		Endereco endMedley = new Endereco("RUA DA MEDICAÇÃO", 200, "ESTREITO", "FLORIANÓPOLIS", "SANTA CATARINA");
		Laboratorio medley = new Laboratorio("Medley", "12.345.678/0001-22", endMedley);
		
		Remedio rem1 = new Remedio("Rosuvas", 55.00, legrand);
		Remedio rem2 = new Remedio("GLIFAGE", 35.00, legrand);
		Remedio rem3 = new Remedio("ARADOIS H", 50.00, legrand);
		Remedio rem4 = new Remedio("TRANDILAX", 10.00, legrand);

		Remedio rem5 = new Remedio("ROSUVASTATINA", 50.00, medley);
		Remedio rem6 = new Remedio("LEXOTAN", 40.00, medley);
		Remedio rem7 = new Remedio("LOSARTANA", 45.00, medley);
		Remedio rem8 = new Remedio("TORSILAX", 15.00, medley);

		Remedio[] listaRemedios = { rem1, rem1, rem1, rem1, rem2, rem2, rem2, rem3, rem3, rem4, rem5, rem6, rem6, rem7, rem7,
				rem7, rem8, rem8, rem8, rem8 };

		Estoque estoque = new Estoque("Luciano", listaRemedios);
		
		Endereco endFarm = new Endereco("RUA JARDIM SILVA", 360, "CENTRO", "FLORIANÓPOLIS", "SANTA CATARINA");
		Farmacia farm1 = new Farmacia("FARMÁCIA DO SENAC", "12.345.678/0001-33", endFarm, estoque);

		//3A
		farm1.informarNomeDoResponsavelPeloEstoque();
		
		//3B
		farm1.calcularTotalEstoque();
		
		//3C
		farm1.calcularTotalEstoquePorLaboratorio("Legrand");
		
		//3D
		farm1.buscarInformacoesDoLaboratorio("Medley");
		
		
		
	}
}
