//A 1ª declaração é sempre o package e os imports vem sempre em segundo, o * signifca que está importando todas as classes;
package br.com.bytebank.banco.teste;

//Full Qualified Name FQN - nome do pacote modelo junto com o nome da classe ContaCorrente.
import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(236, 6598 - 5);
		cc.deposita(500.0);

		ContaPoupanca cp = new ContaPoupanca(236, 54800 - 9);
		cp.deposita(200);

		cc.transfere(100.0, cp);

		System.out.println("Saldo Conta-Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta-Poupança: " + cp.getSaldo());

		// System - classe; faz parte do pacote java.lang; acesso/visibilidade public;
		// out - atributo; acesso/visibilidade public; referencia; static;
		// println - método; publico; não estático pois o elemento anterior ao println()
		// (out), é uma referência; sobrecarga (pode String e int e exitem várias
		// versões de um mesmo método, ou seja, muitas sobrecargas); não joga exceções
		// do tipo checked pois não somos obrigados a fazer algum tratamento de exceção.
	}

}
