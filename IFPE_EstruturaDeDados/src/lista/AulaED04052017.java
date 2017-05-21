package lista;

import java.util.LinkedList;
import java.util.List;

public class AulaED04052017 {

	public static void main(String[] args) {

		/**
		 * Implemente um algoritmo que:
		 * 
		 * 1) Adicione as Strings "Aula", "de", "ED" em uma lista.
		 * 2) Imprima a lista no console.
		 * 3) Remova o primeiro elemento da lista e 2)
		 * 4) Altere o último elemento da lista para "Estrutura de Dados" e 2)
		 * 5) Remova o segundo elemento, imprima-o e 2)
		 * 6) Adicione "TI" no fim da lista e 2)
		 * 7) Mostre o elemento de maior comprimento. 
		 * 8) Mostre todos os elementos, cada um em uma linha.
		 * 9) Mostre todos os elementos da lista na ordem inversa em uma única linha.
		 * 10) Faça 9) usando recursividade.
		 * */

		//List<String> lista = new ArrayList<>();
		List<String> lista = new LinkedList<>();

		//1) Adicione as Strings "Aula", "de", "ED" em uma lista.
		lista.add("Aula");
		lista.add("de");
		lista.add("ED");
		System.out.println("----------------------------------");

		//2) Imprima a lista no console.
		System.out.println(lista);
		System.out.println("----------------------------------");

		//3) Remova o primeiro elemento da lista e 2)
		lista.remove(0);
		System.out.println(lista);
		System.out.println("----------------------------------");

		//4) Altere o último elemento da lista para "Estrutura de Dados" e 2)
		lista.set(lista.size() - 1, "Estrutura de Dados");
		System.out.println(lista);
		System.out.println("----------------------------------");

		//5) Remova o segundo elemento, imprima-o e 2)
		System.out.println(lista.remove(1));
		System.out.println(lista);
		System.out.println("----------------------------------");

		//6) Adicione "TI" no fim da lista e 2)
		lista.add("TI");
		System.out.println(lista);
		System.out.println("----------------------------------");

		//7) Mostre o elemento de maior comprimento.
		String maior = lista.get(0);
		for(String s : lista){
			if(s.length() > maior.length()){
				maior = s;
			}
		}
		System.out.println(maior);
		System.out.println("----------------------------------");

		//8) Mostre todos os elementos, cada um em uma linha.
		for(String s : lista){
			System.out.println(s);
		}
		System.out.println("----------------------------------");

		//9) Mostre todos os elementos da lista na ordem inversa em uma única linha.
		System.out.print("[");
		for(int i = 0 ; i < lista.size() ; i++){
			System.out.print(lista.get(lista.size() - i - 1));
			if(i < lista.size() - 1){
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.println("----------------------------------");

		//10) Faça 9) usando recursividade.
		imprimeListaInversaRecursividade(lista);

	}

	public static void imprimeListaInversaRecursividade(List<String> lista){
		System.out.print("[");
		imprimeListaInversaRecursividade(lista,0);
		System.out.println("]");
	}

	public static void imprimeListaInversaRecursividade(List<String> lista, int indice){
		if(indice < lista.size()){
			System.out.print(lista.get(lista.size() - indice - 1));
			if(indice < lista.size() - 1){
				System.out.print(", ");
			}
			imprimeListaInversaRecursividade(lista, indice+1);
		}
		
		
	}


}
