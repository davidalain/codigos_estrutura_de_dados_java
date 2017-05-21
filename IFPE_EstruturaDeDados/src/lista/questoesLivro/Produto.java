package lista.questoesLivro;

public class Produto{
	
	private int codigo;
	private double preco;
	private int quantidadeEstocada;
	
	public Produto(int codigo, double preco, int quantidadeEstocada) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.quantidadeEstocada = quantidadeEstocada;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstocada() {
		return quantidadeEstocada;
	}

	public void setQuantidadeEstocada(int quantidadeEstocada) {
		this.quantidadeEstocada = quantidadeEstocada;
	}
	
	
	
	
	
	
	
}
