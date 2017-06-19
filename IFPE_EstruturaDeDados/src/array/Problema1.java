package array;

public class Problema1 {

	
	static int[] concatenar(int[] array1, int[] array2){
		
		int[] resultado = new int[array1.length + array2.length];
		
		for(int i = 0 ; i < array1.length ; i++){
			resultado[i] = array1[i];
		}
		
		for(int i = 0 ; i < array2.length ; i++){
			resultado[array1.length + i] = array2[i];
		}
		
		return resultado;
	}
	
	
	public static void mostrarTabela(int[][] tabela){
		
		System.out.print("\t");
		
		for(int c = 0 ; c < tabela[0].length ; c++){
			System.out.print("C" + c + "\t");	
		}
		System.out.println();
		
		for(int l = 0 ; l < tabela.length ; l++){
			
			System.out.print("L" + l + "\t");
			
			for(int c = 0 ; c < tabela[0].length ; c++){
				System.out.print(""+tabela[l][c]+"\t");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
	
	
}
