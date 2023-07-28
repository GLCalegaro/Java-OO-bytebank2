package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaque {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(36, 100458);
		conta.deposita(200.00);
		try {
			conta.saca(290.00);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exceção: " + ex.getMessage());
		}

		System.out.println(conta.getSaldo());
	}

}
