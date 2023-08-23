package lista_heranca;

public class LavaLouca extends Eletrodomesticos {

	private double capacidadeLitros;

	public LavaLouca(String modelo, String fabricante, double KwDia, double capacidadeLitros) {
		super(modelo, fabricante, KwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public LavaLouca() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
