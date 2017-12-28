package lista;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class MetodosCollections<E> {

	public static void main(String[] args) {
		
		String a = new String("2");
		String b = "2";
		if(a.equals(b)) {
			System.out.println("SIM");
		}else {
			System.out.println("NÃO");
		}
		
		
		ArrayList<String> listaInteiros = new ArrayList<>();
		listaInteiros.add("teste");
		Object o2 = listaInteiros.get(0);
		String i2 = listaInteiros.get(0);
		
		ArrayList lista = new ArrayList();
		lista.add("teste");
		Object o = lista.get(0);
		String i = lista.get(0);
		
		E e = new E();
		E[] e2 = new E[10];		

		
		
		
//		Collections.disjoint(c1, c2);
//		Collections.fill(list, obj);
//		Collections.frequency(c, o);
//		Collections.max(coll);
//		Collections.min(coll);
//		Collections.replaceAll(list, oldVal, newVal);
//		Collections.reverse(list);
//		Collections.rotate(list, distance);
//		Collections.shuffle(list);
//		Collections.sort(list);

//		Arrays.disjoint(c1, c2);
//		Arrays.fill(list, obj);
//		Arrays.frequency(c, o);
//		Arrays.max(coll);
//		Arrays.min(coll);
//		Arrays.replaceAll(list, oldVal, newVal);
//		Arrays.reverse(list);
//		Arrays.rotate(list, distance);
//		Arrays.shuffle(list);
//		Arrays.sort(list);

//		String a = "a";
//
//		switch (a) {
//		case "a":
//
//			break;
//		case "b":
//
//			break;
//		default:
//			break;
//		}
		
		
		Collection<String> colecao;
		List<String> listA;
		Set<String> conjunto;
		Map<String, String> mapa;
		
		TreeMap<String, String> mapaArvore;
		
		TreeSet<String> conjuntoArvore;
		HashSet<String> conjuntoHash;
		
		
		HashMap<String, String> mapaHash;
		LinkedList<String> listaEncadeada;
		ArrayList<String> listaArray;
		Queue<String> fila;
		Stack<String> pilha;
		
		Deque<String> doubleEndedQueue_filaDuplamenteEncadeada;
		ArrayDeque<String> dequeComArray;


	}

}
