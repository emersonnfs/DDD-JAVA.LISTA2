package entrada_processamento_saida;

public class Ex28For {

	public static void main(String[] args) {
		int n, t = 0;
		
		for (n = 1 ; n <= 100 ; n++) {
			t = t + n;
		}
		System.out.printf("A soma de todos os números de 1 a 100 é:\n%d",t);
	}

}