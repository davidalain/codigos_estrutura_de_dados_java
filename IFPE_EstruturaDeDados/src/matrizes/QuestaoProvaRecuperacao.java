package matrizes;

public class QuestaoProvaRecuperacao {

	public static int[] posicaoCauda(int[][] tab, int i, int j){

		int ui = i, uj = j;
		
		while(true){
			if((j > 0) && (tab[i][j - 1] == 1) && (j - 1 != uj)){ //esquerda
				uj = j;
				j = j - 1;
			}else if((j < tab[i].length - 1) && (tab[i][j + 1] == 1) && (j + 1 != uj)){ //direita
				uj = j;
				j = j + 1; 
			}else if((i > 0) && (tab[i - 1][j] == 1) && (i - 1 != ui)){ //cima
				ui = i;
				i = i - 1; 
			}else if((i < tab.length) && (tab[i + 1][j] == 1) && (i + 1 != ui)){ //baixo
				ui = i;
				i = i + 1; 
			}else{
				break;
			}
		}
		
		return new int[]{i,j};
	}

}
