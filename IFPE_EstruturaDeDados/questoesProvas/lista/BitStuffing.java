package lista;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BitStuffing {

	/**
	 * Implementação feita na prova por Héricles Vinicyus França Cordeiro em 2017.1
	 * @param a
	 * @return
	 */
	public static List<Integer> bitStuffing(List<Integer> a){

		List<Integer> resp = new LinkedList<>();

		int cont = 0;
		int aux = 0;

		for(int i : a){

			if(i != aux){
				cont = 1;
				aux = i;
				resp.add(i);
			}else{
				cont++;
				resp.add(i);
				
				if(cont == 5){
					if(aux == 1){
						resp.add(0);
					}else{
						resp.add(1);
					}
					
					cont = 0;
				}
			}

		}

		return resp;
	}
	
	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(new Integer[]{0,0,0,0,1,1,0,1,0,0,1,1,1,1,1,1,1,0});
		
		List<Integer> b = bitStuffing(a);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
