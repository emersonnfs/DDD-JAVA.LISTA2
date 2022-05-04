package entrada_processamento_saida;

public class Ex29Do {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 0, i = 0;
		
		System.out.printf("1\n");
		do {
			System.out.println(n1+ n2);
			n1 = n1 + n2;
			n2 = n1 - n2;
			i++;
		}
		while(i<30);

	}

}
