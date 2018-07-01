package ordenacao;

import java.util.Arrays;

public class QuickSort
{

	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1, -1, 0};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(Comparable[] array)
	{
		sort(array, 0, array.length - 1);
	}

	private static void sort(Comparable[] array, int inicio, int fim)
	{
		if (inicio < fim)
		{
			int posicaoPivo = separar(array, inicio, fim);
			sort(array, inicio, posicaoPivo - 1);
			sort(array, posicaoPivo + 1, fim);
		}
	}

	private static int separar(Comparable[] array, int inicio, int fim)
	{
		Comparable pivo = array[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f)
		{
			if (array[i].compareTo(pivo) <= 0)
				i++;
			else if (pivo.compareTo(array[f]) < 0)
				f--;
			else
			{
				Comparable troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
			}
		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;
	}
}
