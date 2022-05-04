package entrada_processamento_saida;

public class Ex30For {

	public static void main(String[] args) {
		int n1 = 1, n2 = 1, n3 = 1,i ;
		
		System.out.printf("1\n1\n1\n");
		
		for (i = 0; i <= 30; i++) {
			int berg = n1 + n2 + n3;
			System.out.println(berg);
			n1 = n2;
			n2 = n3;
			n3 = berg;
		}
	}

}
