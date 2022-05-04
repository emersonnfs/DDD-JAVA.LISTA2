package entrada_processamento_saida;

import java.util.Scanner;

public class Ex27Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t, x;
		
		n = 1;
		do {
			i = 1;
			System.out.printf("Tabuada do %d.\n",n);
			do {
				t = n * i;
				System.out.printf("%d X %d = %d\n",n,i, t);
	            i++;
			}
			while (i<=10);
			n++;
		}
		while (n<=10);
		
		
		do {
			System.out.printf("ERRO!!!!!Comando não aceito.\nAperte (0) e enter para ter a tabuada de dos próximos 10 números.");
			x = ler.nextInt();
		}
		while (x != 0);
		
		n = 11;
		do {
			i = 1;
			System.out.printf("Tabuada do %d.\n",n);
			do {
				t = n * i;
				System.out.printf("%d X %d = %d\n",n,i, t);
	            i++;
			}
			while (i<=10);
			n++;
		}
		while (n<=20);
	}
}
