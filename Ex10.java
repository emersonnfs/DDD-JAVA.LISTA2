package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Digite o primeiro n�mero: ");
			a = ler.nextDouble();
			
		System.out.printf("Digite o segundo n�mero: ");
			b = ler.nextDouble();
			
		if (a > b) {
			System.out.printf("%.2f � o maior n�mero", a);
		}else if(a == b) {
			System.out.printf("Os n�meros s�o iguais.");
		}else {
			System.out.printf("%.2f � o maior n�mero", b);
		}

	}

}
