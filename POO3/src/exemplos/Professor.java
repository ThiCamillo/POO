package exemplos;

public class Professor extends Pessoa{

	private double salario;
	
		
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String nome, int matricula, Contato contato) {
		super(nome, matricula, contato);
		// TODO Auto-generated constructor stub
	}
	public Professor(String nome, int matricula, Contato contato, double salario) {
		super(nome, matricula, contato);
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
