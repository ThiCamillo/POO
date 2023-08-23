package lista_heranca;

public class fornoEletrico extends Eletrodomesticos {
	private double capacidadeLitros;

	public fornoEletrico(String modelo, String fabricante, double KwDia, double capacidadeLitros) {
		super(modelo, fabricante, KwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public fornoEletrico() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

	@Override
	public double calcularConsumo() {
		return super.calcularConsumo() + this.calcularDesperdicio();
	}

	@Override
	public double calcularConsumo(int dias) {
		return super.calcularConsumo(dias) + this.calcularDesperdicio(dias);
	}

	private double calcularDesperdicio() {
		return this.getKwDia() * 30 * 0.25;
	}

	private double calcularDesperdicio(int dias) {
		return super.calcularConsumo(dias) * 0.25;
	}

}
