package algoritmosOrdenacao;

import java.security.InvalidParameterException;
import java.util.Comparator;

public class ComparadorMultiplo implements Comparator<Produto>{

	public static final String NOME = "NOME";
	public static final String CODIGOBARRAS = "CODIGOBARRAS";
	public static final String PRECO = "PRECO";
	
	private String nomeAtributo;
	private boolean crescente;
	
	public ComparadorMultiplo(String nomeAtributo, boolean crescente) {
		this.nomeAtributo = nomeAtributo;
		this.crescente = crescente;
		
		switch (nomeAtributo) {
		case NOME:
		case CODIGOBARRAS:
		case PRECO:
			break;
		default:
			throw new InvalidParameterException("Nome do atributo ("+nomeAtributo+") é inválido.");
		}
		
	}

	private int compareNome(Produto o1, Produto o2){
		return o1.getNome().compareTo(o2.getNome());
	}

	private int compareCodigoBarras(Produto o1, Produto o2){
		return o1.getCodigoBarras().compareTo(o2.getCodigoBarras());
	}

	private int comparePreco(Produto o1, Produto o2){
		if(o1.getPreco() > o2.getPreco()) return 1;
		if(o1.getPreco() < o2.getPreco()) return -1;
		return 0;
	}

	@Override
	public int compare(Produto o1, Produto o2) {

		int n = 0;
		
		switch (nomeAtributo) {
		case NOME:
			n = compareNome(o1, o2);
			break;
		case CODIGOBARRAS:
			n = compareCodigoBarras(o1, o2);
			break;
		case PRECO:
			n = comparePreco(o1, o2);
			break;
		default:
			throw new InvalidParameterException("Nome do atributo ("+nomeAtributo+") é inválido.");
		}
		
		return crescente ? n : -n;
	}


}
