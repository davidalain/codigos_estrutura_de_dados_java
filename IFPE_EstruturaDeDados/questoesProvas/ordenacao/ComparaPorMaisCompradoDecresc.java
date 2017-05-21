package ordenacao;

import java.util.Comparator;

public class ComparaPorMaisCompradoDecresc implements Comparator<ItemPedido> {

	/**
	 * OK
	 */
	@Override
	public int compare(ItemPedido p1,ItemPedido p2) {
		if(p1.getQtdeProd() > p2.getQtdeProd()) return -1;
		if(p1.getQtdeProd() < p2.getQtdeProd()) return 1;

		return 0;
	}

}
