package simuladoPratica1;

public class Farmacia extends Empresa {

	private Estoque estoque;

	public Farmacia(String nome, String cnpj, Endereco endereco) {
		super(nome, cnpj, endereco);
	}

	public Farmacia() {
		super();
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public void informarNomeDoResponsavelPeloEstoque() {
		System.out.println("O responsável pelo estoque é o: " + this.getEstoque().getResponsavel());
		
	}

	public void calcularTotalEstoque() {
		double total = this.getEstoque().calcularEstoque();
		System.out.println("Total do Estoque:" + total);
	}

}
