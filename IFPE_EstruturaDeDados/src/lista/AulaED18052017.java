
package lista;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AulaED18052017 {

	public static void main(String[] args) {
		
		List<Character> lista = new LinkedList<>();
		
		lista.add('a');
		lista.add('b');
		lista.add('c');
		lista.add('d');
		lista.add('-');
		lista.add('^');
		lista.add('+');
		
		Iterator<Character> it = lista.iterator();
		
		while(it.hasNext()){
			char c = it.next();
			if(c >= 'a' && c <= 'z'){
				it.remove();
			}
		}
		
		System.out.println(lista);
		
	}
	
}
