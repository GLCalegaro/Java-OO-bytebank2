package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoLista {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Giovanna");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Otavio");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Dani");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Wilson");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// Laço antes da ordenação:
		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// Criando uma istancia da nossa classe NumContaComparator:
//		NumContaComparator comparator = new NumContaComparator();
		
		// Ordenando lista com o 'sort':
		lista.sort(new TitularDaContaComparator());
		//Collections é uma classe de métodos estáticos auxiliares;
		Collections.sort(lista, new NumContaComparator());
//		Collections.reverse(lista);//Método para ir do menor p o maior elemento da lista;

		System.out.println("-------------------");
		// Laço depois da ordenação:
		for (Conta conta : lista) {
			System.out.println(conta + " -> " + "Titular: " + conta.getTitular().getNome());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {
	// Classe criada para comparar contas pelo titular;
	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}

}

class NumContaComparator implements Comparator<Conta> {
	// Classe criada para comparar contas pelo numero, o 'sort' exige uma
	// implemetação de comparação - compara 2 argumentos p/ saber a ordem, então
	// faremos o seguinte:

	@Override
	public int compare(Conta c1, Conta c2) {
	//Modo simplificado SEM if:
		return Integer.compare(c1.getNumero(), c2.getNumero());
	
	//Modo COM if:
//		if (c1.getNumero() < c2.getNumero()) {
//			return -101;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 102;
//		}
//		return 0;
	}

}
