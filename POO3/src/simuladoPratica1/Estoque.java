package simuladoPratica1;

public class Estoque {

	private String responsavel;
	private Remedio[] remedios;

	public Estoque(String responsavel, Remedio[] remedios) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
	}

	public Estoque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Remedio[] getRemedios() {
		return remedios;
	}

	public void setRemedios(Remedio[] remedios) {
		this.remedios = remedios;
	}

	public double calcularEstoque() {
		double total = 0;
		for (Remedio remedio: this.getRemedios()) {
			total += remedio.getPreco();
		}
		return total;
	}

	
}
