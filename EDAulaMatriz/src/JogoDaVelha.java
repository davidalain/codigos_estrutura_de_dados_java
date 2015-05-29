import java.util.Scanner;


public class JogoDaVelha {

	private static final char VAZIO = 0;
	private static final char BOLA = 'o';
	private static final char XIS = 'x';
	private static final char VELHA = 'v';

	/**
	 * Mostra no console a matriz
	 * 
	 * @param matriz
	 */
	private static void mostrarMatriz(char[][] matriz){

		for(int lin = 0 ; lin < matriz.length ; lin++){
			System.out.print("[");
			for(int col = 0 ; col < matriz[0].length ; col++){
				System.out.print(matriz[lin][col] + " ");
			}
			System.out.println("]");
		}
	}
	
	/**
	 * Checa se houve um ganhador
	 * 
	 * @param matriz
	 * 
	 * @return	XIS, se o ganhador for XIS
	 * @return	BOLA, se o ganhador for BOLA
	 * @return	VELHA, se foi empate
	 * @return	VAZIO, se ninguém ganhou mas o jogo não terminou
	 */
	private static char checaGanhador(char[][] matriz){
		
		int contadorVazio = 0;
		char[] somaLinha = new char[3];
		char[] somaColuna = new char[3];
		char[] somaDiagonal = new char[2];
		
		for(int lin = 0 ; lin < matriz.length ; lin++){
			for(int col = 0 ; col < matriz[0].length ; col++){
				somaLinha[lin] += matriz[lin][col];
				somaColuna[col] += matriz[lin][col];
				
				if(lin == col)
					somaDiagonal[0] += matriz[lin][col];
				
				if(lin == 2 - col)
					somaDiagonal[1] += matriz[lin][col];
				
				if(matriz[lin][col] == VAZIO)
					contadorVazio++;
			}
		}
		
		for(int i = 0 ; i < 3 ; i++){
			if(somaLinha[i] == (3*XIS)) return XIS;
			if(somaLinha[i] == (3*BOLA)) return BOLA;
			
			if(somaColuna[i] == (3*XIS)) return XIS;
			if(somaColuna[i] == (3*BOLA)) return BOLA;
		}
		
		for(int i = 0 ; i < 2 ; i++){
			if(somaDiagonal[i] == (3*XIS)) return XIS;
			if(somaDiagonal[i] == (3*BOLA)) return BOLA;
		}
		
		if(contadorVazio == 0)
			return VELHA;
		
		return VAZIO;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] matriz = new char[3][3];
		char ganhador = VAZIO;
		char jogador = XIS;
		int linha, coluna;

		while(true){ //Executa para sempre, até que encontre um break

			mostrarMatriz(matriz);

			System.out.println("Vez do " + jogador + ", digite: linha coluna");

			linha = sc.nextInt(); //Lê a linha
			coluna = sc.nextInt(); //Lê a coluna

			if(linha < 0 || linha > matriz.length - 1){	//Checa se a linha é valida
				System.err.println("Erro de jogada inválida: linha inválida");
				continue;
			}
			if(coluna < 0 || coluna > matriz[0].length - 1){ //Checa se a coluna é valida
				System.err.println("Erro de jogada inválida: coluna inválida");
				continue;
			}
			if(matriz[linha][coluna] != VAZIO){ //Checa se a posição foi preenchida
				System.err.println("Erro de jogada inválida: posição preenchida");
				continue;
			}

			matriz[linha][coluna] = jogador; //Preenche o valor na matriz
			
			ganhador = checaGanhador(matriz); //Checa se houve ganhador
			if(ganhador != VAZIO)
				break; //Sai do while, se houve um ganhador ou houve um empate
			
			jogador = ((jogador == XIS) ? BOLA : XIS); //Muda o jogador atual
		}
		
		mostrarMatriz(matriz); //Mostra a matriz no fim do jogo
		
		if(ganhador == VELHA)
			System.out.println("Empate!");
		else
			System.out.println("Ganhador é " + jogador);
			
		
		sc.close();
	}

}
