package polimorfismo;

import java.text.DecimalFormat;

public class Quadrado extends FormasGeometricas {
	
	DecimalFormat formatador = new DecimalFormat("0.00");
	
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
	
	@Override
	public String toString() {
		return "Nome da Figura: Quadrado" 
				+ "\nLado: " + this.getLado()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
