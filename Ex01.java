package entrada_processamento_saída;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, área;
		
		System.out.printf("Digite a base do retângulo: ");
		a= ler.nextDouble();
		
		System.out.printf("Digite a altura do retângulo: ");
		b = ler.nextDouble();
		
		área = a * b;
		
		System.out.printf("A área é: %.2f * %.2f =%.2f", a, b, área);
	}

}