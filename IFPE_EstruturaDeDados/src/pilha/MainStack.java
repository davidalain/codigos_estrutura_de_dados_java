package pilha;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {

		Deque<Integer> pilha = new LinkedList<>();
		
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);

		System.out.println("Último elemento: " + pilha.peek());
		System.out.println("Quantidade de elementos: " + pilha.size());
		
		Integer v1 = pilha.pop();
		Integer v2 = pilha.pop();
		Integer v3 = pilha.pop();
		Integer v4 = pilha.pop(); //Não foi adicionado. Exception!!

		System.out.println("Pilha: v1:" + v1 + ", v2:" + v2 + ", v3:" + v3 + ", v4:" + v4);
		
	}

	public static void main2(String[] args) {

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
