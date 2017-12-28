package matrizes;

public class Aula7 {
	
	public static void main(String[] args) {
		
		int[][] m = {
				{0,1,0,1},
				{1,0,1,0},
		};
		
		System.out.println(questao11(m));
	}
	
	public static int questao11(int[][] m){
		
		int contador = 0;
		
		for(int i = 0 ; i < m.length - 1; i++){
			for(int j = 0 ; j < m[0].length - 1; j++){
				
				if(		m[i][j] == 0 	&& m[i][j+1] == 1 &&
						m[i+1][j] == 1	&& m[i+1][j+1] == 0)
				{
					contador++;
				}
			}
		}
		
		return contador;
		
	}

}
