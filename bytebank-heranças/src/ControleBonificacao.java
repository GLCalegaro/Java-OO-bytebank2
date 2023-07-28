
public class ControleBonificacao {

	// Atributo para somar todas as bonificações;
	private double soma;

	// O problema aqui é que precisaremos criar um método para cada tipo de
	// cargo(Gerente, DesenvolvedorWeb) causando muita repetição de código, então na
	// classe TesteReferencia, deixamos o tipo de todos como Funcionário;
	public void registra(Funcionario f) {
	//O Método de bonificação que está sendo chamado aqui é o método do gerente;
		double bonif = f.getBonificacao();
		this.soma = this.soma + bonif;
	}

	public double getSoma() {
		return soma;
	}
}
