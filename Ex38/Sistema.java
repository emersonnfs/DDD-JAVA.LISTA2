package Ex38;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		int id, idCategoria, option;
		String nome, nomeCategoria;
		double preco, quantidade;
		Categoria categoria;
		char possuiCategoria;
		
		do {
			System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
			System.out.printf("Escolha uma opção:\n");
			System.out.printf("1 - Adicionar produto \n" + "2 - Atualizar produto \n" + "3 - Excluir produto \n"
					+ "4 - Exibir produtos \n" + "5 - Sair\n\n");

			System.out.printf("Digite a opção desejada: ");
			option = scan.nextInt();
			
			if (option == 1) {
				Produto produto = new Produto();
				
				id = listaProdutos.size() + 1;
				produto.setId(id);
				
				System.out.printf("Digite o nome do produto: ");
				nome = scan.next();
				produto.setNome(nome);
				
				System.out.printf("Digite o preço do produto: ");
				preco = scan.nextDouble();
				produto.setPreco(preco);
				
				System.out.printf("Digite a quantidade do produto: ");
				quantidade = scan.nextDouble();
				produto.setQuantidade(quantidade);
				
				System.out.printf("Possui categoria? (S/N)");
				possuiCategoria = scan.next().toUpperCase().charAt(0);
				
				Categoria categoria= new Categoria();
				if (possuiCategoria == 'S') {
					idCategoria = listaProdutos.size() + 1;
					categoria.setIdCategoria(idCategoria);
					
					System.out.printf("Digite o nome da categoria.");
					nomeCategoria = scan.next();
					categoria.setNomeCategoria(nomeCategoria);
					
					produto.setCategoria(categoria);
				}
				else {
					categoria = null;
				}
				
				listaProdutos.add(produto);
				System.out.printf("Produto incluído com sucesso!");
				System.in.read();
			}
			else if(option == 2) {
				for (Produto p: listaProdutos) {
					if(p.getCategoria() == null) {
						System.out.printf("=========Produtos=========\n\n\nID: %d\nNome: %s\nPreço: %.2f\nQuantidade: %.1f\n\n\n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());
					}
					else {
						System.out.printf("=========Produtos=========\n\n\nID: %d\nNome: %s\nPreço: %.2f\nQuantidade: %.1f\nCategoria: %s\n\n\n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade(), p.getCategoria().getNomeCategoria());
					}
				}
				System.out.printf("\nDigite o id do produto que deseja atualizar: ");
				id = scan.nextInt();
				
				System.out.printf("Digite o nome do produto: ");
				nome = scan.next();
				
				System.out.printf("Digite o preço do produto: ");
				preco = scan.nextDouble();
				
				System.out.printf("Digite a quantidade do produto: ");
				quantidade = scan.nextDouble();
				
				System.out.printf("Possui categoria? (S/N)");
				possuiCategoria = scan.next().toUpperCase().charAt(0);
				
				
				if (possuiCategoria == 'S') {
					idCategoria = listaProdutos.size() + 1;
					
					System.out.printf("Digite o nome da categoria.");
					nomeCategoria = scan.next();
				}
				else {
					categoria = null;
				}
				Produto produto = listaProdutos.get(id-1);
				
				produto.setNome(nome);
				produto.setPreco(preco);
				produto.setQuantidade(quantidade);
				categoria.setNomeCategoria(nomeCategoria);
				
				System.out.printf("Produto atualizado com sucesso!");
                System.in.read();
			}
			else if(option == 3) {
				for (Produto p: listaProdutos) {
					if(p.getCategoria() == null) {
						System.out.printf("=========Produtos=========\n\n\nID: %d\nNome: %s\nPreço: %.2f\nQuantidade: %.1f\n\n\n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());
					}
					else {
						System.out.printf("=========Produtos=========\n\n\nID: %d\nNome: %s\nPreço: %.2f\nQuantidade: %.1f\nCategoria: %s\n\n\n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade(), p.getCategoria().getNomeCategoria());
					}
				}
				System.out.printf("\nDigite o id do produto que deseja excluir: ");
				id = scan.nextInt();
				
				listaProdutos.remove(id-1);
				System.out.printf("Produto removido com sucesso!");
                System.in.read();
			}
			else if(option == 4) {
				for (Produto p: listaProdutos) {
					if(p.getCategoria() == null) {
						System.out.printf("=========Produtos=========\n\n\nID: %d\nNome: %s\nPreço: %.2f\nQuantidade: %.1f\n\n\n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());
					}
					else {
						System.out.printf("=========Produtos=========\n\n\nID: %d\nNome: %s\nPreço: %.2f\nQuantidade: %.1f\nCategoria: %s\n\n\n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade(), p.getCategoria().getNomeCategoria());
					}
				}
				System.in.read();
			}
		}
		while (option <5);
	}
}