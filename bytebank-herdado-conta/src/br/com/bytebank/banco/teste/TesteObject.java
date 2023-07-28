package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(5);
//		System.out.println(false);

		Object cc = new ContaCorrente(36, 2168);
		Object cp = new ContaPoupanca(237, 13388);
		Object c = new Cliente();

		// No nosso exemplo, @1175e2db é o endereço do objeto vem do método de
		// implementação toString (não é necessário chamá-lo nos metodos com
		// .toString()), e não temos muito controle sobre isto, pois foi herdado da
		// classe Object, então
		// sobreescrevemos o método na classe ContaCorrente para que possa melhorar a
		// saída;
		System.out.println(cc.toString());
		System.out.println(cp);

		println(c);
	}

	static void println() {

	}

	static void println(int a) {

	}

	static void println(boolean valor) {

	}

	// Utilizamos Object aqui pois ele faz parte do método println e funciona com
	// qualquer tipo de referência, uma vantagem do polimorfismo;
	static void println(Object referencia) {

	}

}
