package array;

public class ProblemasBonusFibonacci {

	public static boolean verificaSequenciaFibonacci(int[] array){
		
		if(array[0] != 0)
			return false;
		if(array[1] != 1)
			return false;
		
		for(int i = 2 ; i < array.length ; i++){
			if(array[i] != (array[i-1] + array[i-2])){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584};
//		int[] array = {0, 1, 1, 2};
		System.out.println(verificaSequenciaFibonacci(array));
		
	}
	
}
