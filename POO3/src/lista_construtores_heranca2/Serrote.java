package lista_construtores_heranca2;

public class Serrote extends FerramentaManual {

	private double tamanhoPol;
	private int qtddentes;

	public Serrote(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo, double tamanhoPol,
			int qtddentes) {
		super(modelo, fabricante, peso, fatorDesgaste, tipo);
		this.tamanhoPol = tamanhoPol;
		this.qtddentes = qtddentes;
	}

	public Serrote() {
		super();
	}

	public double getTamanhoPol() {
		return tamanhoPol;
	}

	public void setTamanhoPol(double tamanhoPol) {
		this.tamanhoPol = tamanhoPol;
	}

	public int getQtddentes() {
		return qtddentes;
	}

	public void setQtddentes(int qtddentes) {
		this.qtddentes = qtddentes;
	}

}
