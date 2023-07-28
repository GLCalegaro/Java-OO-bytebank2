
public class SistemaInterno {
	
	private int senha = 4538;
	
	public void autentica(Autenticavel fa) {
		boolean autenticacao = fa.autentica(this.senha);
		if(autenticacao) {
			System.out.println("Acesso ao sistema liberado!");
		}else {
			System.out.println("Senha incorreta - apenas usuarios com perfil 'Gerente' e 'ADM' podem acessar.");
		}
	}
}
