package Ex32;

import java.util.Scanner;

import classe_atributo.cliente;

public class Sistema {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		Cliente [] lista = new Cliente [5];
		
		for(int i = 0; i < 5 ; i++) {
		
			Cliente a = new Cliente();
			
			System.out.println("Digite seu id: ");
			a.id = ler.nextInt();
			
			System.out.println("Digite seu Nome: ");
			a.nome = ler.next();
			
			System.out.println("Digite sua idade: ");
			a.idade = ler.nextInt();
			
			System.out.println("Digite seu email: ");
			a.email = ler.next();
			
			lista[i] = a;
		}
		for (int i= 0 ; i<= 5 ; i++) {
			if (lista[i].idade >= 18) {
				System.out.printf("O cliente: %d\nNome: %s\nIdade: %d\nEmail:%s", lista[i].id, lista[i].nome, lista[i].idade, lista[i].email);
			}
		}

	}

}
