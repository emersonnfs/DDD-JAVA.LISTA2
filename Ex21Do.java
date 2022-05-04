package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		do {
			System.out.printf("Digite um número positivo: ");
			n = ler.nextDouble();
			if (n<= 0) {
				System.out.printf("Numero negativo\n");	
			}
			else {
				System.out.printf("%.1f",n);
			}
		}
		while (n<=0);
		
	}

}
