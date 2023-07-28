package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		// Exemplos de arrays: arrays também sao objetos, e o 5 representa a quantidade
		// de valores que quero armazenar no array;
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}

}
