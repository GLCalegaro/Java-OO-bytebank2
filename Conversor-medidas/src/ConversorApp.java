import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int input = 0;
		
		while(input != 12) {
			Conversor.exibirMenu();
			input = entrada.nextInt();
			
			switch(input) {
			case 1:
			break;
			
			case 2:
			break;
			
			case 9:
				System.out.println("Que pena, saindo do programa.... ");
			break;
			
			default:
				System.out.println("Digite um número válido!");
				break;
			}
		} 
		System.out.println();
		entrada.close();
		
	}

}
