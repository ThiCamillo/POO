package polimorfismo;

public class Retangulo extends FormasGeometricas {

	private double ladoA;
	private double ladoB;

	public Retangulo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public Retangulo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public double calcularArea() {
		return this.getLadoA() * this.getLadoB();
	}

	@Override
	public double calcularPerimetro() {
		return (2 * this.getLadoA() + (2 * this.getLadoB()));
	}

}
