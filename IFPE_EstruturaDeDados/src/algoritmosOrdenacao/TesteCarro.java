package algoritmosOrdenacao;

import java.util.Arrays;
import java.util.Comparator;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(3, "2101"); //1
		Carro c2 = new Carro(3, "1982"); //0
		Carro c3 = new Carro(4, "4752"); //2
		
		Carro[] array = {c1, c2, c3};
		System.out.println("Antes de ordenar:\t" + Arrays.toString(array));
		
		Comparator<Carro> comp = new ComparadorCarro(2);
		Arrays.sort(array, comp);
		System.out.println("Depois de ordenar:\t" + Arrays.toString(array));
		
		Carro chave = new Carro(3, "2101");
		
		int indice = Arrays.binarySearch(array, chave, comp);
		System.out.println(indice);
		if(indice > 0){
			Carro saida = array[indice];
			System.out.println(saida);	
		}
		
	}
	
}
