package matrizes;

import java.io.IOException;
import java.util.Arrays;

public class Matrizes {

	public static void clearScreen() throws InterruptedException, IOException {  
//		System.out.print("\033[H\033[2J");  
//		System.out.flush();
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	} 
	
	public static void main(String[] args) throws InterruptedException, IOException {

		int linhas = 1;
		int colunas = 2;
		int[][] m = new int[linhas][colunas];
		m[0][0] = 3;
		m[0][1] = 6;

		for(int[] l : m)
			System.out.println(Arrays.toString(l));
		
		clearScreen();

		//===========================================================
		double[][] array = { {1,2,3}, {4,5,6}, {7,8,9} };

		double soma = 0;
		for(int i = 0 ; i < array.length * array[0].length ; i++){
			int linha = i / array[0].length;
			int coluna = i % array[0].length;

			soma += array[linha][coluna];
		}
		System.out.println("Média " + soma/(double)(array.length * array[0].length));

	}

}
