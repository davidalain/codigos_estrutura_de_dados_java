package lista;

import java.util.LinkedList;
import java.util.List;

public class ListaHerancaAddAll {

	public class MinhaLista<E> extends LinkedList<E>{
		public void adicionaTodos(List<E> listaP){
			for(E e : listaP)
				add(e);
		}
	}
	
	
	
}


