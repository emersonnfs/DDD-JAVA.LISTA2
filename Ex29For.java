package entrada_processamento_saida;

public class Ex29For {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i = 0; i<30; i++) {
			n1 = n1 + n2;
			n2 = n1- n2;
			System.out.println(n1);
		}

	}

}
