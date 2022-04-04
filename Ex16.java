package entrada_processamento_saída;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, num1, num2, num3;
		
		System.out.printf("Digite o primeiro lado do triángulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do triángulo: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do triángulo: ");
		c = ler.nextDouble();
		
		num1 = a * a;
		num2 = b * b;
		num3 = c * c;
		
		if (num1 +num2 == num3) {
			System.out.printf("É um triangulo retangulo");
		}else if (num1 + num3 == num2) {
			System.out.printf("É um triangulo retangulo");
		}else if (num2 + num3 == num1) {
			System.out.printf("É um triangulo retangulo");
		}else { 
			System.out.printf("Não é um triangulo retangulo");
		}
	}
}
