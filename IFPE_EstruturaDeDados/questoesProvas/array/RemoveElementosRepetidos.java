package array;

import java.util.Arrays;

public class RemoveElementosRepetidos {

	/**
	 * 	Procura pelo valor atual a[i] dentro de valoresDistintos
	 * 
	 * @param a		Array de valores
	 * @param v		Valor a ser procurado
	 * @return		�ndice onde da primeira ocorr�ncia do valor 'v' ou -1 case ele n�o tenha sido encontrado.
	 */
	private static int getIndex(int[] a, int v) {

		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] == v)
				return i;
		}

		return -1;
	}

	public static int[] removeRepetidos(int[] a) {

		int[] valoresDistintos = new int[a.length];
		int[] quantidades = new int[a.length];
		int indiceVazio = 0;

		for(int i = 0 ; i < a.length ; i++) {

			//Procura pelo valor atual a[i] dentro de valoresDistintos
			int index = getIndex(valoresDistintos,a[i]);
			if(index < 0){ 	//n�o tem dentro de valoresDistintos
				valoresDistintos[indiceVazio] = a[i];
				quantidades[indiceVazio] = 1;
				indiceVazio++;
			}else { 	// tem dentro de valoresDistintos
				quantidades[index]++;

				//Para que n�o se confunda o valor zero do array de entrada com o valor padr�o de quando o array � alocado,
				//o valor zero deve ser tratado de maneira diferenciada j� que o array valoresDistintos e quantidades s�o inicializados com zeros.
				if(valoresDistintos[index] == 0 && quantidades[index] == 1) {
					indiceVazio++;
				}
			}

		}

		int[] saida = new int[indiceVazio];
		for(int i = 0 ; i < indiceVazio ; i++) {
			saida[i] = valoresDistintos[i];
		}

		return saida;
	}

	public static int[] removeRepetidos2(int[] a) {

		int[] valoresDistintos = new int[a.length];
		int[] quantidades = new int[a.length];
		int indiceVazio = 0;

		for(int i = 0 ; i < a.length ; i++) {

			//Procura pelo valor atual a[i] dentro de valoresDistintos
			int index = -1;
			for(int j = 0 ; j < valoresDistintos.length ; j++) {
				if(valoresDistintos[j] == a[i]) {
					index = j;
					break;
				}
			}

			if(index < 0){	//n�o tem dentro de valoresDistintos
				valoresDistintos[indiceVazio] = a[i];
				quantidades[indiceVazio] = 1;
				indiceVazio++;
			} else { //tem dentro de valoresDistintos
				quantidades[index]++;

				//Para que n�o se confunda o valor zero do array de entrada com o valor padr�o de quando o array � alocado,
				//o valor zero deve ser tratado de maneira diferenciada j� que o array de valores e quantidades s�o inicializados com zero.
				if(valoresDistintos[index] == 0 && quantidades[index] == 1) {
					indiceVazio++;
				}
			}
		}

		int[] saida = new int[indiceVazio];
		for(int i = 0 ; i < indiceVazio ; i++) {
			saida[i] = valoresDistintos[i];
		}

		return saida;
	}

	public static int[] removeRepetidos3(int[] a) {

		int[] valoresDistintos = new int[a.length];
		int indiceVazio = 0;

		for(int i = 0 ; i < a.length ; i++) {

			int index = i; //inicia com um �ndice v�lido
			for(int j = i+1 ; j < a.length ; j++) {

				//se tem elemento repetido s� pega a �ltima ocorr�ncia dele
				if(a[i]==a[j]) {
					index = -1; //invalida o �ndice caso tenha um repetido a partir daquele �ndice, pra usar apenas a �ltima ocorr�ncia.
					break;
				}
			}

			//Se index � um �ndice v�lido, ent�o o valor de a[i] deve ser copiado
			if(index >= 0)
				valoresDistintos[indiceVazio++] = a[i];
		}

		int[] saida = new int[indiceVazio];
		for(int i = 0 ; i < indiceVazio ; i++) {
			saida[i] = valoresDistintos[i];
		}

		return saida;
	}

	public static void main(String[] args) {

		int[] a = new int[] {2,0,0,0,0,2,3,4,3,0,5};

		System.out.println(Arrays.toString(removeRepetidos(a)));
		System.out.println(Arrays.toString(removeRepetidos2(a)));
		System.out.println(Arrays.toString(removeRepetidos3(a)));
	}

}
