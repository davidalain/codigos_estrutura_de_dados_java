package recursao;


public class Recursao {


	public static int soma(int ini, int fim){
		if(ini < fim)
			return ini + soma(ini+1, fim);
		
		return ini;
	}

	public static int somaValores(int[] valores, int indiceIni, int indiceFim){

		if(indiceIni < indiceFim)
			return valores[indiceIni] + valores[indiceFim] + somaValores(valores, indiceIni+1, indiceFim-1);

		if(indiceIni == indiceFim)
			return valores[indiceIni];

		return 0;
	}

	public static int soma2(int[] valores){
		return somaValores(valores, 0, valores.length - 1);
	}

	public static int somaValores(int[] valores, int indice){

		if(indice < 0)
			return 0;
		return valores[indice] + somaValores(valores, indice - 1);
	}

	public static int soma(int[] valores){
		return somaValores(valores, valores.length - 1);
	}


	public static int potencia2(int a, int b){

		if(b <= 1){
			return a;
		}else{
			return multiplicacao(a, potencia2(a, b - 1));
		}
	}

	public static int multiplicacao(int a, int b){

		if(b < 1){
			return 0;
		}else{
			return a + multiplicacao(a, b - 1);
		}

	}

	public static int potencia(int a, int b){

		if(b <= 1){
			return a;
		}else{
			return a * potencia(a, b - 1);
		}

	}

	public static int fatorial(int n){

		if(n <= 1){
			return 1;
		}else{
			return n * fatorial(n - 1);
		}

	}

	public static void main(String[] args) {

		//		System.out.println(multiplicacao(2, 0));
		//		System.out.println(multiplicacao(2, 1));
		//		System.out.println(multiplicacao(2, 5));
		//		System.out.println();
		//		
		//		System.out.println(multiplicacao(0, 2));
		//		System.out.println(multiplicacao(1, 2));
		//		System.out.println(multiplicacao(5, 2));
		//		System.out.println();

		int[] valores = {1,2,3,4,5};
		System.out.println(soma(valores));
		System.out.println(soma2(valores));
		
		System.out.println(soma(1,4));

	}

}
