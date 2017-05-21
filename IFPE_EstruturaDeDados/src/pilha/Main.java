package pilha;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<Integer>();
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		
		Integer v1 = pilha.pop();
		Integer v2 = pilha.pop();
		Integer v3 = pilha.pop();
		Integer v4 = pilha.pop(); //Não foi adicionado. Exception!!
		
		System.out.println("Pilha: v1:" + v1 + ", v2:" + v2 + ", v3:" + v3 + ", v4:" + v4);
		
	}
	
}
