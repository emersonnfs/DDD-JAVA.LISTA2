package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b;
		
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextDouble();
		
		do {
			System.out.printf("Digite o segundo n�mero n�mero: ");
			b = ler.nextDouble();
			if (a>=b) {
				System.out.printf("O segundo n�mero deve ser maior que o primeiro.\n");
			}
			else {
				System.out.printf("O segundo n�mero %.2f � maior que o %.2f.",b, a);
			}
		}
		while (a>=b);
	}

}
