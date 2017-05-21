package questoesProvas;

import java.util.Arrays;

public class FiltroArraySomenteNumeros {

	public static char[] filtro(char[] array){

		int contador = 0;
		char[] saida;

		for(int i = 0 ; i < array.length ; i++){
			if(array[i] >= '0' && array[i] <= '9'){
				contador++;
			}
		}

		saida = new char[contador];
		contador = 0;

		for(int i = 0 ; i < array.length ; i++){
			if(array[i] >= '0' && array[i] <= '9'){
				saida[contador++] = array[i];
			}
		}

		return saida;
	}

	public static void main(String[] args) {
		char[] array = {'a','2','8','_','0'};
		System.out.println(Arrays.toString(filtro(array)));
	}

}
