package algoritmosOrdenacao;

import java.util.Arrays;

public abstract class MergeSort {

	/**
	 * https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif
	 */

	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1, -1, 0};
		ordenar(a);
		System.out.println(Arrays.toString(a));
	}

	public static void ordenar(Comparable[] array)
	{
		Comparable[] tmp = new Comparable[array.length];
		separarParaOrdenar(array, tmp,  0,  array.length - 1);
	}


	private static void separarParaOrdenar(Comparable[] array, Comparable[] tmp, int inicio, int fim)
	{
		if( inicio < fim )
		{
			int centro = (inicio + fim) / 2;
			separarParaOrdenar(array, tmp, inicio, centro);
			separarParaOrdenar(array, tmp, centro + 1, fim);
			juntarOrdenando(array, tmp, inicio, centro + 1, fim);
		}
	}


	private static void juntarOrdenando(Comparable[] array, Comparable[] tmp, int esquerdaIni, int direitaIni, int direitaFim)
	{
		int esquerdaFim = direitaIni - 1;
		int k = esquerdaIni;
		int tamanho = direitaFim - esquerdaIni + 1;

		//Enquanto tem valores na parte da esquerda e na parte da direita
		//Copia da parte da esquerda se o valor da parte da esquerda for menor, se não copia da parte da direita
		while(esquerdaIni <= esquerdaFim && direitaIni <= direitaFim){
			if(array[esquerdaIni].compareTo(array[direitaIni]) <= 0){
				tmp[k++] = array[esquerdaIni++];
			}else{
				tmp[k++] = array[direitaIni++];
			}
		}

		while(esquerdaIni <= esquerdaFim){	// Copia a metade esquerda (caso ainda tenha)
			tmp[k++] = array[esquerdaIni++];
		}

		while(direitaIni <= direitaFim){	// Copia a metade direita (caso ainda tenha)
			tmp[k++] = array[direitaIni++];
		}

		for(int i = 0; i < tamanho; i++, direitaFim--){	// Copia tmp para o array (de trás para frente)
			array[direitaFim] = tmp[direitaFim];
		}
	}

}
