import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Informe a base do retângulo");
		base = ler.nextDouble();
		
		System.out.printf("Informe a altura do retângulo");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		if (100>area){
			System.out.printf("Esse terreno é grande");
		}
	}

}
