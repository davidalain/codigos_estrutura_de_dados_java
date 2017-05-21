package ordenacao;

/**
 * Corrigido por David Alain:
 * 	Faltava o método equals()
 * 
 * @author David Alain
 */
public class Produto {

	private String codBarras;
	private String nome;
	private double preco;

	public Produto(String codBarras, String nome, double preco) {
		this.codBarras = codBarras;
		this.nome = nome;
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
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

	public String toString(){
		return "{"+codBarras +", " +nome+ " " +preco +"}";
	}

	/**
	 * Implementado por David Alain
	 * 
	 * Necessário por causa do equals() da classe ItemPedido que compara os produtos.
	 */
	@Override
	public boolean equals(Object obj) {

		if(!(obj instanceof Produto))
			return false;

		Produto produto = (Produto) obj;

		return this.codBarras.equals(produto.codBarras);
	}

	//	public static void main(String[] args) {
	//
	//		ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	//
	//		listaProduto.add(new Produto("123", "motoG", 600.00));
	//		listaProduto.add(new Produto("245", "iphone", 900.00));
	//		listaProduto.add(new Produto("567", "j5", 850.00));
	//
	//
	//	}
}
