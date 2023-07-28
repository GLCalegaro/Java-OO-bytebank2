package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	// Usamos a classe Object para tornar-se um guardador de referências genéricas,
	// ou seja, em vez de guardarmos somente tipo Conta, armazenaremos qualquer tipo
	// de Object.
	private Object[] referencias;
	private int posicaoLivre;

	// Método para guardar posições de referencias dos arrays;
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	// Método para adicionar posições nos arrays;
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	// Método para pegar referencias das posições;
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
