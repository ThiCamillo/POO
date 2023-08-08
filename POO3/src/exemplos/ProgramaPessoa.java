package exemplos;

import java.util.Scanner;

public class ProgramaPessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		System.out.println("Informe o nome do aluno: ");
		aluno1.setNome(teclado.nextLine());
		System.out.println("Informe a matricula do aluno: ");
		aluno1.setMatricula(teclado.nextInt());
		teclado.nextLine();
		
		Aluno aluno2 = new Aluno();
		System.out.println("Informe o nome do aluno: ");
		aluno2.setNome(teclado.nextLine());
		System.out.println("Informe a matricula do aluno: ");
		aluno2.setMatricula(teclado.nextInt());
		teclado.nextLine();
		
		//matricula mais antiga
		if(aluno1.getMatricula() < aluno2.getMatricula()) {
			System.out.println("O aluno/a " + aluno1.getNome() + " é o mais antigo.");
		}else {
			System.out.println("O aluno/a " + aluno2.getNome() + " é o mais antigo.");
		}
		
		
		teclado.close();
	}

}
