package lista_heranca;

public class Fogao extends Eletrodomesticos {

	private int qtdBocas;

	public Fogao(String modelo, String fabricante, double KwDia, int qtdBocas) {
		super(modelo, fabricante, KwDia);
		this.qtdBocas = qtdBocas;
	}

	public Fogao() {
		super();
	}

	public int getQtdBocas() {
		return qtdBocas;
	}

	public void setQtdBocas(int qtdBocas) {
		this.qtdBocas = qtdBocas;
	}

}
