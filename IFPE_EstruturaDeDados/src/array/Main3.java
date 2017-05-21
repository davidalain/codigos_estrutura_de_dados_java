package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void questao1(int[] array){
		System.out.println(Arrays.toString(array));
	}

	public static void questao2(int[] array){

		String str = "";
		for(int i = array.length - 1 ; i >= 0 ; i-- ){
			str += array[i];
			if(i > 0){
				str += ", ";
			}
		}
		System.out.println("["+str+"]");
	}

	public static void questao5(int[] array){

		String str = "";
		for(int i = 0 ; i < array.length ; i++){
			str += array[array.length - 1 - i];
			if(i < array.length - 1){
				str += ", ";
			}
		}
		System.out.println("[" + str + "]");
	}

	public static void questao3(int[] array){

		String str = "";
		for(int i = 0 ; i < array.length ; i++){

			if(i % 2 == 0){
				str += array[i];

				if(i < array.length - 2){
					str += ", ";
				}
			}
		}
		System.out.println("[" + str + "]");
	}


	public static void main(String[] args) {

		int[] array = {1,2,3,4};
		int[] array2 = {1,2,3,4,5};
		int[] array3 = {1,2,3,4,5,6};
		int[] array4 = {1,2,3,4,5,6,7};

		//		System.out.println("Questão 1:");
		//		questao1(array);
		//		questao1(array2);
		//		
		//		System.out.println("Questão 2:");
		//		questao2(array);

		//		System.out.println("Questão 5:");
		//		questao3(array);
		//		questao3(array2);
		//		questao3(array3);
		//		questao3(array4);

		System.out.println("Exemplo: Capturando 10 caracteres. Um por vez. Digite os caracteres e depois pressione ENTER");
		Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i < 10 ; i++){
			char c = sc.next().charAt(0); //Lê uma string digitada pelo usuário e pega o primeiro caractere dela.
			
			System.out.println("O carectere de número "+i+" foi '"+c+"'");
		}

		System.out.println("fim");
		sc.close();

	}

}

