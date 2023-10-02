package polimorfismo;

public class Quadrado extends FormasGeometricas {
	private double lado;

	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public Quadrado(String nome) {
		super(nome);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// metodo potencia pow: informa base vezes o expoente
		return Math.pow(this.getLado(), 2);

	}

	@Override
	public double calcularPerimetro() {
		return 4 * this.getLado();
	}

}
