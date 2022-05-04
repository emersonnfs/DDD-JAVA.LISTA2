package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Digite um número positivo: ");
		n = ler.nextInt();
		
		for (;n<=0;) {
			System.out.printf("Erro.\nDigite um número positivo: ");
			n = ler.nextInt();
		}
		System.out.printf("%d", n);
	}

}
