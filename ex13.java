import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.printf("Digite o 1° número");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o 2° número");
		num2 = ler.nextDouble();
		
		System.out.printf("Digite o 3° número");
		num3 = ler.nextDouble();
		
		if (num1>num2) {
			if (num1>num3) {
			System.out.printf("O maior numero é: %.1f", num1);
			}}
		if (num2>num1) {
			if (num2>num3) {
				System.out.printf("O maior numero é: %.1f", num2);
			}}
		if (num3>num1) {
			if (num3>num2) {
				System.out.printf("O maior numero é: %.1f", num3);
			}}
	}

}
