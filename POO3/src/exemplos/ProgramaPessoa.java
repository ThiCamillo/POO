package exemplos;

import java.util.Scanner;

public class ProgramaPessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//		Aluno aluno1 = new Aluno();
//		System.out.println("Informe o nome do aluno: ");
//		aluno1.setNome(teclado.nextLine());
//		System.out.println("Informe a matricula do aluno: ");
//		aluno1.setMatricula(teclado.nextInt());
//		teclado.nextLine();
//		
//		Aluno aluno2 = new Aluno();
//		System.out.println("Informe o nome do aluno: ");
//		aluno2.setNome(teclado.nextLine());
//		System.out.println("Informe a matricula do aluno: ");
//		aluno2.setMatricula(teclado.nextInt());
//		teclado.nextLine();
//		

		Professor professor1 = new Professor();
		System.out.println("Informe o nome do/a professor/a: ");
		professor1.setNome(teclado.nextLine());
		System.out.println("Informe a matricula do/a professor/a: ");
		professor1.setMatricula(teclado.nextInt());
		System.out.println("Informe o sal�rio do/a professor/a: ");
		professor1.setSalario(teclado.nextDouble());
		teclado.nextLine();

		Professor professor2 = new Professor();
		System.out.println("Informe o nome do/a professor/a: ");
		professor2.setNome(teclado.nextLine());
		System.out.println("Informe a matricula do/a professor/a: ");
		professor2.setMatricula(teclado.nextInt());
		System.out.println("Informe o sal�rio do/a professor/a: ");
		professor2.setSalario(teclado.nextDouble());
		teclado.nextLine();

//		// matricula mais antiga
//		if (aluno1.getMatricula() < aluno2.getMatricula()) {
//			System.out.println("O aluno/a " + aluno1.getNome() + " � o mais antigo.");
//		} else {
//			System.out.println("O aluno/a " + aluno2.getNome() + " � o mais antigo.");
//		}

		if (professor1.getSalario() > professor2.getSalario()) {
			System.out.println("O/a professor/a " + professor1.getNome() + " � o/a que tem maior sal�rio.");
		} else {
			System.out.println("O/a professor/a " + professor2.getNome() + " � o/a que tem maior sal�rio.");
		}

		teclado.close();
	}

}
