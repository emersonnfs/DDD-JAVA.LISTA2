package entrada_processamento_saida;

import java.util.Scanner;

public class Ex25For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i , t;
		
		System.out.printf("Digite o n�mero que voc� quer a tabuada: ");
		n = ler.nextInt();
		
		 for (;n<0;) {
			 System.out.printf("ERRO, somente n�meros positivos.\nDigite o n�mero que voc� quer a tabuada: ");
				n = ler.nextInt();
		 }
		 for (i = 1; i <= 10 ;i++) {
			 t = n * i;
			System.out.printf("\n %d X %d = %d",n,i, t);
		 }
	}
}
