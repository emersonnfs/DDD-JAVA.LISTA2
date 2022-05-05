package Ex34;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	Cliente() {
		
	}
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public String exibirNomeIdade() {
		return this.nome + " - " + this.idade;
	}
	
	public String exibirDadosConta() {
		return this.conta.agencia + " - " + this.conta.numero;
	}
}
