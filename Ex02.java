package entrada_processamento_saída;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado, área;
		
		System.out.printf("Digite a medida da aresta:");
		lado = ler.nextDouble();
		
		área = lado * lado;
		
		System.out.printf("A área do quadrado é: %.2f" , área);
	}

}