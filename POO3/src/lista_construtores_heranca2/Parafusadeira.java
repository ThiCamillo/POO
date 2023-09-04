package lista_construtores_heranca2;

public class Parafusadeira extends FerramentaEletrica {

	public Parafusadeira(String modelo, String fabricante, double peso, double fatorDesgaste, int rotacao,
			double potencia, double tensao) {
		super(modelo, fabricante, peso, fatorDesgaste, rotacao, potencia, tensao);
	}

	public Parafusadeira() {
		super();
	}

}
