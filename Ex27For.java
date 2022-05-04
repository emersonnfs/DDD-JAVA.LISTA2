package entrada_processamento_saida;

import java.util.Scanner;

public class Ex27For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t, x;
		
		for (n = 1 ; n <= 10 ; n++) {
			System.out.printf("Tabuada do %d.\n",n);
			for (i = 1 ; i <= 10 ; i++) {
				t = n * i;
				System.out.printf("%d X %d = %d\n",n,i, t);
			}
		}
		
		System.out.printf("Aperte (0) e enter para ter a tabuada de dos próximos 10 números.");
		x = ler.nextInt();
		for(;x != 0;) {
			System.out.printf("ERRO!!!!!Comando não aceito.\nAperte (0) e enter para ter a tabuada de dos próximos 10 números.");
			x = ler.nextInt();
		}
		
		for (n = 11 ; n <= 20 ; n++) {
			System.out.printf("Tabuada do %d.\n",n);
			for (i = 1 ; i <= 10 ; i++) {
				t = n * i;
				System.out.printf("%d X %d = %d\n",n,i, t);
		
			}
		}	
	}
}
