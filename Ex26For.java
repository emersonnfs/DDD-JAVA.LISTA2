package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t, a, b;
		
		System.out.printf("Digite o n�mero que voc� quer a tabuada: ");
		n = ler.nextInt();
		
		for (;n<0;) {
			System.out.printf("ERRO, somente n�meros positivos.\nDigite o n�mero que voc� quer a tabuada: ");
			n = ler.nextInt();
		}
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.printf("Digite o segundo n�mero n�mero: ");
		b = ler.nextInt();
		
		for (;a>=b;) {
			System.out.printf("ERRO!!!O segundo n�mero deve ser maior que o primeiro.\nDigite o segundo n�mero n�mero: ");
			b = ler.nextInt();
		}
		for (i = b; a <= i ;i--) {
			 t = n * i;
			System.out.printf("\n %d X %d = %d",n,i, t);
		 }
	}
}
