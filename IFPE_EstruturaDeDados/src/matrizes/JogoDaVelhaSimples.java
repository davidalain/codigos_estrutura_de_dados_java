package matrizes;
import java.util.Scanner;


public class JogoDaVelhaSimples {

	public static void imprimeMatriz(char[][] m){
		for(int i = 0 ; i < m.length ; i++){
			for(int j = 0 ; j < m[0].length ; j++){
				System.out.print(m[i][j]);
				if(j <  m[0].length - 1)
					System.out.print(" | ");
			}
			System.out.println("\r\n__________");
		}
		System.out.println();
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[][] m = new char[3][3];
		boolean naoAcabou = true;
		int jogadas = 0;

		char vez = 'O';
		int linha;
		int coluna;
		
		while(naoAcabou){

			System.out.println("Vez do jogador " + vez);
			System.out.print("Linha: ");
			linha = sc.nextInt();
			System.out.print("Coluna: ");
			coluna = sc.nextInt();

			if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2){
				System.out.println("Jogada inválida, fora da matriz");
				continue;
			}

			if(m[linha][coluna] == 'X' || m[linha][coluna] == 'O'){
				System.out.println("Jogada inválida, posição já foi jogada");
				continue;
			}

			m[linha][coluna] = vez;
			jogadas++;

			//checar linha
			for(int lin = 0 ; lin < m.length ; lin++){
				if(m[lin][0] == m[lin][1] && m[lin][1] == m[lin][2]){
					if(m[lin][0] == 'X' || m[lin][0] == 'O'){
						System.out.println(vez + " ganhou");
						naoAcabou = false;
					}
				}
			}

			//checar coluna
			for(int col = 0 ; col < m[0].length ; col++){
				if(m[0][col] == m[1][col] && m[1][col] == m[2][col]){
					if(m[0][col] == 'X' || m[0][col] == 'O'){
						System.out.println(vez + " ganhou");
						naoAcabou = false;
					}
				}
			}

			//checa diagonal principal
			if(m[0][0] == m[1][1] && m[1][1] == m[2][2]){
				if(m[0][0] == 'X' || m[0][0] == 'O'){
					System.out.println(vez + " ganhou");
					naoAcabou = false;
				}
			}

			//checa diagonal secundária
			if(m[2][0] == m[1][1] && m[1][1] == m[0][2]){
				if(m[2][0] == 'X' || m[2][0] == 'O'){
					System.out.println(vez + " ganhou");
					naoAcabou = false;
				}
			}


			//checa empate
			if((jogadas == 9) && (naoAcabou == true)){
				System.out.println("Empate");
				naoAcabou = false;
			}

			imprimeMatriz(m);

			if(vez == 'O'){
				vez = 'X';
			}else{
				vez = 'O';
			}

		}


	}



}
