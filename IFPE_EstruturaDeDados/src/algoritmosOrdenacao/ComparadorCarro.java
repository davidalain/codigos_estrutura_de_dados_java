package algoritmosOrdenacao;

import java.util.Comparator;

public class ComparadorCarro implements Comparator<Carro>{

	int metodo; //0 => comprimento, 1 => portas, 2 => chassi 

	public ComparadorCarro(int metodo) {
		this.metodo = metodo;
	}

	@Override
	public int compare(Carro o1, Carro o2) {

		int comp = 0;

		switch(metodo){
		case 0: comp = (int)((o1.getComprimento() - o2.getComprimento())*100000.0);	break;
		case 1: comp = o1.getnPortas() - o2.getnPortas();			break;
		case 2: comp = o1.getChassi().compareTo(o2.getChassi());	break;
		}

		return comp;
	}

}
