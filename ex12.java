import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Informe a base do retângulo");
		base = ler.nextDouble();
		
		System.out.printf("Informe a altura do retângulo");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		if (100<area){
			System.out.printf("Esse terreno é pequeno");
		}else if(100 > area) {
				System.out.printf("Esse terreno é pequeno");
		}

	}

}
