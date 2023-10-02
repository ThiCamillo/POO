package simuladoPratica2;

public class ProgramaEscola {

	public static void main(String[] args) {

		Endereco endJu = new Endereco("rua das jujubas", 100, "Campeche", "Florianopolis", "Santa Catarina");
		Aluno ju = new Aluno("Julia Silva", 15, endJu);

		Endereco endDani = new Endereco("Rua das Gomas", 200, "Pedra Branca", "Palhoça", "Santa Catarina");
		Aluno dani = new Aluno("Daniele Veiga", 14, endDani);

		Endereco endBru = new Endereco("rua dos Caramelos", 300, "Kobrasol", "São José", "Santa Catarina");
		Aluno bru = new Aluno("Bruna andrade", 13, endBru);

		Endereco endHelena = new Endereco("Rua dos Pirulitos", 400, "Estreito", "Florianopolis", "Santa Catarina");
		Aluno Helelena = new Aluno("Helena de Andrade", 16, endHelena);

		Endereco endMary = new Endereco("Rua dos Chicletes", 500, "Aririú", "Palhoça", "Santa Catarina");
		Aluno Mary = new Aluno("Mary  Souza", 15, endMary);

		Endereco endPaula = new Endereco("Rua dos Bombons", 600, "Forquilhinhas", "São José", "Santa Catarina");
		Aluno Paula = new Aluno("Paula Vieira", 14, endPaula);

		Endereco endRenata = new Endereco("Rua das Balas", 700, "Capoeiras", "Florianopolis", "Santa Catarina");
		Aluno Renata = new Aluno("Renata", 15, endRenata);

		Endereco endLuiza = new Endereco("Rua das Trufas", 800, "Centro", "Biguaçu", "Santa Catarina");
		Aluno Luiza = new Aluno("Luiza Pires", 15, endLuiza);

		Endereco endBeatriz = new Endereco("Rua dos Doces", 900, "Campinas", "São José", "Santa catarina");
		Aluno Beatriz = new Aluno("Beatriz Santos", 14, endBeatriz);

		Endereco endSuellen = new Endereco("Rua dos Confetes", 1000, "Capoeiras", "Florianopolis", "Santa Catarina");
		Aluno Suellen = new Aluno("Suellen lima", 17, endSuellen);

		Endereco endP1 = new Endereco("rua das enciclopedias", 500, "Centro", "Florianopolis", "Santa Catarina");
		Professor p1 = new Professor("Zeca", 45, endP1, "Matematica");

		Endereco endP2 = new Endereco("Rua dos Dicionarios", 750, "Centro", "Florianopolis", "Santa Catarina");
		Professor p2 = new Professor("Pires", 40, endP2, "Potuguês");

		Aluno[] a = { ju, dani, bru, Helelena, Mary };

		Aluno[] b = { Paula, Renata, Luiza, Beatriz, Suellen };

		Turma turmaA = new Turma(7, p1, a);

		Turma turmaB = new Turma(8, p2, b);

		Turma[] turmas = { turmaA, turmaB };

		Endereco endEscola = new Endereco("Rua dpos Estudos", 1000, "Centro", "Florianopolis", "Santa Catarina");

		Escola escola = new Escola("Escola Basica das Meninas de Florianopolis", "3232.3232", endEscola, turmas);

		// 3A
		escola.contabilizarAlunas();

		// 3B
		escola.localizarEnderecoRegente("Zeca");

		// 3C
		escola.listarAlunasPorSerie(8);

		// 3D
		escola.identificarRegenteMaisJovem();

		// 3E
		escola.listarAlunasPorCidade("São José");
	}

}
