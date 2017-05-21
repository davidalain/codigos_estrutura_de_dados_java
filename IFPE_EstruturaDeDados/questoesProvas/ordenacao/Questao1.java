package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Questao1 {

	/**
	 * Implementado por David Alain
	 * 
	 * @param a1
	 * @param a2
	 * @param a3
	 * @return
	 */
	public static List<String> Q1(String[] a1, String[] a2, String[] a3) {

		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		ArrayList<String> lista3 = new ArrayList<String>();

		/**
		 * Converte de array para lista
		 */

		for (String str1 : a1) {
			lista1.add(str1);
		}
		for (String str2 : a2) {
			lista2.add(str2);
		}
		for (String str3 : a3) {
			lista3.add(str3);
		}

		lista1.retainAll(lista2);	//Faz a interseção entre lista1 e lista2, deixando salvo em lista1
		lista1.retainAll(lista3);	//Faz a interseção entre lista3 e o resultado da interseção de lista1 com lista2, deixando em lista1
		
		return lista1;
	}

	//	public static LinkedList<String> Q1(String[] a1, String[] a2, String[] a3){
	//
	//
	//
	//		LinkedList<String> saida = new LinkedList<String>();
	//		LinkedList<String> l1 = new LinkedList<String>();
	//		LinkedList<String> l2 = new LinkedList<String>();
	//		LinkedList<String> l3 = new LinkedList<String>();
	//
	//
	//		for(String s1: a1){
	//			l1.add(s1);
	//		}
	//		for(String s2: a2){
	//			l2.add(s2);
	//		}
	//		for(String s3: a3){
	//			l3.add(s3);
	//		}
	//
	//		for (int i = 0; i < l1.size(); i++) {
	//			String elem1 = l1.get(i);
	//
	//			if (l2.contains(elem1)) {
	//				saida.add(elem1);
	//			}
	//		}
	//
	//		for (int i = 0; i < l2.size(); i++) {
	//			String elem2 = l2.get(i);
	//
	//			if (l1.contains(elem2)) {
	//				saida.add(elem2);
	//			}
	//		}
	//
	//		for (int i = 0; i < l3.size(); i++) {
	//			String elem3 = l3.get(i);
	//
	//			if (l1.contains(elem3)) {
	//				saida.add(elem3);
	//			}
	//		}
	//
	//
	//
	//
	//		return saida;		
	//	}

	/**
	 * OK
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Q1: Imlemente um método que receba três arrays de nomes(String) e
		// retorne uma lista de nomes cujos nomes estão contidos nas
		// três listas. Dica(A n B n C).

		String[] a1 = { "apple", "lg", "motorola" };
		String[] a2 = { "asus", "apple", "lg" };
		String[] a3 = { "apple", "lg", "motorola" };

		System.out.println(Q1(a1, a2, a3));

	}

}