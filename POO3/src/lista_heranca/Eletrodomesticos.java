package lista_heranca;

public class Eletrodomesticos {

	private String modelo;
	private String fabricante;
	private double KwDia;

	public Eletrodomesticos(String modelo, String fabricante, double KwDia) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.KwDia = KwDia;
	}

	public Eletrodomesticos() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getKwDia() {
		return KwDia;
	}

	public void setKwDia(double kwDia) {
		KwDia = kwDia;
	}

	// CONSUMO DE ENERGTIA - //KW/DIA mes
	public double calcularConsumo() {
		return this.getKwDia() * 30;
	}

	public double calcularConsumo(int dias) {
		return this.getKwDia() * dias;
	}

}
