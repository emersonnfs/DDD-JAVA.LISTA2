package entrada_processamento_saida;

public class Ex24Do {

	public static void main(String[] args) {
		
		int i,t;
		
		i = 1;
		
		do {
			t = 5 * i;
			System.out.printf("\n 5 X %d = %d",i, t);
            i++;	
		}
		while (i<=10);
	}

}
