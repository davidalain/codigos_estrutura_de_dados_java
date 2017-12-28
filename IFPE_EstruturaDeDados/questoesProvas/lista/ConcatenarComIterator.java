package lista;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConcatenarComIterator {

	public static List<Character> concatenar(LinkedList<Character> a, LinkedList<Character> b){
		
		List<Character> saida = new LinkedList<>();
		Iterator<Character> it1 = a.iterator();
		Iterator<Character> it2 = b.descendingIterator();
		
		while(it1.hasNext()){
			saida.add(it1.next());
		}
		
		while(it2.hasNext()){
			saida.add(it2.next());
		}
		
		return saida;
	}
	
	/**
	 * implementação feita por XXXX na prova
	 * @param a
	 * @param b
	 * @return
	 */
	public static List<Character> concatenar2(List<Character> a, List<Character> b){
		
		List<Character> aux = new LinkedList<>();
		Deque<Character> pilha = new LinkedList<>();
		
		for(char au : a){
			aux.add(au);
		}
		
		for(char au : b){
			pilha.push(au);
		}
		
		Iterator<Character> it = pilha.iterator();
		while(it.hasNext()){
			aux.add(it.next());
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		
		LinkedList<Character> a = new LinkedList<>();
		LinkedList<Character> b = new LinkedList<>();
		
		a.add('a');
		a.add('b');
		a.add('c');
		
		b.add('d');
		b.add('e');
		b.add('f');
		
		List<Character> c = concatenar(a, b);
		
		System.out.println(c);
	}
	
}
