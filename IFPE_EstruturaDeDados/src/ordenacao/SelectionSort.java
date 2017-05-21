package ordenacao;

import java.util.Arrays;

public abstract class SelectionSort {

	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1, -1, 0};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(Comparable[] array){
		
		int indiceMenor;
		for(int i = 0 ; i < array.length ; i++){
			indiceMenor = indiceMenorValor(array, i, array.length);
			troca(array, i, indiceMenor);
		}
	}
	
	private static int indiceMenorValor(Comparable[] array, int inicio, int fim){
		
		int menor = inicio;
		for(int i = inicio + 1 ; i < fim ; i++){
			if(array[i].compareTo(array[menor]) < 0){
				menor = i;
			}
		}
		return menor;
	}
	
	private static void troca(Comparable[] array, int i, int j){
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
