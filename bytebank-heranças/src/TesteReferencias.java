
public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Marcelo");
		g1.setSalario(6800.0);
		
		Funcionario dw1 = new DesenvolvedorWeb();
		dw1.setSalario(4300.50);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(dw1);
		System.out.println(controle.getSoma());;
	}

}
