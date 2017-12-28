package aaa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class D {

	public Queue<Integer>[] q1(Stack<Integer> a){
		Queue<Integer>[] b = new Queue[2];
		b[0] = new LinkedList<>();
		b[1] = new LinkedList<>();
		
		for(int i = 0 ; i < a.size() ; i++){
			if(a.get(i)%2 == 0){
				b[0].add(a.get(i));
			}else{
				b[1].add(a.get(i));
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		
	}
	
}
