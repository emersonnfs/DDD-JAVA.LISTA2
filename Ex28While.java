package entrada_processamento_saida;

public class Ex28While {

	public static void main(String[] args) {
		int n = 1, t=0;
		
		while (n<= 100) {
			t = t + n;
			n++;
		}
		System.out.printf("A soma de todos os n�meros de 1 a 100 �:\n%d",t);
	}

}
