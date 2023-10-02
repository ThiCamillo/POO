package polimorfismo;

public class Circulo extends FormasGeometricas {
	private double raio;

	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public Circulo(String nome) {
		super(nome);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.getRaio(), 2) * Math.PI;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.getRaio();
	}

}
