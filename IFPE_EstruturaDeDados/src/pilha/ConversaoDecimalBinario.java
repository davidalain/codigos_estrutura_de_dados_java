package pilha;

import java.util.Stack;

public class ConversaoDecimalBinario {

	public static void main(String[] args) {
		
		System.out.println(converteParaBinario(15));
	}
	
	public static String converteParaBinario(int n){
		
		String str = "";
		Stack<Integer> pilha = new Stack<Integer>();
		
		while(true){
			pilha.push(n % 2);
			if(n / 2 == 0)
				break;
			n /= 2;
		}
		
		while(!pilha.empty()){
			str += pilha.pop();
		}
		
		return str;
	}
	
}
