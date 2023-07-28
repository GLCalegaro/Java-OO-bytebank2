
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente giovanna = new Gerente();
		giovanna.setNome("Giovanna Luiza");
		giovanna.setCpf("1518123-23");
		giovanna.setSalario(2658.44);
		
		System.out.println(giovanna.getNome());
		System.out.println(giovanna.getBonificacao());
	}
}
