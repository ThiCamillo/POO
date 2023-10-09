package polimorfismo;

import java.text.DecimalFormat;

public class TrianguloIsosceles extends Triangulo {

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double base;
	private double altura;

	public TrianguloIsosceles(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public TrianguloIsosceles(String nome) {
		super(nome);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.getBase() * this.getAltura());
	}

	@Override
	public double calcularPerimetro() {
		return (2 * this.getBase() + (2 * Math.hypot(this.getBase(), this.getAltura())));
	}
	
	@Override
	public String toString() {
		return "Nome da Figura: Triangulo Isosceles" 
				+ "\nBase: " + this.getBase()
				+ "\nAltura: " + this.getAltura()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
