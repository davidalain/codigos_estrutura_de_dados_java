package aaa;

import java.util.Arrays;

public class Aula2_17082017 {

	public static void main(String[] args) {
		
		int[] a1 = {0,1,3,7};
		int[] a2 = {9,10,5};
		
		/* Isto aqui é igual a ... 
		int[] novo = q2_arrayInvertido(a1);
		String str = Arrays.toString(novo);
		System.out.println(str);
		*/
		System.out.println(Arrays.toString(q2_arrayInvertido(a1))); //... isto aqui!
		
		System.out.println(Arrays.toString(q2_arrayInvertido(a2)));
		
		System.out.println(Arrays.toString(q3_concatenaComArrayInvertido(a1,a2)));
		
		final String texto = "ifpeeifpeaaaifpeiifpe";
		System.out.println(questaoBonus(texto));
		System.out.println(questaoBonusJeito2(texto));
	}
	
	public static int[] q2_arrayInvertido(int[] a){
		
		int[] novo = new int[a.length];
		
		for(int i = 0 ; i < a.length ; i++){
			novo[i] = a[a.length - 1 - i]; //jeito 1
//			novo[novo.length - 1 - i] = a[i]; //jeito 2
		}
		
//		assim funciona também, jeito 3
//		for(int i = a.length - 1 ; i >= 0 ; i--){
//			novo[novo.length - 1 - i] = a[i];
//		}
		
		return novo;
	}
	
	
	public static int[] q3_concatenaComArrayInvertido(int[] a1, int[] a2){
		
		int[] novo = new int[a1.length + a2.length];
		
		for(int i = 0 ; i < a1.length ; i++){
			novo[i] = a1[i];
		}
		for(int i = 0 ; i < a2.length ; i++){
			novo[a1.length + i] = a2[a2.length - 1 - i];
		}
		
		return novo;
	}
	
	public static int questaoBonus(String str){
		
		final int ifpeLength = "ifpe".length();
		int contador = 0;
		int indice = -ifpeLength;
		
		while((indice = str.indexOf("ifpe", indice + ifpeLength)) != -1){
			contador++;
		}
		
		return contador;
	}
	
	public static int questaoBonusJeito2(String str){
		
		int contadorIfpe = 0;
		char[] ifpe = "ifpe".toCharArray();
		char[] texto = str.toCharArray();
		
		for(int i = 0 ; i < texto.length - ifpe.length+1 ; i++){
			
			int contadorCaractereCerto = 0;
			for(int k = 0 ; k < ifpe.length ; k++){
				if(texto[i + k] == ifpe[k]){
					contadorCaractereCerto++;
				}
			}
			if(contadorCaractereCerto == ifpe.length){
				contadorIfpe++;
			}
		}
		
		return contadorIfpe;
	}
	
}
