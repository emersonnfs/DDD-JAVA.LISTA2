package entrada_processamento_saída;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		double a, b, c, d, e, total, valor, troco;
		
		System.out.printf("Informe o primeiro valor: R$");
		a = ler.nextDouble();
		
		System.out.printf("Informe o segundo valor: R$");
		b = ler.nextDouble();
		
		System.out.printf("Informe o terceiro valor: R$");
		c = ler.nextDouble();
		
		System.out.printf("Informe o quarto valor: R$");
		d = ler.nextDouble();
		
		System.out.printf("Informe o quinto valor: R$");
		e = ler.nextDouble();
		
		total = a + b + c + d + e;
		
		System.out.printf("R$ %.2f",total);
		System.out.printf("Informe qual seu valor de pagamento para o troco: R$");
		valor = ler.nextDouble();
		
		troco = valor - total;
		
		System.out.printf("O seu troco foi R$ %.2f",troco);
	}
}