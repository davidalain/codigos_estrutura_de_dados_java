package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AulaED23112017 {

	/**
	 * 1. Faça as atividades a seguir:
	 * 
	 * a) Crie duas listas de inteiros com 5 e 10 valores, respectivamente e
	 * concatene as duas listas
	 * 
	 * b) Crie uma classe Pessoa que tem como atributos nome, datadenascimento e CPF.
	 * crie uma lista com 5 pessoas diferentes e crie uma nova instância de pessoa (6ª pessoa)
	 * que tem o mesmo CPF da pessoa 1 e remova a pessoa 1 utilizando-se do método remove
	 * da lista passando como parâmetro a nova instância (6ª pessoa).
	 * 
	 * c) Crie um método que receba uma lista de inteiros, inverta e retorne a lista invertida.
	 * 
	 * d) Crie um método que receba uma lista de caracteres e substitua todas as vogais por 'X'
	 */

	public static void main2(String[] args) {
		
		System.out.println("a)");
		a();

		System.out.println("b)");
		b();

		System.out.println("c)");
		List<Integer> listaInt = Arrays.asList(new Integer[] {0,1,3,5,6,7,9});
		System.out.println(listaInt);
		System.out.println(c(listaInt));

		List<Character> listaChar = new LinkedList<>();
		listaChar.add('a');
		listaChar.add('c');
		listaChar.add('b');
		listaChar.add('I');
		listaChar.add('o');
		listaChar.add('P');
		listaChar.add('ç');

		System.out.println("d)");
		System.out.println(listaChar);
		d(listaChar);
		System.out.println(listaChar);

	}

	public static void a() {

		List<Integer> lista1 = null;
		List<Integer> lista2 = null;
		List<Integer> lista3 = new ArrayList<>();

		lista1 = Arrays.asList(new Integer[] {0,1,2,3,4});
		lista2 = Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});

		lista3.addAll(lista1);
		lista3.addAll(lista2);

		System.out.println(lista1);
		System.out.println(lista2);
		System.out.println(lista3);

	}

	public static void b() {

		List<Pessoa> lp = new ArrayList<>();

		lp.add(new Pessoa("aa", "11/11/10", "000000000000"));
		lp.add(new Pessoa("bb", "30/12/11", "111111111111"));
		lp.add(new Pessoa("cc", "01/10/12", "222222222222"));
		lp.add(new Pessoa("dd", "22/11/90", "333333333333"));
		lp.add(new Pessoa("ee", "33/11/80", "444444444444"));

		System.out.println(lp);

		Pessoa p = new Pessoa("zz", "11/11/11", "000000000000");
		lp.remove(p);

		System.out.println(lp);

	}

	public static List<Integer> c(List<Integer> lista) {

		List<Integer> saida = new ArrayList<>();

		for(Integer valor : lista) {
			saida.add(0, valor);	
		}

		return saida;
	}

	public static void d(List<Character> lista) {

		for(int i = 0 ; i < lista.size() ; i++) {
			switch(lista.get(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				lista.set(i, 'X');
				break;
			}
		}

	}
	
	public static void main(String[] args) {
		
		Map<Pessoa,List<String>> mapa = new TreeMap<>();
		
		Pessoa p1 = new Pessoa("aa","111","0000");
		Pessoa p2 = new Pessoa("aa","111","1111");
		Pessoa p3 = new Pessoa("aa","111","2222");
		Pessoa p4 = new Pessoa("aa","111","3333");
		
		mapa.put(p1, Arrays.asList(new String[] {"Chagas","Cancer","Coisado"}));
		mapa.put(p2, Arrays.asList(new String[] {"AIDS"}));
		mapa.put(p3, Arrays.asList(new String[] {"Tuberculose"}));
		mapa.put(p4, Arrays.asList(new String[] {"Hemorróidas"}));
		
		System.out.println(mapa.get(p1)); //retorna o valor cuja chave é p1
		System.out.println(mapa.values()); //retorna a coleção de valores
		System.out.println(mapa.keySet()); //retorna o conjunto de chaves
		System.out.println(mapa.entrySet()); //retorna o conjunto de pares que relaciona Pessoa com List<String>
		
		mapa.put(p1, Arrays.asList(new String[] {"Dengue","Rubéola"}));
		System.out.println(mapa.entrySet());
		
		Pessoa p5 = new Pessoa("aa","111","0000");
		System.out.println(mapa.containsKey(p1));
		System.out.println(mapa.containsKey(p5));
		
		System.out.println(p1.hashCode());
		System.out.println(p5.hashCode());
		System.out.println(p1.equals(p5));
		
	}


}
