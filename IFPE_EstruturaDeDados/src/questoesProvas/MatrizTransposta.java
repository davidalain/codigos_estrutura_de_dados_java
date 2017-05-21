package questoesProvas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MatrizTransposta {

	public static int[][] matrizTransposta(int[][] matriz){

		int[][] transposta = new int[matriz[0].length][matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}

		return transposta;

	}

	public static void main2(String[] args) {

		int[][] m = {
				{1, 2},
				{3, 4},
				{5, 6}
		};

		System.out.println("-------------------------------------------");
		for(int[] line : m)
			System.out.println(Arrays.toString(line));

		System.out.println("-------------------------------------------");
		int[][] t = matrizTransposta(m);
		for(int[] line : t)
			System.out.println(Arrays.toString(line));

		System.out.println("-------------------------------------------");
		for(int i = 0 ; i < m.length ; i++){
			System.out.print("[");
			for(int j = 0 ; j < m[0].length ; j++){
				System.out.print(m[i][j]);
				if(j < m[0].length - 1){
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}

	}
	
	
	public static void main(String[] args) {
		
		List<String> lista = new LinkedList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		int tam = lista.size();
		for(int i = 0 ; i < tam ; i++){
			int indice = new Random().nextInt(lista.size());
			System.out.println(lista.remove(indice));
		}
		
		
	}
	
	

}
