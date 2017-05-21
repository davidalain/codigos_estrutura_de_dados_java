package questoesProvas;

import java.security.InvalidParameterException;

public class MediaPonderada {

	public static double mediaPonderada(double[] valores, double[] pesos){
		
		if(valores.length != pesos.length)
			throw new InvalidParameterException("Arrays com tamanhos diferentes");
		
		double somaPonderada = 0;
		double somaPesos = 0;
		for(int i = 0 ; i < valores.length ; i++){
			somaPonderada += (valores[i] * pesos[i]);
			somaPesos += pesos[i];
		}
		return somaPonderada/somaPesos;
	}
	
	public static void main(String[] args) {
		double[] valores = {3,9,10};
		double[] pesos = {4,4,2};
		System.out.println(mediaPonderada(valores, pesos));
	}
	
}
