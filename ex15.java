import java.util.Scanner;

public class ex15 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double a , b, c;
		
		System.out.printf("Digite o 1ºlado: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o 2ºlado: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o 3ºlado: ");
		c = ler.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c >a)) {
			if ((a == b) && (a == c) && ( b == c)) {
				System.out.printf("O triângulo é equilátero.");
			}else if ((a != b) && (a != c) && ( b != c)){
				System.out.printf("O triângulo é escaleno.");
			}else {
				System.out.printf("O triângulo é isóceles.");
			}
		}

	}

}
