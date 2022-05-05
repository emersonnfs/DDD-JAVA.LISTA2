package Ex38;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private double quantidade;
	private Categoria categoria;
	
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
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public String exibirNomePreco() {
		if(this.categoria != null) {
			return getNome() + "\nDa Categoria:" + getCategoria().getNomeCategoria() + "\n" + getPreco() + "\n";
		}
		else {
			return getNome() + "\n" + getPreco() + "\n";
		}
	}
	public String exibirNomeQuantidade() {
		if(this.categoria != null) {
			return getNome() + "\nDa Categoria:" + getCategoria().getNomeCategoria() + "\n" + getQuantidade() + "\n"; 
		}
		else {
			return getNome() + "\n" + getQuantidade()+ "\n";
		}
	}
	
}
