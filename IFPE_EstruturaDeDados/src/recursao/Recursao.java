package recursao;

public class Recursao {

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
		
		System.out.println(multiplicacao(2, 0));
		System.out.println(multiplicacao(2, 1));
		System.out.println(multiplicacao(2, 5));
		
		System.out.println();
		System.out.println(multiplicacao(0, 2));
		System.out.println(multiplicacao(1, 2));
		System.out.println(multiplicacao(5, 2));
		
	}
	
}
