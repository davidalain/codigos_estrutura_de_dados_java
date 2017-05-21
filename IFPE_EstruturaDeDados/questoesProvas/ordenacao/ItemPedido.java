package ordenacao;

/**
 * 	== Letra A da questão 3 ==
 * 
 * Corrigido por David Alain:
 * 	Faltava o método equals()
 * 
 * @author David Alain
 */
public class ItemPedido {
	
	private int qtdeProd;
	private Produto produto;
	
	public ItemPedido(int qtdeProd, Produto produto) {
		this.qtdeProd = qtdeProd;
		this.produto = produto;
	}

	public int getQtdeProd() {
		return qtdeProd;
	}
	public void setQtdeProd(int qtdeProd) {
		this.qtdeProd = qtdeProd;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String toString(){
		return "{"+qtdeProd +", " +produto + "}\r\n";
	}

	/**
	 * Implementado por David Alain
	 * 
	 * O método equals desta classe é necessário porque ele é utilizado internamente no método indexOf() da classe List.
	 * Vide método letraB na classe Questao3
	 * 
	 * Neste caso foi implementado como critério de igualdade apenas o produto. Intencionalmente a quantidade não utilizada. 
	 */
	@Override
	public boolean equals(Object obj) {

		if(!(obj instanceof ItemPedido))
			return false;
		
		ItemPedido itemPedido = (ItemPedido) obj;
		
		return this.produto.equals(itemPedido.produto);
	}

}
