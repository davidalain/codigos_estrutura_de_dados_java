package lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class AulaED04112016 {

	public static void main2(String[] args) {

		String nome = "ifpeoooifpeaoifpeaaaifpe_ifpe";
		int contador = 0;
		int index = 0;
		int newIndex = 0;
		while((newIndex = nome.indexOf("ifpe", index)) > -1){
			contador++;
			index = newIndex + "ifpe".length();
		}
		
		System.out.println("quantidade:" + contador);

		//========================================================

//		List<String> lista = new ArrayList<String>();
//		//			List<String> lista = new LinkedList<String>();
//
//		lista.add("Aula"); //Adicionar um elemento
//		lista.add("ED");
//		String valor = lista.get(0); //Pegar um elemento
//		lista.set(0, "Novo"); //Alterar um elemento
//		lista.remove(0); //Remover um elemento
//
//		System.out.println(valor);
//		System.out.println(lista.get(0));

		//========================================================
		
	}
	
	public static List<Integer> questao1aula5(List<Integer> lista){

		List<Integer> saida = new ArrayList<Integer>();
		
		for(Integer valor : lista){
			if(valor > 0){
				saida.add(valor);
			}
		}
		
		return saida;
	}

	
	public static void main(String[] args){
		
//		Queue<Integer> fila = new LinkedList<Integer>();
//		fila.offer(2);
//		fila.offer(3);
//		fila.offer(4);
//		
//		Integer v1 = fila.poll();
//		Integer v2 = fila.poll();
//		Integer v3 = fila.poll();
//		Integer v4 = fila.poll();
//		
//		System.out.println("Fila: v1:" + v1 + ", v2:" + v2 + ", v3:" + v3 + ", v4:" + v4);
//		
//		Stack<Integer> pilha = new Stack<Integer>();
//		pilha.push(2);
//		pilha.push(3);
//		pilha.push(4);
//		
//		v1 = pilha.pop();
//		v2 = pilha.pop();
//		v3 = pilha.pop();
//		v4 = pilha.pop();
//		
//		System.out.println("Pilha: v1:" + v1 + ", v2:" + v2 + ", v3:" + v3 + ", v4:" + v4);
		
		
		TreeMap<Integer, String> arvore = new TreeMap<Integer, String>();
		arvore.put(1, "a");
		arvore.put(2, "b");
		
		System.out.println(arvore.get(1));
		
		TreeSet<Integer> arvore2 = new TreeSet<Integer>();
		arvore2.add(1);
		
		
		
	}
	

}
