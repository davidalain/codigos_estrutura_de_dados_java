package lista;

import java.util.LinkedList;
import java.util.List;

public class FiltroString {
	
	public static void main(String[] args) {
		
		List<String> lista = new LinkedList<>();
		lista.add("Dav");
		lista.add("aav");
		lista.add("aaD");
		lista.add("AAA");
		
		System.out.println(lista);
		filtroString(lista);
		System.out.println(lista);
		
	}

	public static void filtroString(List<String> lista){

		for(int i = 0 ; i < lista.size() ; i++){
			String str = lista.get(i);
			char ini = str.charAt(0);
			char end = str.charAt(str.length() - 1);
			if(!((ini >= 'A' && ini <= 'Z') && (end >= 'a' && end <= 'z'))){
				lista.remove(i--);
			}
		}

	}

}
