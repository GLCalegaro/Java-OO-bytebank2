package br.com.bytebank.banco.modelo;

/**
 * Classe que representa o esqueleto de uma Conta.
 * 
 * @author Giovanna
 */

public abstract class Conta extends Object implements Comparable<Conta> {
	// O modificador protected funciona igual ao "<<package private>>", mas adiciona
	// a visiilidade p/ os filhos(chamado de publico p/ os filhos).
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	// Comparable é uma interface utilizada para determinar a ordem natural
	// utilizando o método compareTo() assim, nossa conta se torna comparável. Como
	// vimos, há também a presença de generics, uma vez que queremos comparar uma
	// Conta a outra Conta:

	/**
	 * Construtor para inicializar objeto a partir de agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */

	// Criando um construtor de inicialização (construtores são inicializadores de
	// atributos):
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas abertas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Conta de nº " + this.numero + " e agência " +
		// this.agencia + " criada com sucesso!");
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior que o saldo;
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	// Método para alterar numero da conta - normalmente métodos que modificam algo,
	// não retornam nada, por isso o void. Normalmente as variáveis tem o mesmo nome
	// dos atributos, no caso do nº da conta, o parâmetro também será numero dentro
	// desse método, no caso: int numero.
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não é permitido usar valores menores do que 0! ");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é permitido usar valores menores do que 0! ");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	// Precisamos colocar o static também para o método entender que o atributo é da
	// classe Conta;
	public static int getTotal() {
		return Conta.total;
	}

	@Override
	// Método para verificar se uma conta é igual a outra conta no
	// TesteArrayListEquals - devemos sobrescrever o método equals para definir a
	// igualdade do objeto. Em geral, os métodos equals, toString e hashCode existem
	// para sobrescrita.
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}

		return true;
	}
	
	//Método de Ordem Natural(saldos):
	@Override
	public int compareTo(Conta outra) {

		return Double.compare(this.saldo, outra.saldo);
	}

	// Implementação do método toString para melhorar a saída na classe Teste;
	@Override
	public String toString() {
		return "Número " + this.numero + " Agência: " + this.agencia + " **Saldo**: " + "R$" + this.saldo;
	}
}