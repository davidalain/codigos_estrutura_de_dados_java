package lista;

import java.util.Iterator;
import java.util.LinkedList;

public class PalindromoIterator {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("a");
		lista.add("b");
		lista.add("a");
		lista.add("a");
		
		System.out.println(palindromo(lista));
	}

	public static <E> boolean palindromo(LinkedList<E> lista){
		Iterator<E> it = lista.iterator();
		Iterator<E> it2 = lista.descendingIterator();

		while(it.hasNext()){
			if(!it.next().equals(it2.next()))
				return false;

		}
		
		return true;
	}
	
}
