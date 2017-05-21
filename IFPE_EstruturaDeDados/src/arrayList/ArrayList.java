package arrayList;


public class ArrayList {

	private Comparable[] conteudo;
	private int tamanho;

	public static void main(String[] args) {

		ArrayList lista = new ArrayList(20);
		lista.imprimirLista();

		int valor;
		for(int i = 0 ; i < 20 ; i++){

			valor = (int)(Math.random() * 100.0); //Gera um valor aleatório entre 0 e 100, apenas para colocar valores 'diferentes' no ArrayList
			lista.inserirOrdenado(valor); //Insere o valor no arrayList
			System.out.println("Inseriu " + valor); //Mostra o valor inserido
			lista.imprimirLista(); //Imprime a lista
			lista.validaOrdenacao(); //Valida a ordenação

		}

	}

	public ArrayList(int quantidade){
		conteudo = new Comparable[quantidade];
		tamanho = 0;
	}

	public Comparable pegar(int indice){
		if(indice >= tamanho){
			System.err.println("Índice inválido!");
			return null;
		}

		return conteudo[indice];
	}

	public void imprimirLista(){
		System.out.print("[");
		for(int i = 0 ; i < tamanho ; i++){
			System.out.print(conteudo[i]);
			if(i < tamanho - 1){
				System.out.print(", ");
			}
		}
		System.out.println("]\r\n");
	}

	public boolean validaOrdenacao(){
		
		boolean ordenado = true;

		for(int i = 0 ; i < tamanho - 1 ; i++){
			if(conteudo[i].compareTo(conteudo[i + 1]) > 0){
				ordenado = false;
				System.err.println("Erro na ordenação: Valor no índice "+ i +" é maior que no índice "+ (i+1));
			}
		}
		
		return ordenado;
	}

	public int tamanho(){
		return tamanho;
	}

	public void inserirOrdenado(Comparable dado){

		if(tamanho >= conteudo.length){
			System.err.println("Lista cheia!");
			return;
		}

		// Se não tem valores salvos (ArrayList vazio) então utiliza-se o índice 0 (zero).
		if(tamanho == 0){
			conteudo[0] = dado;
			tamanho++;
			return;
		}

		int esquerda = 0;
		int direita = tamanho - 1;
		int meio = (esquerda + direita) / 2;

		while(esquerda < direita){ // Se 'meio' for igual a 'esquerda' ou 'meio' for igual a 'direita' então a busca deve ser parada

			if(dado.compareTo(conteudo[meio]) <= 0){// O valor de 'dado' é menor (ou igual) que o valor contido no índice 'meio', então a posição sendo procurada está na parte à esquerda.
				direita = meio - 1; // Utiliza 'meio - 1' para otimizar a busca, já que o valor contido no índice 'meio' já foi testado.

			}else{// O valor de 'dado' é maior que o valor contido no índice 'meio', então a posição sendo procurada está na parte à direita.				
				esquerda = meio + 1; // Utiliza 'meio - 1' para otimizar a busca, já que o valor contido no índice 'meio' já foi testado.
			}

			meio = (esquerda + direita) / 2; // Atualiza o valor de 'meio'
		}

		/**
		 * No caso da inserção de um novo dado, deve-se checar o indíce alvo ('meio') para saber se o dado é maior que o valor contido na posição de índice 'meio'.
		 * Caso seja maior, o dado deve ser inserido na posição posterior.
		 */
		if(dado.compareTo(conteudo[meio]) > 0){
			meio++;
		}

		// Copia todos os elementos para a direita, deixando vaga a posição do dado a ser inserido 
		for(int i = tamanho - 1 ; i >= meio ; i--){
			conteudo[i + 1] = conteudo[i];
		}

		// Insere o dado no índice correto e incrementa o tamanho
		conteudo[meio] = dado;
		tamanho++;
	}

}
