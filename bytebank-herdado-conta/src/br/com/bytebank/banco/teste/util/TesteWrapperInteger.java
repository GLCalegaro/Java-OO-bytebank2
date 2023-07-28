package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];

		// int é um primitivo, não uma referência. Assim, há uma classe para cada tipo
		// primitivo e para o 'int', utilizamos o Integer. A transformação dos dados
		// primitivos para objetos é automatica e se chama Autoboxing e as
		// transformações
		// de objetos para dados primitivos chama-se Unboxing;;
		int idade = 28;
		// Criando um objeto do tipo Integer, ao invés de usar new, usamos a classe
		// Integer e um dos seus métodos que é o 'valueOf':
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		// Mostrando valor do objeto criado atrvés de outro método 'intValue':
		int valor = idadeRef.intValue();//Unboxing
		//Método que mostra valor minimo ou maximo que um Integer pode guardar:
		System.out.println(Integer.MAX_VALUE);

		String s = args[0];// Por exemplo "10", será retornado como string, e para fazer essa conversão
							// também utilizados Integer, porém com o parametro de String e essa
							// transformação chama-se parsing - este método é mais utilizado quando
							// trabalhamos com formulários;
		Integer numero = Integer.valueOf(s);
		System.out.println("Saída de conversão String para int: " + numero);
		
		//Método que pega a String e cria um primitivo(opção mais adequada para devolver um primitivo):
		int number = Integer.parseInt(s);
		System.out.println("Saída de conversão String para int(parseInt): " + numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(28);// Autoboxing
	}

}
