package buscaBinaria;

public class Produto implements Comparable<Produto>{

	private Marca marca;
	private int id;
	private String nome;
	private double preco;

	public Produto(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(Marca marca, int id, String nome, double preco) {
		super();
		this.marca = marca;
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
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

	@Override
	public int compareTo(Produto o) {

		if(this.id < o.id)
			return -1;

		if(this.id > o.id)
			return 1;

		return 0; 
	}


}
