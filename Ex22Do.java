package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b;
		
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextDouble();
		
		do {
			System.out.printf("Digite o segundo número número: ");
			b = ler.nextDouble();
			if (a>=b) {
				System.out.printf("O segundo número deve ser maior que o primeiro.\n");
			}
			else {
				System.out.printf("O segundo número %.2f é maior que o %.2f.",b, a);
			}
		}
		while (a>=b);
	}

}
