package polimorfismo;

import java.text.DecimalFormat;

public class TrianguloIsoceles extends Triangulo {

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double base;
	private double altura;

	public TrianguloIsoceles(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public TrianguloIsoceles(String nome) {
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

}
