public abstract class Funcionario {
	// Abstract é relacionado á herança, em uma empresa por exemplo, é provável que
	// tenhamos um ou mais gerentes, e ainda muitos outros perfis diferentes de
	// funcionários. Não existe nenhuma pessoa na empresa que é apenas um
	// funcionário, apesar de todos se encaixarem nesta categoria, de forma geral,
	// cada um terá uma função específica, não sendo designado unicamente como
	// "funcionário", Justamente, por ser um conceito abstrato, utilizaremos o
	// abstract para indicar isso.
	private String nome;
	private String cpf;
	private double salario;

	// Criando construtor(se não criarmos construtores, por padrão o compilador irá
	// criar automaticamente;
	public Funcionario() {

	}

	// Da mesma forma que existem classes abstratas, também existem métodos
	// abstratos, e significa que não é possível instanciar objetos desta
	// classe, ou seja, o método não tem corpo. No método, significa que ele não tem
	// um corpo, ou seja, que não foi
	// implementado, então utilizamos o abstract aqui também;
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
