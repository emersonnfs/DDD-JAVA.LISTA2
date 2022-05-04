package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t, a, b;
		
		System.out.printf("Digite o número que você quer a tabuada: ");
		n = ler.nextInt();
		
		do {
			if(n<0) {	
				System.out.printf("ERRO, somente números positivos.\nDigite o número que você quer a tabuada: ");
				n = ler.nextInt();
			}	
		}
		while (n<0);
		
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo número número: ");
			b = ler.nextInt();
			if (a>=b) {
				System.out.printf("O segundo número deve ser maior que o primeiro.\n");
			}
		}
		while (a>=b);
		
		i = b;
		do {
			t = n * i;
			System.out.printf("\n %d X %d = %d",n,i, t);
            i--;
		}
		while (a<=i);
	}

}
