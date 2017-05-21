package array;

import atividade1.Casa;

public class Main2 {
	
	public static boolean verificaSequenciaFibonacci(int[] array){
		
		if(array[0] != 0)
			return false;
		if(array[1] != 1)
			return false;
		
		for(int i = 2 ; i < array.length ; i++){
			if(array[i] != (array[i-1] + array[i-2])){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
//		int[] array = {3, 41, 28, 79, 7};
//		System.out.println(Arrays.toString(array));
		
		int[] array = {0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584};
		System.out.println(verificaSequenciaFibonacci(array));
		
	}

	/*
	public static void main2(String[] args) {
		
		int[] listaNumeros = new int[5];
		listaNumeros[0] = 10;
		listaNumeros[1] = 2;
		listaNumeros[2] = 5;
		listaNumeros[3] = 4;
		listaNumeros[4] = 1;
		
		int[] listaNumerosInvertidos;
		listaNumerosInvertidos = inverter(listaNumeros);
		
		for(int i = 0 ; i < listaNumeros.length ; i++){
			System.out.println("listaNumerosInvertidos["+i+"] = "+listaNumerosInvertidos[i]);
		}
		
//		listaNumerosInvertidos[0] = 1;
//		listaNumerosInvertidos[1] = 4;
//		listaNumerosInvertidos[2] = 5;
//		listaNumerosInvertidos[3] = 2;
//		listaNumerosInvertidos[4] = 10;
		
		
		Casa[] listaCasas = new Casa[5];
		listaCasas[0] = new Casa(1);
		listaCasas[1] = new Casa(1);
		listaCasas[2] = new Casa(5);
		listaCasas[3] = new Casa(4);
		listaCasas[4] = new Casa(1);
		
		Casa c = new Casa(1);
		
		System.out.println("Ocorrencia de casas com mesmo número: "+ocorrencia(listaCasas, c));
		
	}
	*/
	
	static int getMaior(int[] lista){
		return 0;//
	}
	
	static int[] inverter(int[] lista){
		int[] listaInvertidos = new int[lista.length];
		
		for(int i = 0, v = lista.length - 1 ; i < lista.length ; i++, v--){
			listaInvertidos[v] = lista[i];
		}
		
		return listaInvertidos;
	}
	
//	static int ocorrencia(Casa[] lista, Casa c){
//		
//		int quantidade = 0;
//		for(int i = 0 ; i < lista.length ; i++){
//			if(lista[i].equals(c)){
//				quantidade++;
//			}
//		}
//		return quantidade;
//		
//	}
	
}
