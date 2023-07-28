package br.com.giovanna.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(174, 23698);
		
		cc.deposita(220.0);
		
		System.out.println(cc.getSaldo());
	}

}
