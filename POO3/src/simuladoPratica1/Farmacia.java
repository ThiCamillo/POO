package simuladoPratica1;

public class Farmacia extends Empresa {

	private Estoque estoque;

	public Farmacia(String nome, String cnpj, Endereco endereco, Estoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
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
		System.out.println("O responsável pelo estoque é o : " + this.getEstoque().getResponsavel());
		
	}

	public void calcularTotalEstoque() {
		double total = this.getEstoque().calcularTotalEstoque();
		System.out.println("Total do Estoque:" + total);
	}

	public void calcularTotalEstoquePorLaboratorio(String lab) {
		this.getEstoque().calcularTotalEstoquePorLaboratorio(lab);
	}

	public void buscarInformacoesDoLaboratorio(String lab) {
		Laboratorio laboratorio = this.getEstoque().buscarInformacoesDoLaboratorio(lab);
		String mensagem = "Informações do laboratório " + lab + ": \n";
		System.out.println(laboratorio != null ? mensagem + laboratorio : mensagem + "Laboratório não encontrado!");
	}

}
