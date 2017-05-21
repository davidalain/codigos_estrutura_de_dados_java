package buscaBinaria;

public class Produto implements Comparable{

	private int id;
	private String nome;
	private double preco;
	private Marca marca;

	public Produto(Marca marca, int id, String nome, double preco) {
		super();
		this.marca = marca;
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString(){
		return "Produto = {id=" + id + ", nome=" + nome + ", preco=" + preco + "}";
	}

	/**
	 * Compara produtos pelo ID
	 */
	public int compareTo(Object o) {

		Produto p = (Produto) o;

		if(id > p.id) return 1;
		if(id < p.id) return -1;
		return 0; 
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}



}
