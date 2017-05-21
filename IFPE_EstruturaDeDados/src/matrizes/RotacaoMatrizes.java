package matrizes;

import java.util.Arrays;

public class RotacaoMatrizes {

	public static int[][] rotacaoMatrizDireita90(int[][] m){
		int[][] mOut = new int[m[0].length][m.length];
		
		for(int  i = 0 ; i < m.length ; i++){
			for(int j = 0 ; j < m[0].length ; j++){
//				mOut[m[0].length - j - 1][i] = m[i][j];
				mOut[j][m.length - 1 - i] = m[i][j];
			}
		}
		
		return mOut;
	}
	
	public static int[][] rotacaoMatrizEsquerda90(int[][] m){
		int[][] mOut = new int[m[0].length][m.length];
		
		for(int  i = 0 ; i < m.length ; i++){
			for(int j = 0 ; j < m[0].length ; j++){
				mOut[m[0].length - j - 1][i] = m[i][j];
			}
		}
		
		return mOut;
	}
	
	public static int[][] rotacaoMatriz180(int[][] m){
		int[][] mOut = new int[m.length][m[0].length];
		
		for(int  i = 0 ; i < m.length ; i++){
			for(int j = 0 ; j < m[0].length ; j++){
				mOut[m.length - i - 1][m[0].length -  j - 1] = m[i][j];
			}
		}
		
		return mOut;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] m = {{1,2},{3,4},{5,6}};
		int[][] m2 = rotacaoMatrizEsquerda90(m);
		
		for(int[] l : m){
			System.out.println(Arrays.toString(l));
		}
		System.out.println("------");
		for(int[] l : m2){
			System.out.println(Arrays.toString(l));
		}
		
	}
	
}
