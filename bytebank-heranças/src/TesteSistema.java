
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(4538);
		
		Administrador adm = new Administrador();
		adm.setSenha(022);
		
		Cliente cl = new Cliente();
		cl.setSenha(38);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cl);
	}

}
