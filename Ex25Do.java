package entrada_processamento_saida;

import java.util.Scanner;

public class Ex25Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i , t;
		
		i=1;
		
		System.out.printf("Digite o número que você quer a tabuada: ");
		n = ler.nextInt();
		
		do {
			if (n<=0) {
				System.out.printf("ERRO, somente números positivos.\nDigite o número que você quer a tabuada: ");
				n = ler.nextInt();
			}
		}
		while (n < 0);
		
		do {
			t = n * i;
			System.out.printf("\n %d X %d = %d",n,i, t);
            i++;
		}
		
		while (i<=10) ;
	}

}
