package entrada_processamento_saida;

public class Ex29While {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 1, i = 30;
		
		System.out.println(n2);
		System.out.println(n1);
		i = i - 1;
		
		while (i >0){
		System.out.println((n1 +n2) + " ");
		int fib = n1 + n2;
		n1 = n2;
		n2 = fib;
		i--;
		}
	}
}
