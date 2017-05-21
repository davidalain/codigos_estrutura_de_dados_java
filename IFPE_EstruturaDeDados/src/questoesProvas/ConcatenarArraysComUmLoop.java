package questoesProvas;

import java.util.Arrays;

public class ConcatenarArraysComUmLoop {

	public static int[] concatenaUmLoop(int[] a, int[] b){
		
		int[] c = new int[a.length + b.length];
		for(int i = 0 ; i < (a.length + b.length) ; i++){
			if(i < a.length){
				c[i] = a[i];
			}else{
				c[i] = b[i - a.length];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[] a = {1, 2};
		int[] b = {3, 4, 5};
		System.out.println(Arrays.toString(concatenaUmLoop(a, b)));
	}

}
