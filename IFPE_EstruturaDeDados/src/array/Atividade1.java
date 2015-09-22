package array;

public class Atividade1 {
	
	public static int somaNumeros(int n, int k){
		
		int soma = 0;
		for(int i = n ; i <= k ; i++){
			soma = soma + i;
		}
		return soma;
		
	}
	
	public static void main(String[] args) {
		
		int n = 15;
		int k = 10;
		
		System.out.println(somaNumeros(n, k));
		
	}
	

}
