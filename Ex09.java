package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Diga o n�mero: ");
		a = ler.nextDouble();
		
		System.out.printf("Diga outro n�mero: ");
		b = ler.nextDouble();
		
		if (a < b) {
			System.out.printf("%.2f", a);
		}else {
			System.out.printf("%.2f", b);
		}
	}

}