package entrada_processamento_saida;

import java.util.Scanner;

public class Ex25While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n , i , t;
		
		System.out.printf("Digite o número que você quer a tabuada: ");
		n = ler.nextInt();
		
		i = 1;
		
		while (n<0) {
			System.out.printf("ERRO, somente números positivos.\nDigite o número que você quer a tabuada: ");
			n = ler.nextInt();
		}
		while (i <=10) {
			t = n * i;
			System.out.printf("\n %d X %d = %d",n,i, t);
            i++;
		}
	}

}
