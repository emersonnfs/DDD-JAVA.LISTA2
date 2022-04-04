package entrada_processamento_saída;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int a, b, c ,d ,media;
		
		System.out.printf("Digite o primeiro n°:");
		a= ler.nextInt();
		
		System.out.printf("Digite o segundo n°:");
		b= ler.nextInt();
		
		System.out.printf("Digite o terceiro n°:");
		c= ler.nextInt();
		
		System.out.printf("Digite o quarto n°:");
		d= ler.nextInt();
		
		media = (a + b + c +d )/4;
		
		System.out.printf("A média dos quatro números é:%d", media);
	}
}	
