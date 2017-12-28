package aaa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class C /*<T extends Comparable<T>>*/{

	public <T> T[] decrescente(List<? extends Comparable<T>> lista){
		
		return null;
	}
	
	
	private static void hanoi(){

		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		Stack<Integer> c = new Stack<Integer>();
		
		a.push(3);
		a.push(2);
		a.push(1);
		
		while(!a.isEmpty()){
			
			
			
		}
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		//hanoi();
		
		Queue<Integer> fila1 = new LinkedList<>();
		Queue<Integer> fila2 = new LinkedList<>();

		fila1.add(1);
		fila1.add(3);
		fila1.add(5);
		fila1.add(7);
		fila1.add(8);
		
		fila2.add(2);
		fila2.add(4);
		fila2.add(6);
		fila2.add(9);
		fila2.add(10);
		
		
		//====================================================
		Queue<Integer> saida = new LinkedList<>();
		Integer a1, a2;
		
		while(!fila1.isEmpty() || !fila2.isEmpty()){
				
			System.out.println("fila1="+fila1);
			System.out.println("fila2="+fila2);
			
			if(!fila1.isEmpty()){ //Tem elemento na fila1
				a1 = fila1.peek();
				System.out.println("a1="+a1);
				
				if(!fila2.isEmpty()){ //Tem elemento na fila2
					a2 = fila2.peek();
					System.out.println("a2="+a2);
					
					if(a1.compareTo(a2) < 0){
						saida.add(fila1.poll());
					}else{
						saida.add(fila2.poll());
					}
							
				}else{ //Não tem elemento na fila2
					saida.add(fila1.poll());
				}
				
			}else{ //Não tem elemento na fila1
				saida.add(fila2.poll());
			}
			
			System.out.println(saida);
			System.out.println();
		}
		
		System.out.println("Fim:" + saida);
		
	}

}	

