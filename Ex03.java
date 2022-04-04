package entrada_processamento_saída;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a , b, área;
		
		System.out.printf("Digite a base do triângulo:");
		a= ler.nextInt();
		
		System.out.printf("Digite a altura do triângulo:");
		b= ler.nextInt();
		
		área = (a * b) /2 ;
		
				
		System.out.printf("É: %d" ,área);
	}

}
