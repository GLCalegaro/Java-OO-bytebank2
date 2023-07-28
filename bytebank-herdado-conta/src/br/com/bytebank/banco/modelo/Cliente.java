package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Bytebank
 * @author Giovanna
 */

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;

	// Para fazer os get & set de forma automática, o eclipse tem uma funcionalidade
	// em Source/Generate Getters & Setter, selecionar os atributos e ir em
	// Generate.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
