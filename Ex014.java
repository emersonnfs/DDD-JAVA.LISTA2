package entrada_processamento_saída;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	double peso, altura, imc;
	
	System.out.printf("Informe o seu peso em Kg: ");
	peso = ler.nextDouble();
	
	System.out.printf("Informe a sua altura em metros: ");
	altura = ler.nextDouble();
	
	imc = peso * (altura * altura);
	
	if ((imc >= 20) && (imc < 25)){
		System.out.printf("Você está no peso ideal");
	}else {
		System.out.printf("Você não está no peso ideal");
	}
	}

}
