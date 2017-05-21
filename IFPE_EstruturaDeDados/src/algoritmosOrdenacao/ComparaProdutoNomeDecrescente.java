package algoritmosOrdenacao;

import java.util.Comparator;

public class ComparaProdutoNomeDecrescente implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o2.getNome().compareTo(o1.getNome());
	}

}
