package entrada_processamento_saida;

import java.util.Scanner;

public class Ex27While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t,x;
		
		n= 1;
		while (n<=10) {
			i = 1;
			System.out.printf("Tabuada do %d.\n",n);
			while (i <= 10) {
				t = n * i;
				System.out.printf("%d X %d = %d\n",n,i, t);
	            i++;
			}
		n++;	
		}
		System.out.printf("Aperte (0) e enter para ter a tabuada de dos pr�ximos 10 n�meros.");
		x = ler.nextInt();
		while (x != 0) {
			System.out.printf("ERRO!!!!!Comando n�o aceito.\nAperte (0) e enter para ter a tabuada de dos pr�ximos 10 n�meros.");
			x = ler.nextInt();
		}
		n= 11;
		while (n<=20) {
			i = 1;
			System.out.printf("Tabuada do %d.\n",n);
			while (i <= 10) {
				t = n * i;
				System.out.printf("%d X %d = %d\n",n,i, t);
	            i++;
			}
		n++;	
		}
	}
}
