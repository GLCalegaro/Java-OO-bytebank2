
public abstract interface Autenticavel {

	
	//Interfaces não podem ter nada concreto (nem atributos, nem métodos)
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
