package ordenacao;


import java.util.Comparator;

public class ComparaPorMenorPrecoMaisComprado implements Comparator<ItemPedido>{

	/**
	 * Implementado por David Alain
	 * 
	 * Comparador para ordenação em duas etapas: primeiro ordena pelo menor preço e depois pela quantidade de produtos.
	 */
	@Override
	public int compare(ItemPedido p1,ItemPedido p2) {

		//Primeiro ordena pelo menor preço
		if(p1.getProduto().getPreco() < p2.getProduto().getPreco()) return 1;	// < para 1
		if(p1.getProduto().getPreco() > p2.getProduto().getPreco())	return -1;	// > para -1

		//E depois pela quantidade dos produtos mais vendidos
		if(p1.getQtdeProd() > p2.getQtdeProd())	return 1;	// > para 1
		if(p1.getQtdeProd() < p2.getQtdeProd())	return -1;	// < para -1

		return 0;
	}

	//	@Override
	//	public int compare(ItemPedido p1,ItemPedido p2) {
	//		if(p1.getQtdeProd() > p2.getQtdeProd()){
	//			return -1;
	//		}
	//		if(p1.getQtdeProd() < p2.getQtdeProd()){
	//			return  1;
	//		}		
	//		if(p1.getProduto().getPreco() < p2.getProduto().getPreco()){
	//			return 1;
	//		}
	//		if(p1.getProduto().getPreco() < p2.getProduto().getPreco()){
	//			return -1;
	//		}
	//		return 0;
	//	}

}

