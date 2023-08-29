package lista_construtores_heranca2;

public class Martelo extends FerramentaManual{

	private double tamanhoMm;

	public Martelo(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo, double tamanhoMm) {
		super(modelo, fabricante, peso, fatorDesgaste, tipo);
		this.tamanhoMm = tamanhoMm;
	}

	public Martelo() {
		super();
	}

	public double getTamanhoMm() {
		return tamanhoMm;
	}

	public void setTamanhoMm(double tamanhoMm) {
		this.tamanhoMm = tamanhoMm;
	}

	
	
	
}
