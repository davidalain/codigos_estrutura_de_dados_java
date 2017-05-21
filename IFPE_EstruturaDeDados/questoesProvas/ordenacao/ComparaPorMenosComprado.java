package ordenacao;

import java.util.Comparator;

public class ComparaPorMenosComprado implements Comparator<ItemPedido> {

	/**
	 * Corrigido por David Alain
	 * 
	 * Comparador para fazer ordenação pelo menos comprado
	 **/
	@Override
	public int compare(ItemPedido p1,ItemPedido p2) {
		if(p1.getQtdeProd() < p2.getQtdeProd()) return 1;	//	< para 1
		if(p1.getQtdeProd() > p2.getQtdeProd()) return -1;	//	> para -1

		return 0;
	}

	//	@Override
	//	public int compare(ItemPedido p1,ItemPedido p2) {
	//		if(p1.getQtdeProd() > p2.getQtdeProd()) return 1;
	//		if(p1.getQtdeProd() < p2.getQtdeProd()) return -1;
	//		
	//		return 0;
	//	}

}
