package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(28);//Autoboxing
		System.out.println(idadeRef.intValue());//Unboxing
		
		Double dRef = Double.valueOf(30.1);
		System.out.println("Double: " + dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(28.1f);
		//Criando lista onde guardamos qualquer tipo de numero:
		List<Number> lista = new ArrayList<>();
		lista.add(53);//int
		lista.add(76.1);//double
		lista.add(28.6f);//float
	}

}
