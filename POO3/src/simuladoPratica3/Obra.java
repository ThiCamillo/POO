package simuladoPratica3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Obra {
	private String titulo;
	private int edicao;
	private LocalDate dataPublicacao;
	private Autor autor;

	public Obra(String titulo, int edicao, LocalDate dataPublicacao, Autor autor) {
		super();
		this.titulo = titulo;
		this.edicao = edicao;
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
	}

	public Obra() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Titulo da Obra: " + this.getTitulo() 
		+ "\nEdicao: " + this.getEdicao()
		+ "\nData da Publicacao: " + this.getDataPublicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		+ this.getAutor();
	}

//	public void listarEnderecoAutor(String nome) {
//		if (this.getAutor().getNome().equals(nome)) {
//			System.out.println("Endereço do Autor: " + nome);
//			System.out.println(this.getAutor().getEnderecoAutor());
//		}
//	}

//	public void listaAutoresPorCidade(String cidade) {
//		for(int i = 0; i < this.getAutor()) {
//			
//		}
		
//		for(int i = 0; i < this.getAlunos().length;i++) {
//			if(this.getAlunos()[i].getEndereco().getCidade().equals(cidade)) {
//				System.out.println(this.getAlunos()[i].getNome());
//	}

}
