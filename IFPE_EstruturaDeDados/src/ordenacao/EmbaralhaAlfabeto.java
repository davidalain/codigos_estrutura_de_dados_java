package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhaAlfabeto {

	public static char[] alfabeto() {
		char[] a = new char[26];
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = (char)('A' + i);
		}
		return a;
	}

	public static char[] alfabetoEmbaralhado() {

		List<Character> alfabeto = new ArrayList<>();

		for(int i = 0 ; i < 26 ; i++) {
			alfabeto.add((char)('A' + i));
		}

		Collections.shuffle(alfabeto);
		
		char[] saida = new char[26];
		for(int i = 0 ; i < saida.length ; i++) {
			saida[i] = alfabeto.get(i);
		}
		
		return saida;
	}

	public static void main(String[] args) {
		List<Character> alfabeto = new ArrayList<>();

		for(int i = 0 ; i < 26 ; i++) {
			alfabeto.add((char)('A' + i));
		}

		System.out.println(alfabeto.toString().replace(" ", ""));

		Collections.shuffle(alfabeto);

		System.out.println(alfabeto.toString().replace(" ", ""));
	}

	//	public static int[] removeRepetido()

}
