package candidatura;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int param1 = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int param2 = terminal.nextInt();
		
		try {
			contar(param1, param2);
		}
		catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		terminal.close();
		
	}
	static void contar(int param1, int param2 ) throws ParametrosInvalidosException {
		if (param1 > param2) {
			throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo");
		}	
		int contagem = param2 - param1;
		for (int i = 0; i <= contagem; i++) {
			System.out.println(param1 + i);
		}
	}
	
	public static class ParametrosInvalidosException extends Exception {
		public ParametrosInvalidosException(String message) {
			super(message);
	}
}
}

