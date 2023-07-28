package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		//String é a unica classe que não precisa utilizar new, se utilizar o compilador não da erro, mas n é boa prática;
		//Sempre que uma String for criada e seu valor atribuído, este valor não pode ser alterado;
		String nome = "Oracle";
		
		//Método para verificar se a String está vazia, se colocar espaço, o Java entende q n é vazia, então usamos o método trim;
		String estring = "   Oracle   ";
		String nestring = estring.trim();
		
		//Método para verificar se uma String contém uma substring, usamos o contains;
		System.out.println(estring.contains("Ora"));
		System.out.println(nestring);
		
		//Método para saber quantos caracteres tem minha String;
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("cl");
//		System.out.println(pos);
		
		//Se quisermos saber qual elemento corresponde à posição de uma string, usamos o charAt.
//		char c = nome.charAt(1);
//		System.out.println(c);
		
		//char guarda apenas 1 caracter e em aspas simples somente;
//		char a = 'A';
//		char b = 'o';
//		String newname = nome.replace(a, b);
//		String newname = nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(newname);
	}

}
