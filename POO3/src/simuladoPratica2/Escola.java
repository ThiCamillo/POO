package simuladoPratica2;

public class Escola {

	private String nome;
	private String telefone;
	private Endereco enderecoEscola;
	private Turma[] turmas;

	public Escola(String nome, String telefone, Endereco enderecoEscola, Turma[] turmas) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoEscola = enderecoEscola;
		this.turmas = turmas;
	}

	public Escola() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}

	public void contabilizarAlunas() {
		int total = 0;
		for (Turma turma : this.getTurmas()) {
			total += turma.getAlunos().length;
		}
		System.out.println("O total de alunas da escola é: " + total);
	}

	public void localizarEnderecoRegente(String nome) {
		System.out.println("\nEndereço do regente: " + nome);
		for (Turma turma : this.getTurmas()) {
			if (turma.getRegente().getNome().equals(nome)) {
				System.out.println(turma.getRegente().getEndereco());
			}
		}
	}

	public void listarAlunasPorSerie(int serie) {
		System.out.println("\nLista de Alunas da série: " + serie);
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (this.getTurmas()[i].getSerie() == serie) {
				this.getTurmas()[i].listarAlunas();
			}
		}
	}

	public void identificarRegenteMaisJovem() {
		Professor maisNovo = this.getTurmas()[0].getRegente();
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (this.getTurmas()[i].getRegente().getIdade() < maisNovo.getIdade()) {
				maisNovo = this.getTurmas()[i].getRegente();
			}
		}
		System.out.println("\nRegente mais novo: " + maisNovo.getNome());
	}

	public void listarAlunasPorCidade(String cidade) {
		System.out.println("\nLista de Alunas da cidade: " + cidade);
		for (int i = 0; i < this.getTurmas().length; i++) {
			this.getTurmas()[i].listarAlunasPorCidade(cidade);
		}
	}

}
