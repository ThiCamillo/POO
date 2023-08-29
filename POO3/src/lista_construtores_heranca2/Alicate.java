package lista_construtores_heranca2;

public class Alicate extends FerramentaManual {

	private double tamanhoPol;

	public Alicate(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo,
			double tamanhoPol) {
		super(modelo, fabricante, peso, fatorDesgaste, tipo);
		this.tamanhoPol = tamanhoPol;
	}

	public Alicate() {
		super();
	}

	public double getTamanhoPol() {
		return tamanhoPol;
	}

	public void setTamanhoPol(double tamanhoPol) {
		this.tamanhoPol = tamanhoPol;
	}

	
	
}
