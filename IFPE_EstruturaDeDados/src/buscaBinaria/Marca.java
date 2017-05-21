package buscaBinaria;

public class Marca implements Comparable<Marca>{

	private String nome;
	
	public Marca(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Marca o2) {
		return nome.compareTo(o2.nome);
	}
	
}
