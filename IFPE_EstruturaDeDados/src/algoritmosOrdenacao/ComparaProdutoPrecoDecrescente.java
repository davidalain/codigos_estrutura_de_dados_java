package algoritmosOrdenacao;

import java.util.Comparator;

public class ComparaProdutoPrecoDecrescente implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		if(o1.getPreco() > o2.getPreco())
			return -1;
		if(o1.getPreco() < o2.getPreco())
			return 1;
		return 0;
	}
	
}
