package algoritmosOrdenacao;

import java.util.Comparator;

public class ComparadorPaisMedalha implements Comparator<PaisMedalha>{

	@Override
	public int compare(PaisMedalha o1, PaisMedalha o2) {
		if(o1.getOuro() > o2.getOuro()) return -1;
		if(o1.getOuro() < o2.getOuro()) return 1;
		
		if(o1.getPrata() > o2.getPrata()) return -1;
		if(o1.getPrata() < o2.getPrata()) return 1;
		
		if(o1.getBronze() > o2.getBronze()) return -1;
		if(o1.getBronze() < o2.getBronze()) return 1;
		
		return 0;
	}

	
	
}
