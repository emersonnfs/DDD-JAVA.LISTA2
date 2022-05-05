package Ex34;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente[] listaClientes = new Cliente [5];
		char possuiContaBancaria;
		
		for(int i=0;i<5; i++){
			Cliente c = new Cliente();
			
			System.out.printf("Digite o id do cliente: ");
			c.id = ler.nextInt();
			
			System.out.printf("Digite o nome do cliente: ");
			c.nome = ler.next();
			
			System.out.printf("Digite a idade do cliente: ");
			c.idade = ler.nextInt();
			
			System.out.printf("Digite o email do cliente: ");
			c.email = ler.next();
			
			System.out.printf("Possui conta bancária?\nDigite ('S') para sim e ('N') para não:");
			possuiContaBancaria = ler.next().charAt(0);
			
			if(possuiContaBancaria == 'S') {
				ContaBancaria ct = new ContaBancaria();
				c.conta = ct;
				
				System.out.printf("Digite a agência: ");
				c.conta.agencia = ler.next();
				
				System.out.printf("Digite o número da conta: ");
				c.conta.numero = ler.next();
				
				System.out.printf("Digite o saldo: ");
				c.conta.saldo = ler.nextDouble();
			}
			else {
				c.conta = null;
			}
		}
		for(int i=0;i<5; i++) {
			
		}
	}

}
