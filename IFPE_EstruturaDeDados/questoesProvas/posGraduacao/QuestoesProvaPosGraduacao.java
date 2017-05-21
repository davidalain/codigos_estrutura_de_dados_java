package posGraduacao;

import java.util.Arrays;

public class QuestoesProvaPosGraduacao {

	public static int somaNumeros(int n, int k){

		int soma = 0;
		for(int i = n ; i <= k ; i++){
			soma = soma + i;
		}
		return soma;

	}

	public static void main2(String[] args) {

		int n = 15;
		int k = 10;

		System.out.println(somaNumeros(n, k));

	}

	public static void main3(String[] args) {

		//Concatena usando um único for

		int[] a = {1, 2};
		int[] b = {3, 4, 5};

		int[] c = new int[a.length + b.length];
		for(int i = 0 ; i < (a.length + b.length) ; i++){

			if(i < a.length){
				c[i] = a[i];
			}else{
				c[i] = b[i - a.length];
			}
		}

		System.out.println(Arrays.toString(c));

	}

	public static void main4(String[] args) {
		try{
			int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			int[] b = new int[a.length];
			int[] c = new int[a[0].length];

			for(int i = 0 ; i < a.length*a[0].length ; i++){
				try{
					b[i % a.length] += a[i % a.length][i / a.length];
				}catch(Exception e1){
					System.out.println("Erro 1");
					return;
				}

				try{
					c[i / a.length] += a[i % a.length][i / a.length];	
				}catch(Exception e2){
					System.out.println("Erro 2");
					return;
				}
			}

			System.out.println(Arrays.toString(b) + ", " + Arrays.toString(c));
		}catch(Exception e){
			System.out.println("Erro no código");
		}
	}

	public static int[] func(int[] v, int n){
		if(n < 0)
			return v;
		v[n]+=1;
		return func(v, n-1);
	}

	public static void main5(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(func(a, a.length-1)));
	}


	public static void main(String[] args) {

		String[][] m = {
				{"00","01","02"},
				{"10","11","12"},
				{"20","21","22"}
		};

		for(String[] linha : m){
			System.out.println(Arrays.toString(linha));
		}


	}

}
