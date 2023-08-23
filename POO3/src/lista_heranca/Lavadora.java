package lista_heranca;

public class Lavadora extends Eletrodomesticos {
	
	private double capacidadeKg;

	
	public Lavadora(String modelo, String fabricante, double KwDia, double capacidadeKg) {
		super(modelo, fabricante, KwDia);
		this.capacidadeKg = capacidadeKg;
	}


	public Lavadora() {
		super();
	}


	public double getCapacidadeKg() {
		return capacidadeKg;
	}


	public void setCapacidadeKg(double capacidadeKg) {
		this.capacidadeKg = capacidadeKg;
	}

	
	
	

}
