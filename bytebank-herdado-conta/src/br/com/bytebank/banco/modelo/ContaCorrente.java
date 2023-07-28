package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributacao{
	// Relembrando, o método extends herdará os atributos e método da super classe,
	// no nosso Caso 'Conta' mas não hera os construtores, então vamos criar o nosso
	// construtor da classe ContaCorrente e podemos utilizar o super para chamar um
	// construtor específico, passando os parâmetros específicos para ele.
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double taxaSaque = valor + 0.5;
		super.saca(taxaSaque);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	// Utilização do método toString implementado na classe Conta, para classe Conta
	// Corrente;
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}
}
