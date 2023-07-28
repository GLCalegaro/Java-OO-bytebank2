
public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Sandra");
		g1.setCpf("226292-63");
		g1.setSalario(5400);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(6588);
		boolean verifica = g1.autentica(6588);
		System.out.println(verifica);
		
		System.out.println(g1.getBonificacao());
	}
}
