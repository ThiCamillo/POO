package exemplos;

public class ProgramaPessoaContato {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("4899865-9248", "thiago.sam.camillo@gmail.com");
		Professor p1 = new Professor("Adriano", 123, c1, 5000.00);
		
		
		Contato c2 = new Contato("4899865-3333", "sampaio.sam.camillo@gmail.com");
		Professor p2 = new Professor("Melo", 321, c2, 8000.00);
		
		
		Contato c3 = new Contato("4899865-4444", "thiago.sam.camillo@gmail.com");
		Professor p3 = new Professor("Flavio", 213, c3, 4000.00);
		
		Contato c4 = new Contato("4899865-55555", "thiago.sam.camillo@gmail.com");
		Professor p4 = new Professor("Andre", 312, c4, 10000.00);
		
		Professor[] listaProfessores = {p1, p2, p3, p4};
		
		
		
	}

}
