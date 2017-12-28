package aaa;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Aula10082017 {

	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,7};
		//		System.out.println(Arrays.toString(array));
		//		System.out.println(arrayToString(array));
		//		System.out.println(arrayToStringInverso(array));
		//		imprimeElementosIndicesPares(array);
		//		imprimeElementosValoresImpares(array);
		//		System.out.println(arrayToStringInversoComecandoDoZero(array));
		//		System.out.println(contarOcorrenciasDeK(-2/*x*/,2/*y*/,10/*n*/,1/*k*/));
		System.out.println(somaValoresArray(array));

	}

	public static String arrayToString(int[] array){

		String str = "";
		for(int i = 0 ; i < array.length ; i++){
			str += array[i];
			if(i != array.length - 1)
				str +=  ", ";
		}

		return "[" + str + "]";
	}

	public static String arrayToStringInverso(int[] array){

		String str = "";
		for(int i = array.length - 1 ; i >= 0 ; i--){
			str += array[i];
			if(i != 0){
				str +=  ", ";
			}
		}

		return "[" + str + "]";
	}

	public static void imprimeElementosIndicesPares(int[] array){

		for(int i = 0 ; i < array.length ; i++){
			if(i % 2 == 0){
				System.out.println(array[i]);
			}
		}

	}

	public static void imprimeElementosValoresImpares(int[] array){
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0){
				System.out.println(array[i]);
			}
		}
	}

	public static String arrayToStringInversoComecandoDoZero(int[] array){

		String str = "";
		for(int i = 0 ; i < array.length ; i++){
			str += array[(array.length - 1) - i];
			if(i != array.length - 1){
				str +=  ", ";
			}
		}

		return "[" + str + "]";
	}

	public static int contarOcorrenciasDeK(int x, int y, int n, int k){

		int[] array = new int[n];
		Random r = new Random();
		int max = y;
		int min = x;
		int contador = 0;

		for(int i = 0 ; i < array.length ; i++){
			array[i] = r.nextInt(max - min + 1) + min;
		}
		System.out.println(Arrays.toString(array));

		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == k){
				contador++;
			}
		}

		return contador;
	}

	public static int somaValoresArray(int[] array){
		int soma = 0;
		for (int valor : array) {
			soma += valor;
		}
		return soma;
	}
	
	public static int contarValoresIntervaloXY(double[] array, double x, double y){
		int contador = 0;
		for(double valor : array){
			if(valor >= x && valor <= y){
				contador++;
			}
		}
		return contador;
	}

}
