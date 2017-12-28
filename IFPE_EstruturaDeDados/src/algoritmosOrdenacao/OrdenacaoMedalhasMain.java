package algoritmosOrdenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class OrdenacaoMedalhasMain {

	public static void embaralhar(List<PaisMedalha> lista){
		Collections.shuffle(lista);
//
//		Random r = new Random();
//		for(int i = 0 ; i < lista.size() ; i++){
//
//			int iRandom = r.nextInt(lista.size());
//			PaisMedalha p1 = lista.get(i);
//			PaisMedalha p2 = lista.get(iRandom);
//
//			lista.set(i, p2);
//			lista.set(iRandom, p1);
//		}
	}

	public static void embaralhar(PaisMedalha[] array){

		Random r = new Random();

		for(int i = 0 ; i < array.length ; i++){

			int iRandom = r.nextInt(array.length);
			PaisMedalha p1 = array[i];
			PaisMedalha p2 = array[iRandom];

			array[i] = p2;
			array[iRandom] = p1;
		}

	}

	public static void main(String[] args) {

//		List<PaisMedalha> lista = new ArrayList<PaisMedalha>();
//		lista.add(new PaisMedalha("Estados Unidos", 46, 37, 38));
//		lista.add(new PaisMedalha("Reino Unido", 27, 23, 17));
//		lista.add(new PaisMedalha("China    ", 26, 18, 26));
//		lista.add(new PaisMedalha("Rússia    ", 19, 18, 19));
//		lista.add(new PaisMedalha("Alemanha    ", 17, 10, 15));
//		lista.add(new PaisMedalha("Japão    ", 12, 8, 21));
//		lista.add(new PaisMedalha("França    ", 10, 18, 14));
//		lista.add(new PaisMedalha("Coreia do Sul", 9, 3, 9));
//		lista.add(new PaisMedalha("Itália    ", 8, 12, 8));
//		lista.add(new PaisMedalha("Austrália    ", 8, 11, 10));
		
		int indice = 0;
		PaisMedalha[] paises = new PaisMedalha[10];
		paises[indice++] = new PaisMedalha("Estados Unidos", 46, 37, 38);
		paises[indice++] = new PaisMedalha("Reino Unido", 27, 23, 17);
		paises[indice++] = new PaisMedalha("China    ", 26, 18, 26);
		paises[indice++] = new PaisMedalha("Rússia    ", 19, 18, 19);
		paises[indice++] = new PaisMedalha("Alemanha    ", 17, 10, 15);
		paises[indice++] = new PaisMedalha("Japão    ", 12, 8, 21);
		paises[indice++] = new PaisMedalha("França    ", 10, 18, 14);
		paises[indice++] = new PaisMedalha("Coreia do Sul", 9, 3, 9);
		paises[indice++] = new PaisMedalha("Itália    ", 8, 12, 8);
		paises[indice++] = new PaisMedalha("Austrália    ", 8, 11, 10);

		int posicao = 1;
		System.out.println();
		System.out.println("== Antes de embaralhar ==");
		System.out.println("Posição\tPais\t\t\tOuro\tPrata\tBronze\tTotal");
		for(PaisMedalha p : paises){
			System.out.println(""+ posicao++ +"º\t"+p.toString());
		}

//		embaralhar(lista);
		embaralhar(paises); //Para embaralhar uma lista usando a própria API Java use Collections.shuffle(paises);
		System.out.println();
		System.out.println("== Depois de embaralhar ==");
		System.out.println("Posição\tPais\t\t\tOuro\tPrata\tBronze\tTotal");
		posicao = 1;
		for(PaisMedalha p : paises){
			System.out.println(""+ posicao++ +"º\t"+p.toString());
		}

//		Collections.sort(lista); //Ordenar lista
//		Arrays.sort(paises, new ComparadorPaisMedalha()); //Ordenar array
		
		Arrays.sort(paises, new Comparator<PaisMedalha>() {

			@Override
			public int compare(PaisMedalha o1, PaisMedalha o2) {
				if(o1.getOuro() > o2.getOuro()) return -1;
				if(o1.getOuro() < o2.getOuro()) return 1;
				
				if(o1.getPrata() > o2.getPrata()) return -1;
				if(o1.getPrata() < o2.getPrata()) return 1;
				
				if(o1.getBronze() > o2.getBronze()) return -1;
				if(o1.getBronze() < o2.getBronze()) return 1;
				
				return 0;
			}
			
		});
		
		
		
		
		System.out.println();
		System.out.println("== Depois de ordenar ==");
		System.out.println("Posição\tPais\t\t\tOuro\tPrata\tBronze\tTotal");
		posicao = 1;
		for(PaisMedalha p : paises){
			System.out.println(""+ posicao++ +"º\t"+p.toString());
		}

	}

}
