package Ex37;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Ex35.ContaBancaria;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		ArrayList<Cliente> listaClientes = new ArrayList<>();

		int option, id, idade;
		String nome, email;
		ContaBancaria conta;
		char possuiConta;
		String agencia, numero;
		double saldo;

		do {
			System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
			System.out.printf("Escolha uma opção:\n");
			System.out.printf("1 - Adicionar cliente \n" + "2 - Atualizar cliente \n" + "3 - Excluir cliente \n"
					+ "4 - Exibir clientes \n" + "5 - Sair\n\n");

			System.out.printf("Digite a opção desejada: ");
			option = scan.nextInt();

			if (option == 1) {
				Cliente c = new Cliente();

				id = listaClientes.size() + 1;
				c.setId(id);

				System.out.printf("Digite o seu nome: ");
				nome = scan.next();
				c.setNome(nome);

				System.out.printf("Digite o seu idade: ");
				idade = scan.nextInt();
				c.setIdade(idade);

				System.out.printf("Digite o seu email: ");
				email = scan.next();
				c.setEmail(email);

				System.out.printf("Possui conta? (S/N)");
				possuiConta = scan.next().charAt(0);

				ContaBancaria cb = new ContaBancaria();

				if (possuiConta == 'S') {

					System.out.printf("Digite a sua Agencia");
					agencia = scan.next();
					cb.setAgencia(agencia);

					System.out.printf("Digite o número da conta");
					numero = scan.next();
					cb.setNumero(numero);

					System.out.printf("Digite o saldo");
					saldo = scan.nextDouble();
					cb.setSaldo(saldo);
				}

				else {
					cb = null;
				}

				listaClientes.add(c);

				System.out.printf("Cliente incluído com sucesso!");
				System.in.read();
			} 
			else if (option == 2) {
				for (Cliente cliente : listaClientes) {
					if (cliente.getConta() == null) {
						System.out.printf("ID : %d\nNome : %s\nIdade : %d\nEmail : %s\n", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail());
					}
					else {
						System.out.printf("ID : %d\nNome : %s\nIdade : %d\nEmail : %s\nAgência : %s\nNúmero da Conta : %s\nSaldo : %.2f", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
					}
				}
				
				System.out.printf("\nDigite o id do cliente que deseja atualizar: ");
				id = scan.nextInt();

				System.out.printf("Digite o seu nome: ");
				nome = scan.next();
				

				System.out.printf("Digite o seu idade: ");
				idade = scan.nextInt();
				

				System.out.printf("Digite o seu email: ");
				email = scan.next();
				

				System.out.printf("Possui conta? (S/N)");
				possuiConta = scan.next().charAt(0);

				ContaBancaria cb = new ContaBancaria();
				if (possuiConta == 'S') {

					System.out.printf("Digite a sua Agencia");
					agencia = scan.next();
					

					System.out.printf("Digite o número da conta");
					numero = scan.next();
					

					System.out.printf("Digite o saldo");
					saldo = scan.nextDouble();
					
				}
				else {
					agencia = null;
					numero = null;
					saldo = 0;
				}
				
				
				Cliente c = listaClientes.get(id-1);
				
				c.setNome(nome);
				c.setIdade(idade);
				c.setEmail(email);
				cb.setAgencia(agencia);
				cb.setNumero(numero);
				cb.setSaldo(saldo);
				
				System.out.printf("Cliente atualizado com sucesso!");
                System.in.read();
			}
			else if(option == 3){
				for (Cliente cliente : listaClientes) {
					if (cliente.getConta() == null) {
						System.out.printf("ID : %d\nNome : %s\nIdade : %d\nEmail : %s\n", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail());
					}
					else {
						System.out.printf("ID : %d\nNome : %s\nIdade : %d\nEmail : %s\nAgência : %s\nNúmero da Conta : %s\nSaldo : %.2f", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
					}
				}
				System.out.printf("\nDigite o id do cliente que deseja excluir: ");
				id = scan.nextInt();
				
				listaClientes.remove(id-1);
				System.out.printf("Cliente removido com sucesso!");
                System.in.read();               
			}
			else if (option == 4) {
				for (Cliente cliente : listaClientes) {
					if (cliente.getConta() == null) {
						System.out.printf("ID : %d\nNome : %s\nIdade : %d\nEmail : %s\n", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail());
					}
					else {
						System.out.printf("ID : %d\nNome : %s\nIdade : %d\nEmail : %s\nAgência : %s\nNúmero da Conta : %s\nSaldo : %.2f", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
					}
				}
				System.in.read();
			}
		}

		while (option < 5);

	}

}
