package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Testando método ehIgual da classe Conta;
//		Conta cc1 = new ContaCorrente(36, 54112);
//		Conta cc2 = new ContaCorrente(36, 10320);
//		
//		boolean verifica = cc1.ehIgual(cc2);
//		System.out.println(verifica);

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(235, 11028);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(214, 91455);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(214, 91455);

		boolean verifica = lista.contains(cc3);
		System.out.println("Já existe? " + verifica);

		// Forma mais simples de fazer laços com Eclipse(exclusivo do compilador);
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
