package entrada_processamento_saída;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		double a, b, fim;
		
		System.out.printf("Informe a cotação do dia referente a moeda: ");
		a = ler.nextDouble();
		
		System.out.printf("Informe a valor a ser convertido: ");
		b = ler.nextDouble();
		
		fim = a * b;
		
		System.out.printf("%.2f", fim);
	}
}	
