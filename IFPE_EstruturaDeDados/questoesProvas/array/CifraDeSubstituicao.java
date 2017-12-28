package array;

import java.util.Arrays;

import ordenacao.EmbaralhaAlfabeto;

public class CifraDeSubstituicao {

	private static char[] a = EmbaralhaAlfabeto.alfabeto();
	private static char[] b = EmbaralhaAlfabeto.alfabetoEmbaralhado();

	public static char[] cifra(char[] msg) {
		char[] cifrado = new char[msg.length];
		for(int i = 0 ; i < msg.length ; i++) {
			cifrado[i] = b[(msg[i] - 'A')];
		}
		return cifrado;
	}

	public static char[] cifra2(char[] msg) {

		char[] cifrado = new char[msg.length];
		for(int i = 0 ; i < msg.length ; i++) {
			for(int j = 0 ; j < a.length ; j++) {
				if(msg[i] == a[j]) {
					cifrado[i] = b[j];
				}
			}
		}

		return cifrado;
	}

	public static char[] decifra2(char[] cifrado) {

		char[] msg = new char[cifrado.length];
		for(int i = 0 ; i < cifrado.length ; i++) {
			for(int j = 0 ; j < b.length ; j++) {
				if(cifrado[i] == b[j]) {
					msg[i] = a[j];
				}
			}
		}

		return msg;
	}

	public static void main(String[] args) {

		char[] msg = {'D','A','V','I','D'};

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(msg));
		
		char[] cifrado = cifra2(msg);
		System.out.println(Arrays.toString(cifrado));
		
		char[] msg2 = decifra2(cifrado);
		System.out.println(Arrays.toString(msg2));

	}

}
