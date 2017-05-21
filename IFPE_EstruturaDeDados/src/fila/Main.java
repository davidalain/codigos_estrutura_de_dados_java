package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

public static void main(String[] args){
		
		Queue<Integer> fila = new LinkedList<Integer>();
		fila.offer(2);
		fila.offer(3);
		fila.offer(4);
		
		Integer v1 = fila.poll();
		Integer v2 = fila.poll();
		Integer v3 = fila.poll();
		Integer v4 = fila.poll();
		
		System.out.println("Fila: v1:" + v1 + ", v2:" + v2 + ", v3:" + v3 + ", v4:" + v4);
		
	}
	
}
