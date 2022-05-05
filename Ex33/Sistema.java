package Ex33;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Produto [] listaProdutos = new Produto[10];
		
		for (int i = 0; i<10; i++) {
			Produto p = new Produto();
			System.out.printf("Infome o seu ID: ");
			p.id = scan.nextInt();
			
			System.out.printf("Infome a descrição do produto: ");
			p.descricao = scan.next();
			
			System.out.printf("Infome o seu valor: ");
			p.valor = scan.nextDouble();
			
			System.out.printf("Infome o seu quantidade: ");
			p.quantidade = scan.nextDouble();
			
			listaProdutos[i] = p;
		}
		
		for (int i = 0; i<10; i++) {
			if (listaProdutos[i].valor >= 100) {
				System.out.printf("Somente os produtos acima de R$100,00 são;\nID: %d\nDescrição: %s\nValor: R$%.2f\nQuantidade: %.1f\n\n\n",listaProdutos[i].id, listaProdutos[i].descricao, listaProdutos[i].valor, listaProdutos[i].quantidade);
			}
		}
	}

}
