package matrizes;

import java.util.Scanner;

public class JogoDaVelha16032017 {
	
	public static void imprime(char[][] m){
		
		for(int i = 0 ; i < m.length ; i++){
			for(int j = 0 ; j < m[i].length ; j++){
				if(m[i][j] == 0){
					System.out.print("  ");
				}else{
					System.out.print(m[i][j]+" ");					
				}
			}
			System.out.println();
		}
		
	}
	
	public static char checaGanhou(char[][] m){
		
		char empate = 'e';
		char continuaJogo = ' ';
		
		//testa as linhas
		for(int linha = 0 ; linha < 3 ; linha++){
			if((m[linha][0] == m[linha][1]) && (m[linha][1] == m[linha][2]) && (m[linha][2] != ' ')){
				return m[linha][0];
			}	
		}
		
		//testa as colunas
		for(int coluna = 0 ; coluna < 3 ; coluna++){
			if((m[0][coluna] == m[1][coluna]) && (m[1][coluna] == m[2][coluna]) && (m[0][coluna] != ' ')){
				return m[0][coluna];
			}
		}
		
		if((m[0][0] == m[1][1]) && (m[1][1] == m[2][2]) && (m[0][0] != ' ')){
			return m[0][0];
		}
		
		if((m[0][2] == m[1][1]) && (m[1][1] == m[2][0]) && (m[0][2] != ' ')){
			return m[0][2];
		}
		
		boolean temEspaco = false;
		for(int linha = 0 ; linha < 3 && !temEspaco ; linha++){
			for(int coluna = 0 ; coluna < 3 ; coluna++){
				if(m[linha][coluna] == ' '){
					temEspaco = true;
					break;
				}
			}
		}
		
		if(temEspaco)
			return continuaJogo;
		else
			return empate;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[][] m = new char[3][3];
		
		char X = 'x';
		char O = 'o';
		
		char vez = X;
		int linha;
		int coluna;
		while(true){
			
			System.out.println("Vez do jogador " + vez);
			
			System.out.print("Linha: ");
			linha = sc.nextInt();
			System.out.print("Coluna: ");
			coluna = sc.nextInt();
			
			if(linha > 3 || linha < 0){
				System.out.println("Linha inválida. Tente novamente!");
				System.out.println();
				continue;
			}
			
			if(coluna > 3 || coluna < 0){
				System.out.println("Coluna inválida. Tente novamente!");
				System.out.println();
				continue;
			}
			
			if(m[linha][coluna] != 0){
				System.out.println("Posição já preenchida. Tente novamente!");
				System.out.println();
				continue;
			}
			
			m[linha][coluna] = vez;
			imprime(m);
			
			char vencedor = checaGanhou(m);
			if(vencedor == X || vencedor == O){
				System.out.println("O vencedor é " + vencedor);
				break;
			}
			
			if(vez == X){
				vez = O;
			}else{
				vez = X;
			}
			
			
		}
		
	}
	
}
