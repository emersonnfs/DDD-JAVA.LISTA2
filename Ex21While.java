package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.printf("Digite um n�mero posito: ");
		n = ler.nextDouble();
		
		while (n<= 0) {
			System.out.printf("ERRO, apenas n�meros positivos. ");
			System.out.printf("Digite um n�mero posito: ");
			n = ler.nextDouble();
		}
		System.out.printf("%.1f", n);
	}

}
