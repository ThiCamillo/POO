package exemplos;

public class Moto extends Veiculo {

	private double cilindradas;

	public Moto(String modelo, String fabricante, int ano, double valor, double cilindradas) {
		super(modelo, fabricante, ano, valor);
		this.cilindradas = cilindradas;
	}

	public Moto() {
		super();
	}

	public double getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}

}
