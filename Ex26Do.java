package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, t, a, b;
		
		System.out.printf("Digite o n�mero que voc� quer a tabuada: ");
		n = ler.nextInt();
		
		do {
			if(n<0) {	
				System.out.printf("ERRO, somente n�meros positivos.\nDigite o n�mero que voc� quer a tabuada: ");
				n = ler.nextInt();
			}	
		}
		while (n<0);
		
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo n�mero n�mero: ");
			b = ler.nextInt();
			if (a>=b) {
				System.out.printf("O segundo n�mero deve ser maior que o primeiro.\n");
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
