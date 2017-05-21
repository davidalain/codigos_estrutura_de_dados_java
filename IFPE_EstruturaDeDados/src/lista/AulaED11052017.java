package lista;

import java.util.ArrayList;
import java.util.List;

public class AulaED11052017 {

	public static void main(String[] args) {

		/**
		 * 	1. Implemente um método que cheque se um número é primo.
		 *
		 *	2. Usando (1), implemente um método que retorna o i-ésimo primo dado o valor de i.
		 *	Ex.:	{i=0,out=2},{i=1,out=3},{i=2,out=5},etc
		 *
		 *	3. Usando (2), implemente um método que fatore um número em seus fatores primos.
		 *	Ex.: fatorar(20) => "2^2.5^1"
		 */


		//		for(int i = 2 ; i < 20 ; i++){
		//			boolean ePrimo = ePrimo(i);
		//			if(!ePrimo){
		//				System.out.println(i+" NÃO é primo");	
		//			}else{
		//				System.err.println(i+" é primo");
		//			}
		//		}

		//		System.out.println("2 " + ePrimo(2));
		//		System.out.println("3 " + ePrimo(3));
		//		System.out.println("4 " + ePrimo(4));
		//		System.out.println("5 " + ePrimo(5));
		//		System.out.println("6 " + ePrimo(6));

		//		for(int i = 0 ; i < 20 ; i++){
		//			System.out.println(i+": " + nesimoPrimo(i));	
		//		}

		//		System.out.println("0: " + nesimoPrimo(0));
		//		System.out.println("------------------");
		//		System.out.println("1: " + nesimoPrimo(1));
		//		System.out.println("------------------");
		//		System.out.println("2: " + nesimoPrimo(2));
		//		System.out.println("------------------");
		//		System.out.println("3: " + nesimoPrimo(3));
		//		System.out.println("------------------");
		//		System.out.println("4: " + nesimoPrimo(4));

		System.out.println("10: " + fatorar(10)); //
		System.out.println("-----------");
		System.out.println("20: " + fatorar(20));
		System.out.println("-----------");
		System.out.println("32: " + fatorar(32));
		System.out.println("-----------");
		System.out.println("70: " + fatorar(70));
		System.out.println("-----------");
		System.out.println("1024: " + fatorar(1024));

	}

	//1. Implemente um método que cheque se um número é primo.
	private static boolean ePrimo(int n){
		int cont = 0;
		for(int div = 1 ; div <= n ; div++){
			if(n % div == 0){
				cont++;
				if(cont > 2)
					return false;
			}

		}
		return (cont == 2);
	}

	private static int proximoPrimoApos(int n){
		n++;
		while(!ePrimo(n)){
			n++;
		}
		return n;
	}

	//2. Usando (1), implemente um método que retorna o i-ésimo primo dado o valor de i.
	private static int nesimoPrimo(int index){
		int n = 2;
		for(int i = 0 ; i < index ; i++){
			n = proximoPrimoApos(n);
		}
		return n;
	}

	/*
	 *	3. Usando (2), implemente um método que fatore um número em seus fatores primos.
	 *	Ex.: fatorar(20) => "2^2.5^1"
	 **/
	private static String fatorar(int n){

		String strOut = "";

		List<Integer> bases = new ArrayList<>();
		List<Integer> expoentes = new ArrayList<>();

		int indice = 0;
		int base = nesimoPrimo(indice);

		bases.add(base);
		expoentes.add(0);

		while(n > 1){
			if(n % base == 0){
				n /= base;

				expoentes.set(indice, expoentes.get(indice) + 1);
			}else{
				indice++;
				base = nesimoPrimo(indice);

				bases.add(base);
				expoentes.add(0);
			}
		}

		for(int i = 0 ; i < expoentes.size() ; i++){
			if(expoentes.get(i)>0){
				strOut += ""+bases.get(i)+"^"+expoentes.get(i);
				
				if(i < expoentes.size() - 1){
					strOut += ".";
				}
			}
		}

		return strOut.length() == 0 ? "1^1" : strOut;
	}

}
