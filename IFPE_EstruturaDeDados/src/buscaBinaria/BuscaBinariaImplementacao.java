package buscaBinaria;

public class BuscaBinariaImplementacao<T extends Comparable<T>> {

	public T buscaIterativa(T[] array, T chave){

		int inicio = 0;
		int fim = array.length - 1;
		int meio = (fim + inicio) / 2;
		int comp;
		
		while(inicio < fim){
			
			comp = array[meio].compareTo(chave);
			if(comp < 0){
				inicio = meio + 1;

			}else if(comp > 0){
				fim = meio - 1;

			}else{
				break;
			}

			meio = (fim + inicio) / 2;
		}

		if(array[meio].compareTo(chave) == 0)
			return array[meio];
		else
			return null;

	}
	
	public T buscaRecursiva(T[] array, T chave){
		return buscaRecursiva(array, chave, 0, array.length - 1);
	}

	private T buscaRecursiva(T[] array, T chave, int inicio, int fim){

		int meio = (fim + inicio) / 2;
		int comp;

		if(inicio < fim){

			comp = array[meio].compareTo(chave);
			if(comp < 0){
				inicio = meio + 1;
				
				return buscaRecursiva(array, chave, inicio, fim);

			}else if(comp > 0){
				fim = meio - 1;
				
				return buscaRecursiva(array, chave, inicio, fim);

			}else{
				
				return array[meio];
			}
			
		}

		if(array[meio].compareTo(chave) == 0)
			return array[meio];
		else
			return null;
	}
	
	public static void main(String[] args) {
		
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
