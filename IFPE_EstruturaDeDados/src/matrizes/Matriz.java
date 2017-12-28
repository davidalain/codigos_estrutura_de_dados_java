package matrizes;
import java.util.Scanner;


public class Matriz {
	
	
	public static void main(String[] args){
		
		int[][] m = new int[3][];
		m[0] = new int[]{1,2,3};
		m[1] = new int[]{4,5};
		m[2] = new int[]{6,7,8,9};
		
		for(int lin = 0 ; lin < m.length ; lin++){
			for(int col = 0 ; col < m[lin].length ; col++){
				System.out.print(m[lin][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void amain(String[] args) {
		
		int[][] array;
		int linhas = 3;
		int colunas = 2;

		array = new int[linhas][colunas];
		
		
		
		
		
		
		System.out.println(array);
		
	}
	
	/**
	 * Cria dinamicamente um array de arrays com tamanhos diferentes
	 * 
	 * @param args
	 */
	public static void _main(String[] args) {
		
		int[][] array = new int[5][];
		array[0] = new int[5];
		array[1] = new int[6];
		array[2] = new int[4];
		array[3] = new int[3];
		array[4] = new int[7];
		
	}
	
	
	public static void main2(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] array;
		int linhas;
		int colunas;

		System.out.println("Digite a quantidade de linhas:");
		linhas = scanner.nextInt();
		System.out.println("Digite a quantidade de colunas:");
		colunas = scanner.nextInt();

		array = new int[linhas][colunas];

		int l;
		int c;
		int v;
		while(true){
			System.out.print("Linha: ");
			l = scanner.nextInt();
			System.out.print("Coluna: ");
			c = scanner.nextInt();
			System.out.print("Valor: ");
			v = scanner.nextInt();
			System.out.println();

			if(l < 0 || l >= linhas || c < 0 || c >= colunas || v == -1)
				break;

			array[l][c] = v;

			for(int lin = 0 ; lin < linhas ; lin++){
				for(int col = 0 ; col < colunas ; col++){
					System.out.print(array[lin][col] + " ");
				}
				System.out.println();
			}	

		}

		System.out.println("Fim!");


		scanner.close();

	}

	/**
	 * Criar uma matriz quadrada e preencher com dados inseridos pelo usuário
	 * 
	 * @param args
	 */
	public static void main3(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] array;
		int linhas;
		int colunas;

		System.out.println("Digite a quantidade de linhas:");
		linhas = scanner.nextInt();
		System.out.println("Digite a quantidade de colunas:");
		colunas = scanner.nextInt();

		array = new int[linhas][colunas];

		System.out.println("Escreva a matriz:");
		for(int lin = 0 ; lin < linhas ; lin++){
			for(int col = 0 ; col < colunas ; col++){
				array[lin][col] = scanner.nextInt();
			}
		}


		for(int lin = 0 ; lin < linhas ; lin++){
			for(int col = 0 ; col < colunas ; col++){
				System.out.print(array[lin][col] + " ");
			}
			System.out.println();
		}


		scanner.close();
	}

	
	/**
	 * Criação de matriz de maneira estática.
	 * 
	 * Calcula a soma das linhas e colunas
	 * 
	 * @param args
	 */
	public static void main1(String[] args) {

		int[][] array = 
			{
				{1,	2,	1,	2},
				{1,	3,	1,	3},
				{1,	1,	1,	1}
			};

		int[] somaLinha = new int[array.length];
		int[] somaColuna = new int[array[0].length];

		System.out.println("array.length="+array.length);
		System.out.println("array[0].length="+array[0].length);
		System.out.println();

		//mostrar os valores
		for(int lin = 0 ; lin < array.length ; lin++){
			for(int col = 0 ; col < array[0].length ; col++){
				System.out.print(array[lin][col] + "\t");
			}
			System.out.println();
		}

		//Problema 1: Somar todos os valores
		int somaDeTudo = 0;
		for(int lin = 0 ; lin < array.length ; lin++){
			for(int col = 0 ; col < array[0].length ; col++){
				somaDeTudo += array[lin][col];
			}
		}
		System.out.println("Soma de tudo: "+somaDeTudo);

		//Problema 2: Somar cada linha e cada coluna
		for(int lin = 0 ; lin < array.length ; lin++){
			for(int col = 0 ; col < array[0].length ; col++){
				somaLinha[lin] += array[lin][col];
				somaColuna[col] += array[lin][col];
			}
		}

		for(int i = 0 ; i < somaLinha.length ; i++){
			System.out.println("somaLinha["+i+"]="+somaLinha[i]);
		}
		for(int i = 0 ; i < somaColuna.length ; i++){
			System.out.println("somaColuna["+i+"]="+somaColuna[i]);
		}

		//Problema 3: Usar um único for para iterar e mostrar todos os valores


	}

}
