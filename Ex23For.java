package entrada_processamento_saida;

import java.util.Scanner;

public class Ex23For {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		char sexo;
		String genero ;
		
		
		System.out.printf("Digite 'M' para masculino, 'F' para feminino e 'O' para demais g�neros.");
		sexo = scan.next().toUpperCase().charAt(0);
		
		for (;(sexo != 'M')||(sexo != 'F')||(sexo != 'O'); ) {
			System.out.printf("ERRO!!!!!!O deve seguir apenas Digite 'M' para masculino, 'F' para feminino e 'O' para demais g�neros.");
			sexo = scan.next().toUpperCase().charAt(0);
		}
		if (sexo == 'O') {
			System.out.printf("Informe como prefere ser chamado: ");
			genero = scan.next();
			System.out.printf("O seu g�nero � %s", genero);
		}
		else if(sexo == 'F') {
			System.out.printf("O seu sexo � Feminino");
		}
		else {
			System.out.printf("O seu sexo � Masculino");
		}

	}

}
