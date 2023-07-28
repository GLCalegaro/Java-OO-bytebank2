package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// O ArrayList() será nosso guardador de referências, ao ser executado,
		// internamente, ele utiliza um array com um número pré-determinado de posições,
		// que gira em torno de 1000;
		// Se quisermos restringir o tipo de objetos para somente Conta, podemos
		// utilizar a sintaxe '<>' que se chama generics, os símbolos de menor e maior e, dentro, indicar o tipo
		// de classes e objetos que aquela lista poderá armazenar, no nosso caso, será
		// Conta;
		List<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(235, 11028);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(214, 91455);
		lista.add(cc2);

		// Verificando quantos objetos/referencias estão armazenados:
		System.out.println("Tamanho da lista: " + lista.size());

		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());

		// Removendo elementos:
		lista.remove(0);
		System.out.println("Tamanho da lista: " + lista.size());

		Conta cc3 = new ContaCorrente(748, 32265);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(36, 10052);
		lista.add(cc4);

		// Acessando cada elemento com laço de iteração:
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("--------------------");
		// Forma mais simples de fazer laços com Eclipse(exclusivo do compilador);
		for (Object oRef : lista) {
			System.out.println(oRef);
		}

	}

}
