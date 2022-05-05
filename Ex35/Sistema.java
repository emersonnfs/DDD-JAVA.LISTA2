package Ex35;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cliente [] listaClientes = new Cliente[2];
		
		int id, idade;
		String nome, email;
		ContaBancaria conta;
		char possuiConta;
		
		for(int i= 0; i<2 ; i++) {
		
			Cliente c = new Cliente();
			
			System.out.printf("Digite o seu ID: ");
			id = scan.nextInt();
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
            
            String agencia, numero;
            double saldo;
            
            ContaBancaria cb = new ContaBancaria();
            
            
            if(possuiConta == 'S') {
            	
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
            	cb= null;
            }
            
            listaClientes[i] = c;
		}
		for(int i= 0; i<2 ; i++) {
			if(listaClientes[i].getConta() != null) {
				System.out.printf("O cliente %s\nDe Agência:%s\nConta:%s\nSaldo:R$%.2f",listaClientes[i].getNome(), listaClientes[i].getConta().getAgencia());
		
			}
			else {
				System.out.printf("O cliente %s",listaClientes[i].getNome());
			}
		}	

	}

}
