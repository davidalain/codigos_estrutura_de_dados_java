package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main2 {

	public static void main2(String[] args) {

		Random r = new Random();

		LinkedList<String> lista = new LinkedList<String>();
		LinkedList<String> lista2 = new LinkedList<String>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		lista.add("G");
		lista.add("H");

		System.out.println("lista2="+lista2);
		System.out.println("lista="+lista);
		System.out.println("----------------");

		while(!lista.isEmpty()){
			lista2.add(lista.remove(r.nextInt(lista.size())));
		}

		System.out.println("lista2="+lista2);
		System.out.println("lista="+lista);

	}

	public static void main3(String[] args) {

		List<String> lista = new ArrayList<String>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		lista.add("G");
		lista.add("H");

		System.out.println("lista="+lista);

		lista.add(1, lista.remove(7));

		System.out.println("lista="+lista);

	}
	
	public static void main4(String[] args) {
		
		Random r = new Random();
		List<String> lista = new LinkedList<String>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		lista.add("G");
		lista.add("H");

		System.out.println("lista="+lista);

		for(int i = 0 ; i < lista.size() ; i++){
			int indice1 = r.nextInt(lista.size());
			int indice2 = r.nextInt(lista.size());
			lista.add(indice2, lista.remove(indice1));	
		}
		

		System.out.println("lista="+lista);
		
	}
	
	public static void main(String[] args) {

//		Random r = new Random();
		
		System.out.println("Começou!");
		List<Long> lista = /*new LinkedList<Long>();*/ new ArrayList<Long>(100000000);
		
		long inicial = System.currentTimeMillis();

		for(long i = 0 ; i < 10000000L ; i++){
			lista.add(i);	
		}
		
		long fim = System.currentTimeMillis();

		System.out.println("tempo="+((fim-inicial)));
		System.out.println("Terminou!");
		
	}

}
