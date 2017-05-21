package algoritmosOrdenacao;

import java.util.Comparator;

public class ComparaProdutoNomeCrescente implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
