
public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
			// O que todas as exceções do mundo Java para o desenvolvedor têm em comum, é
			// que todas estendem a classe Exception. Por isso, podemos fazer um catch
			// polimórfico/genérico. Em vez de definir cada exceção específica, aumentando
			// cada vez
			// mais o catch, podemos usar apena o Exception, dessa forma, qualquer exceção
			// que possa acontecer será capturada, mas não é boa prática. Como regra geral,
			// sempre tente ser mais especifico possível no bloco catch favorecendo vários
			// blocos catch ou usando multi-catch.
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Chamando metodo 2");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
}
