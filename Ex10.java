package entrada_processamento_saída;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("Digite o primeiro número: ");
			a = ler.nextDouble();
			
		System.out.printf("Digite o segundo número: ");
			b = ler.nextDouble();
			
		if (a > b) {
			System.out.printf("%.2f é o maior número", a);
		}else if(a == b) {
			System.out.printf("Os números são iguais.");
		}else {
			System.out.printf("%.2f é o maior número", b);
		}

	}

}
