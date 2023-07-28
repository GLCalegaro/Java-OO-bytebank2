
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		// Para tratarmos uma exceção, é preciso sinalizar para a máquina virtual que
		// isso pode acontecer, por meio de um código específico (try). Assim, ela
		// entenderá que deve tentar executar esse código, entre chaves ({}) e com mais
		// cautela. O bloco de try sinaliza que o código int a = i / 0 é perigoso e, em
		// caso de exceção, a capturaremos e executaremos no bloco seguinte, por meio de
		// catch.
		try {
			metodo2();
			// O catch serve p/ sinalizar que queremos capturar um problema, no caso,
			// ArithmeticException.
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			// A variável ex é uma referência e, com isso, podemos dizer que exceções também
			// são objetos. Então, podemos usar a referência para chamar algum método
			// público da classe. Pegaremos o método getMessage(), com o qual conseguiremos
			// pegar a informação apresentada no console, por exemplo, a mensagem / by zero.
			// Depois de pegá-la, iremos guardá-la em uma String e mostrá-la após
			// "ArithmeticException".
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			// Da mesma forma que a exceção se lembra da mensagem, ela também se lembra por
			// onde passou e deixou seu rastro. Para mostrá-lo, usaremos o método
			// printStackTrace():
			ex.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

//Houve erro, na primeira iteração do laço dentro do metodo2(). Temos algum código no metodo2() que saiba como 
//resolver a "bomba" que foi jogada? Não! Então, o Java saiu abruptamente da linha int a = i / 0 e voltou para a 
//chamada do metodo2(), dentro do tryCatch. Repare que na saída não apareceu "Fim do metodo2", porque ele foi descartado. 
//E então, voltamos para o metodo1(), no qual temos um código para resolver ArithmeticException. Capturamos a exceção (a bomba) 
//da pilha, e imprimimos "ArithmeticException" e, logo depois, voltou à execução normal, imprimindo "Fim do metodo1" e "Fim do main".

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Erro personalizado!");
		//System.out.println("Fim do metodo2");
	}
}
