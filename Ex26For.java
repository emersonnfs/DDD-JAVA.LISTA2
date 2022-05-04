package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t, a, b;
		
		System.out.printf("Digite o número que você quer a tabuada: ");
		n = ler.nextInt();
		
		for (;n<0;) {
			System.out.printf("ERRO, somente números positivos.\nDigite o número que você quer a tabuada: ");
			n = ler.nextInt();
		}
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextInt();
		System.out.printf("Digite o segundo número número: ");
		b = ler.nextInt();
		
		for (;a>=b;) {
			System.out.printf("ERRO!!!O segundo número deve ser maior que o primeiro.\nDigite o segundo número número: ");
			b = ler.nextInt();
		}
		for (i = b; a <= i ;i--) {
			 t = n * i;
			System.out.printf("\n %d X %d = %d",n,i, t);
		 }
	}
}
