package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo n�mero n�mero: ");
		b = ler.nextDouble();
		
		while (a>=b) {
			System.out.printf("Digite o segundo n�mero n�mero: ");
			b = ler.nextDouble();
		}
		System.out.printf("O segundo n�mero %.2f � maior que o %.2f.",b, a);
	}

}
