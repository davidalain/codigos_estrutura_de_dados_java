package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Aula29102015 {

	/**
	 * Filtra e remove os elementos repetidos dentro de uma lista usando iterator.
	 * 
	 * @param lista
	 */
	public static void filtroRemoveRepetidosCerto(List<String> lista){

		LinkedList<String> testados = new LinkedList<String>();
		Iterator<String> it = lista.iterator();

		while(it.hasNext()){

			String valor = it.next();
			Iterator<String> it2 = testados.iterator();
			boolean achou = false;

			while(it2.hasNext()){
				if(valor.equals(it2.next())){
					achou = true;
					break;
				}
			}

			if(achou){
				it.remove();
			}else{
				testados.add(valor);
			}
		}

	}

	/**
	 * Filtra e remove os elementos repetidos dentro de uma lista usando iterator.
	 * 
	 * 		Não pode fazer com Iterator em dois loops e modificar a lista.
	 * 		Gera exceção de concorrência.
	 * 
	 * @param lista
	 */
	public static void filtroRemoveRepetidosErrado(List<String> lista){

		Iterator<String> it = lista.iterator();
		while(it.hasNext()){

			String valor1 = it.next();

			Iterator<String> it2 = lista.iterator();

			while(it2.hasNext()){

				String valor2 = it2.next();
				if(valor1.equals(valor2)){
					it2.remove();
					break;
				}

			}

		}

	}

	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("A");
		lista.add("A");
		lista.add("A");
		lista.add("A");
		lista.add("A");
		lista.add("A");
		lista.add("B");

		System.out.println(lista.toString());
		filtroRemoveRepetidosCerto(lista);
//		filtroRemoveRepetidosErrado(lista);
		System.out.println(lista.toString());
	}

	public static void main4(String[] args) {
		LinkedList<Integer> listaLigada = new LinkedList<Integer>();
		ArrayList<Integer> listaArray = new ArrayList<Integer>();
	}


}
