package buscaBinaria;

import java.util.Arrays;

public class MainBuscaBinariaImplementacao {

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
	
}
