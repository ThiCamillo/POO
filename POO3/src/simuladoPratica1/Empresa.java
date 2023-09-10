package simuladoPratica1;

public class Empresa {

	private String nome;
	private String cnpj;
	private Endereco endereco;

	public Empresa(String nome, String cnpj, Endereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Empresa:" + "\nNome: " + nome + "\nCNPJ: " + cnpj + "\nEndereco: " + endereco;
	}

}
