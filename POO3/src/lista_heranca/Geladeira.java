package lista_heranca;

public class Geladeira extends Eletrodomesticos {

	private double capacidadeLitros;

	public Geladeira(String modelo, String fabricante, double KwDia, double capacidadeLitros) {
		super(modelo, fabricante, KwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Geladeira() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
