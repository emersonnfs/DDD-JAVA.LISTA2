package entrada_processamento_saida;

public class Ex30While {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 1, n3 = 1, i = 0;
		
		System.out.printf("1\n1\n1\n");
		
		while (i<= 30 ) {
			int berg = n1 + n2 + n3;
			System.out.println(berg);
			n1 = n2;
			n2 = n3;
			n3 = berg;
			i++;
		}
}

}
