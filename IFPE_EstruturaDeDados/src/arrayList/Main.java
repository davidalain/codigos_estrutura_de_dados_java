package arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>(5);

		//Adicionar (Inserir)
		lista.add("A");
		System.out.println(lista);
		lista.add("B");
		System.out.println(lista);
		lista.add("C");
		System.out.println(lista);
		lista.add("D");
		System.out.println(lista);
		lista.add("E");
		System.out.println(lista);
		lista.add("F");
		System.out.println(lista);
		lista.add("G");
		System.out.println(lista);

		//		System.out.println("--------------------");
		//		for(int i = lista.size() - 1 ; i >= 0 ; i--){
		//			System.out.println(lista.get(i)); //lista[i]
		//		}


		//Remover
		lista.remove(2);
		System.out.println(lista);

		//Pegar
		String obj = lista.get(0);
		System.out.println(obj);
		System.out.println(lista);

		//Alterar
		lista.set(1, "D");
		System.out.println(lista);

		lista.add(2, "G");
		System.out.println(lista);

		lista.remove(1);
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);

		/*	
		Iterator it = lista.iterator();
		while(it.hasNext()){

			String str = (String) it.next();
			System.out.println(str);

			if(str.equals("B")){
				it.remove();

				System.out.println(lista);

				it.next();
				it.next();
				it.remove();

				System.out.println(lista);

				it.next();
				it.next();
				it.remove();

				System.out.println(lista);

				break;
			}
		}

		System.out.println(lista);
		 */


	}



}
