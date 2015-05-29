import java.util.Scanner;


public class Matriz {

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
			System.out.println("Digite a linha, coluna e valor:");
			l = scanner.nextInt();
			c = scanner.nextInt();
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

	public static void main(String[] args) {

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
