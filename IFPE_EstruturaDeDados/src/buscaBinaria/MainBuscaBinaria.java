package buscaBinaria;

import java.util.Arrays;

public class MainBuscaBinaria {

	public static void main(String[] args) {
		
		Marca m = new Marca("friboi");
		int indice = 0;
		Produto[] produtos = new Produto[5];
		produtos[indice++] = new Produto(m, 1, "arroz", 2.50);
		produtos[indice++] = new Produto(m, 2, "feijão", 50.50);
		produtos[indice++] = new Produto(m, 3, "macarrão 1", 2.50);
		produtos[indice++] = new Produto(m, 4, "macarrão 2", 2.50);
		produtos[indice++] = new Produto(m, 5, "carne", 200.50);
		
		Arrays.sort(produtos, new ComparadorProdutoNome());
		
		Produto chave = new Produto(m, 1, "carne", 0);
		int indiceProduto = Arrays.binarySearch(produtos, chave, new ComparadorProdutoNome());
		if(indiceProduto >= 0){
			System.out.println(produtos[indiceProduto]);	
		}else{
			System.out.println("Não achou produto");
		}
		
		
	}
	
	public static void main2(String[] args) {
		
		//=============== Busca com array de inteiros ======================
		
		Integer[] array = {-5, -1, 0, 2, 22, 50};
		Integer chave = 2;
		
		BuscaBinariaImplementacao<Integer> bbInteger = new BuscaBinariaImplementacao<Integer>();
		
		System.out.println("BuscaBinaria.buscaIterativa: " + bbInteger.buscaIterativa(array, chave));
		System.out.println("BuscaBinaria.buscaRecursiva: " + bbInteger.buscaRecursiva(array, chave));
		System.out.println();
		
		//=============== Busca com array de objetos (Comparable) ==========
		
		Produto[] arrayProdutos = new Produto[6];
		arrayProdutos[0] = new Produto(0, "arroz", 2.56);
		arrayProdutos[1] = new Produto(1, "feijão", 3.10);
		arrayProdutos[2] = new Produto(2, "biscoito", 1.10);
		arrayProdutos[3] = new Produto(3, "celular", 799.99);
		arrayProdutos[4] = new Produto(4, "geladeira", 1499.90);
		arrayProdutos[5] = new Produto(5, "creme dental", 1.49);
		
		Produto produtoChave = new Produto(4, null, 0); //Busca o produto cujo ID é 4, já que o método compareTo() da classe Produto, compara os IDs.
		
		BuscaBinariaImplementacao<Produto> bbProduto = new BuscaBinariaImplementacao<Produto>();
		
		System.out.println("BuscaBinaria.buscaIterativa: " + bbProduto.buscaIterativa(arrayProdutos, produtoChave));
		System.out.println("BuscaBinaria.buscaRecursiva: " + bbProduto.buscaRecursiva(arrayProdutos, produtoChave));
		
	}
	
}
