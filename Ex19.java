package entrada_processamento_saída;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Informe a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Informe a nota da P2: ");
		p2 = ler.nextDouble();
		
		media = (((p2 * 2) + p1)/3);
		
		if (media > 5) {
			System.out.printf("Você foi Aprovado e sua média foi %.2f", media);
		}else if (media < 5) {
			System.out.printf("Você NÃO FOI Aprovado e sua média foi %.2f", media);
		}else {
			System.out.printf("Você pasou raspando %.2f", media);
		}
	}

}
