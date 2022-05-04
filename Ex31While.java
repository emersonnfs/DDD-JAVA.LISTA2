package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1 = 1, n2 = 1, i = 0, n;
		
		System.out.printf("Digite quantos elementos irão ter na soma:\n");
		n = ler.nextInt();
		
		while ((n<= 0) || (n>100)){
			if (n<=0) {
				System.out.printf("Erro!!!!\nO número deve ser positivo e menor do que 100.\nDigite quantos elementos irão ter na soma:\n");
				n = ler.nextInt();
			}if (n>100) {
				System.out.printf("Erro!!!!\nO número deve ser positivo e menor do que 100.\nDigite quantos elementos irão ter na soma:\n");
				n = ler.nextInt();
			}
		}	
		
		System.out.printf("A sequência de com %d elementos é:\n",n);
		while (i<n) {
			i++;
			n1= n1 +n2;
			n2= n2+2;
			System.out.printf("%d\n",n1);
		}
	}

}
