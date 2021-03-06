package Ex35;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}
	
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public String exibirNomeIdade() {
		return getNome() + " - " + getIdade();
	}
	
	public String exibirDadosConta() {
		if (this.conta != null)
			return this.conta.getAgencia() + " - " + this.conta.getNumero();
		else
			return "N?o tem conta.";
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
}
	
