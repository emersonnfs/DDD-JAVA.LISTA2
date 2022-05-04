package entrada_processamento_saida;

public class Ex28Do {

	public static void main(String[] args) {
		
		int n = 1, t=0;
		
		do {
			t = t + n;
			n++;
		}
		while (n<=100);
		System.out.printf("A soma de todos os números de 1 a 100 é:\n%d",t);
	}

}
