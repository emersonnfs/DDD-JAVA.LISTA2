package Ex36;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Produto [] listaProduto = new Produto[2];
		
		int id;
		String nome;
		double preco, quantidade;
		Categoria categoria;
		char possuiCategoria;
		
		for (int i = 0; i<2; i++) {
			Produto p = new Produto();
			
			System.out.printf("Digite o seu ID: ");
			id = scan.nextInt();
			p.setId(id);
			
			System.out.printf("Digite o seu nome: ");
			nome = scan.next();
			p.setNome(nome);
			
			System.out.printf("Digite o preço: R$ ");
			preco = scan.nextDouble();
			p.setPreco(preco);
			
			System.out.printf("Digite a quantidade: ");
			quantidade = scan.nextDouble();
			p.setQuantidade(quantidade);
			
			System.out.printf("Possui categoria? (S/N)");
            possuiCategoria = scan.next().charAt(0);
			
            int idCategoria;
            String nomeCategoria;
            
            Categoria c = new Categoria();
            
            if (possuiCategoria == 'S') {
            	System.out.printf("Digite seu id");
            	idCategoria = scan.nextInt();
            	c.setId(idCategoria);
            	
            	System.out.printf("Digite seu nome");
            	nomeCategoria = scan.next();
            	c.setNome(nomeCategoria);
            }
            else {
            	c=null;
            }
            
            listaProduto[i] = p;
		}
		for(int i= 0; i<2 ; i++) {
			
			System.out.printf("%s",listaProduto[i].exibirNomePreco());
		
			System.out.printf("%s",listaProduto[i].exibirNomeQuantidade());
		}
	}	

}
