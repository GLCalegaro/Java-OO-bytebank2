package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributacao {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(748, 36589);
		cc.deposita(100.50);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(cc);
		calculador.registra(sv);
		
		System.out.println("Total de impostos: " + calculador.getTotalImposto());
	}

}
