package buscaBinaria;

import java.util.Comparator;

public class ComparadorProdutoNome implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {

		int ret = o1.getMarca().compareTo(o2.getMarca());
		if(ret != 0){
			return ret;
		}
		
		ret = (o1.getNome().compareTo(o2.getNome()));
//		if(ret != 0){
			return ret;
//		}
		
//		return o1.getId() - o2.getId();
	}

	
	
}
