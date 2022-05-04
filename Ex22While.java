package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo número número: ");
		b = ler.nextDouble();
		
		while (a>=b) {
			System.out.printf("Digite o segundo número número: ");
			b = ler.nextDouble();
		}
		System.out.printf("O segundo número %.2f é maior que o %.2f.",b, a);
	}

}
