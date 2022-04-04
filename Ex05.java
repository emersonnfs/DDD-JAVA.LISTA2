package entrada_processamento_saída;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		double a, temperatura;
		
		System.out.printf("Fale a temperatura em °C:");
		a= ler.nextDouble();
		
		temperatura = (a * 1.8)+32;
		
		System.out.printf("A temperatura em °F:%.2f", temperatura);
	}

}