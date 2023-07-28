
public class TesteConexao {

	public static void main(String[] args) {
		// A simplificação que faremos a seguir só entrou no Java 1.7. A ideia é, na
		// hora de usar o try, inicializarmos a variável dentro de (), juntando duas
		// linhas em uma só, e ao invés de chamar o método fecha(), chamaremos close(),
		// com a interface AutoCloseable implementada na classe Conexao
		// Vamos apagar o fecha() e mover a linha que imprime para o novo método:
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro de conexao!");
		}

		// -----------------------------------
		// 2º método
//		Conexao cnx = null;
//		try {
//			cnx = new Conexao();
//			cnx.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("Erro de conexao!");
//		}finally {
//			System.out.println("Finally");
//			if(cnx != null) {
//				cnx.close();
//			}
//		}
	}

}
