package arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class Aula22102015 {

	public static void main(String[] args) {

		LinkedList<String> cidades = new LinkedList<String>();

		cidades.add("Recife");
		cidades.add("Olinda");
		cidades.add("Garanhuns");
		cidades.addLast("Jupi"); //s� tem na classe LinkedList. N�o tem na interface List.

		//imprime os elementos da lista
		System.out.println("=========== Antes ===========");
		for (String cidade : cidades) {
			System.out.println(cidade);
		}

		//Modifica os elementos da lista
		System.out.println("=========== Meio ===========");
		Iterator<String> itFrente = cidades.iterator();
		while(itFrente.hasNext()){
			String cidade = itFrente.next();

			if(cidade.equals("Olinda"))
				itFrente.remove();
		}

		//Anda de tr�s para frente nas lista
		System.out.println("=========== Tr�s para frente ===========");
		Iterator<String> itTras = cidades.descendingIterator();
		while(itTras.hasNext()){
			String cidade = itTras.next();
			System.out.println(cidade);
		}

		//imprime os elementos da lista
		System.out.println("=========== Depois ===========");
		for (String cidade : cidades) {
			System.out.println(cidade);
		}


		//		cidades.remove();

		//Criar um reposit�rio com ArrayList

	}

}
