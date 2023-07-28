package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		// Criando um array de objetos genérico que pode guardar 5 referencias de contas(valor
		// padrão de uma referência é 'null'):
		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(104, 80026);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(237, 51021);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;

//		System.out.println(cc2.getNumero());

		// Aqui, não podemos colocar ContaPoupança ref = contas[1], pois apesar de
		// contas apontar tanto para ContaPoupança, quanto Corrente, o compilador ainda
		// não sabe disso, pois diante dessa dualidade, ele não tem certeza se a linha
		// de código funciona, então para contornar isso, usaremos um 'cast' ou 'type
		// cast' de referências '(ContaPoupança ou Corrente)' logo após ref,
		// transformando assim uma referência mais genérica(conta), em outra mais específica(ContaPoupanca);
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(ref.getNumero());
		System.out.println(cc1.getNumero());
//		System.out.println(referencias[0].getNumero());
	}

}
