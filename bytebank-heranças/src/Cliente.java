
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	//Criando uma instancia padrão para AutenticacaoUtil
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	// Utilizamos este termo extends somente quando queremos herdar algo de outra
	// classe, mas com a interface, estamos "assinando um contrato", isto significa no mundo
	// Java que estamos implementando, por isso, substituimos pelo implements. Como
	// ela assinou o contrato, agora precisa cumprir a obrigação, que é de
	// implementar os métodos setSenha() e autentica().

}
