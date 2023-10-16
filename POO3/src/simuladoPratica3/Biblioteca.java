package simuladoPratica3;

import java.time.Period;
import java.util.HashSet;

public class Biblioteca {
	private String nome;
	private Endereco enderecoBiblioteca;
	private Obra[] listaObras;

	public Biblioteca(String nome, Endereco endereco, Obra[] listaObras) {
		super();
		this.nome = nome;
		this.enderecoBiblioteca = endereco;
		this.listaObras = listaObras;
	}

	public Biblioteca() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return enderecoBiblioteca;
	}

	public void setEndereco(Endereco endereco) {
		this.enderecoBiblioteca = endereco;
	}

	public Obra[] getListaObras() {
		return listaObras;
	}

	public void setListaObras(Obra[] listaObras) {
		this.listaObras = listaObras;
	}

	public void contabilizaObras() {
		System.out.println("Total de Obras: " + this.getListaObras().length);
	}

//	public Obra identificarObraMaisAntiga() {
//		Obra maisAntiga = this.getListaObras()[0];
//		for(int i=0; i < this.getListaObras().length; i++) {
//			if(this.getListaObras()[i].getDataPublicacao().isBefore(maisAntiga.getDataPublicacao())) {
//				maisAntiga = this.getListaObras()[i];
//			}
//		}
//		return maisAntiga;
//	}

	public Obra identificarObraMaisAntiga() {
		Obra maisAntiga = this.getListaObras()[0];
		for (Obra obra : this.getListaObras()) { //
			if (obra.getDataPublicacao().isBefore(maisAntiga.getDataPublicacao())) {
				maisAntiga = obra;
			}
		}
		return maisAntiga;
	}

	public Autor identificarAutorMaisNovo() {
		Autor maisNovo = this.getListaObras()[0].getAutor();
		for (int i = 0; i < this.getListaObras().length; i++) {
			if (this.getListaObras()[i].getAutor().getDataNascimento().isAfter(maisNovo.getDataNascimento())) {
				maisNovo = this.getListaObras()[i].getAutor();
			}
		}
		return maisNovo;
	}

	public Autor identificarAutorMaisIdoso() {
		Autor maisIdoso = this.getListaObras()[0].getAutor();
		for (int i = 0; i < this.getListaObras().length; i++) {
			if (this.getListaObras()[i].getAutor().getDataNascimento().isBefore(maisIdoso.getDataNascimento())) {
				maisIdoso = this.getListaObras()[i].getAutor();
			}
		}
		return maisIdoso;
	}

	public void calcularDiferencaIdadeEntreAutorMaisNovoAutorMaisIdoso() {
		Autor maisNovo = this.identificarAutorMaisNovo();
		Autor maisIdoso = this.identificarAutorMaisIdoso();

		Period diferenca = Period.between(maisIdoso.getDataNascimento(), maisNovo.getDataNascimento());
		System.out.println("Diferenca de idade entre os autores: ");
		System.out.println(maisNovo.getNome());
		System.out.println(maisIdoso.getNome());
		System.out.println("Anos: " + diferenca.getYears());
		System.out.println("Meses: " + diferenca.getMonths());
		System.out.println("Dias: " + diferenca.getDays());
	}

	public Endereco localizarEnderecoAutorPorNome(String nome) {
		Endereco enderecoAutor = null;
		for (int i = 0; i < this.getListaObras().length; i++) {
			if (this.getListaObras()[i].getAutor().getNome().equals(nome)) {
				enderecoAutor = this.getListaObras()[i].getAutor().getEnderecoAutor();
			}
		}
		return enderecoAutor;
	}

//	public Endereco localizarEnderecoAutorPorNome(String nome) {
//		Endereco enderecoAutor = null;
//		for(int i = 0; i < this.getListaObras().length; i++) {
//			if(this.getListaObras()[i].getAutor().getNome().equals(nome)) {
//				enderecoAutor = this.getListaObras()[i].getAutor().getEnderecoAutor();
//			}
//		}
//		return enderecoAutor;
//	}
//	

	public void listarAutorPorCidade(String cidade) {
		System.out.println("Lista de autores que moram na mesma cidade " + cidade);
		for (int i = 0; i < this.getListaObras().length; i++) {
			if (this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade().equals(cidade)) {
				System.out.println(this.getListaObras()[i].getAutor().getNome());
			}
		}
	}

	public void listarNomeAutorPorCidade2(String cidade) {
		HashSet<Autor> listaAutores = new HashSet<Autor>();
		for (int i = 0; i < this.getListaObras().length; i++) {
			if (this.getListaObras()[i].getAutor().getEnderecoAutor().getCidade().equals(cidade)) {
				listaAutores.add(this.getListaObras()[i].getAutor());
			}
		}
		if (listaAutores.isEmpty()) {
			System.out.println("Não foram encontrados autores que moram na cidade: " + cidade);
		} else {
			System.out.println("Lista de autores que moram na cidade de " + cidade);
			for (Autor autor : listaAutores) {
				System.out.println(autor.getNome());
			}
		}
	}
}