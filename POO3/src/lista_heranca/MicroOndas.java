package lista_heranca;

public class MicroOndas extends Eletrodomesticos {

	private double capacidadeLitros;

	public MicroOndas(String modelo, String fabricante, double KwDia, double capacidadeLitros) {
		super(modelo, fabricante, KwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public MicroOndas() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
