package simuladoPratica3;

import java.time.LocalDate;

public class Executavel {

	public static void main(String[] args) {
	// enderecos

			Endereco end1 = new Endereco("RUA DAS MAÇAS", 100, "INGLESES", "FLORIANÓPOLIS", "SANTA CATARINA");
			Endereco end2 = new Endereco("RUA DAS LARANJAS", 200, "ARIRIU", "PALHOÇA", "SANTA CATARINA");
			Endereco end3 = new Endereco("RUA DAS UVAS", 300, "PEDRA BRANCA", "PAÇHOÇA", "SANTA CATARINA");
			Endereco end4 = new Endereco("RUA DAS MELANCIAS", 400, "ESTREITO", "FLORIANÓPOLIS", "SANTA CATARINA");
			
			Endereco end5 = new Endereco("RUA DAS MANGAS", 600, "CENTRO", "FLORIANÓPOLIS", "SANTA CATARINA");

			// AUTORES
			Autor autor1 = new Autor("CARLOS DRUMMOND", LocalDate.of(1946, 10, 1), end1);
			Autor autor2 = new Autor("MACHADO DE ASSIS", LocalDate.of(1915, 3, 15), end2);
			Autor autor3 = new Autor("CECILIA MEIRELES", LocalDate.of(1927, 5, 21), end3);
			Autor autor4 = new Autor("OSVALD ANDRADE", LocalDate.of(1934, 6, 4), end4);

			// revista
			Revista revista1 = new Revista("VEJA", 60, LocalDate.of(2012, 12, 1), autor1);
			Revista revista2 = new Revista("ISTOÉ", 80, LocalDate.of(2013, 6, 01), autor2);
			Revista revista3 = new Revista("AUTO ESPORTE", 20, LocalDate.of(2011, 9, 1), autor3);
			Revista revista4 = new Revista("SUPER INTERESSANTE", 100, LocalDate.of(2010, 4, 1), autor4);

			// livro
			Livro livro1 = new Livro("BREJO DAS ALMAS", 8, LocalDate.of(1983, 1, 30), autor1);
			Livro livro2 = new Livro("QUINCAS BORBA", 1, LocalDate.of(1892, 5, 13), autor2);
			Livro livro3 = new Livro("COLAR DE CAROLINA", 3, LocalDate.of(1934, 11, 20), autor3);
			Livro livro4 = new Livro("OS CONDENADOS", 7, LocalDate.of(1941, 7, 28), autor4);

//			// LISTA AUTORES
//			Autor[] listaAutores = {autor1, autor2, autor3, autor4};

			// BIBLIOTECA
			Obra[] listaObras = {revista1, revista2, revista3, revista4, livro1, livro2, livro3, livro4}; //polimorfismo
			Biblioteca bib1 = new Biblioteca("Biblioteca Central", end5, listaObras);

			// 3A
			bib1.contabilizaObras();
			System.out.println("------------------\n");

			// 3B funcao sem parametro
			Obra antiga = bib1.identificarObraMaisAntiga();
			System.out.println("Obra mais antiga da biblioteca:");
			System.out.println(antiga);
			System.out.println("------------------\n");

			// 3C // AUTOR MAIS NOVO E SUAS INFO - funcao
			Autor novo = bib1.identificarAutorMaisNovo();
			System.out.println("Autor mais novo:");
			System.out.println(novo);
			System.out.println("------------------\n");

			// 3D DIFERENCA ENTRE OS AUTORES MAI NOVO E MAIS VELHO
			bib1.calcularDiferencaIdadeEntreAutorMaisNovoAutorMaisIdoso();
			System.out.println("------------------\n");

			// 3E INFORMAR UM AUTOR, SEU END.
			Endereco end = bib1.localizarEnderecoAutorPorNome("CARLOS DRUMMOND");
			System.out.println("Endereco do autor: ");
			System.out.println(end);
			System.out.println("------------------\n");

			// 3F CIDADE, LISTAR NOMES DOS AUTORES QUE MORAM NA MESMA CIDADE
			bib1.listarAutorPorCidade("FLORIANÓPOLIS");
			System.out.println("-------------------\n");
			
			bib1.listarNomeAutorPorCidade2("FLORIANÓPOLIS");
			System.out.println("--------------------\n");

		}
}
