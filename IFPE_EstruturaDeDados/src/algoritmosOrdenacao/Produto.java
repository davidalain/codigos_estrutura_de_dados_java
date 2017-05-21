package algoritmosOrdenacao;

public class Produto {

	private String nome;
	private String codigoBarras;
	private double preco;
	
	public Produto(String nome, String codigoBarras, double preco) {
		super();
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Produto))
			return false;
		
		return this.codigoBarras.equals(((Produto) obj).codigoBarras);
	}
	
	@Override
	public String toString() {
		return "{"+codigoBarras+","+nome+","+preco+"}"; 
	}
	
	
}
