package lista_construtores_heranca2;

public class Furadeira extends FerramentaEletrica {

	public Furadeira(String modelo, String fabricante, double peso, double fatorDesgaste, int rotacao, double potencia,
			double tensao) {
		super(modelo, fabricante, peso, fatorDesgaste, rotacao, potencia, tensao);
	}

	public Furadeira() {
		super();
	}

}
