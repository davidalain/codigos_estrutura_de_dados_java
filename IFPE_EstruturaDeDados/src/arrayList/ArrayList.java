package arrayList;


public class ArrayList {

	private Comparable[] conteudo;
	private int tamanho;

	public static void main(String[] args) {

		ArrayList lista = new ArrayList(20);
		lista.imprimirLista();

		int valor;
		for(int i = 0 ; i < 20 ; i++){

			valor = (int)(Math.random() * 100.0); //Gera um valor aleat�rio entre 0 e 100, apenas para colocar valores 'diferentes' no ArrayList
			lista.inserirOrdenado(valor); //Insere o valor no arrayList
			System.out.println("Inseriu " + valor); //Mostra o valor inserido
			lista.imprimirLista(); //Imprime a lista
			lista.validaOrdenacao(); //Valida a ordena��o

		}

	}

	public ArrayList(int quantidade){
		conteudo = new Comparable[quantidade];
		tamanho = 0;
	}

	public Comparable pegar(int indice){
		if(indice >= tamanho){
			System.err.println("�ndice inv�lido!");
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
				System.err.println("Erro na ordena��o: Valor no �ndice "+ i +" � maior que no �ndice "+ (i+1));
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

		// Se n�o tem valores salvos (ArrayList vazio) ent�o utiliza-se o �ndice 0 (zero).
		if(tamanho == 0){
			conteudo[0] = dado;
			tamanho++;
			return;
		}

		int esquerda = 0;
		int direita = tamanho - 1;
		int meio = (esquerda + direita) / 2;

		while(esquerda < direita){ // Se 'meio' for igual a 'esquerda' ou 'meio' for igual a 'direita' ent�o a busca deve ser parada

			if(dado.compareTo(conteudo[meio]) <= 0){// O valor de 'dado' � menor (ou igual) que o valor contido no �ndice 'meio', ent�o a posi��o sendo procurada est� na parte � esquerda.
				direita = meio - 1; // Utiliza 'meio - 1' para otimizar a busca, j� que o valor contido no �ndice 'meio' j� foi testado.

			}else{// O valor de 'dado' � maior que o valor contido no �ndice 'meio', ent�o a posi��o sendo procurada est� na parte � direita.				
				esquerda = meio + 1; // Utiliza 'meio - 1' para otimizar a busca, j� que o valor contido no �ndice 'meio' j� foi testado.
			}

			meio = (esquerda + direita) / 2; // Atualiza o valor de 'meio'
		}

		/**
		 * No caso da inser��o de um novo dado, deve-se checar o ind�ce alvo ('meio') para saber se o dado � maior que o valor contido na posi��o de �ndice 'meio'.
		 * Caso seja maior, o dado deve ser inserido na posi��o posterior.
		 */
		if(dado.compareTo(conteudo[meio]) > 0){
			meio++;
		}

		// Copia todos os elementos para a direita, deixando vaga a posi��o do dado a ser inserido 
		for(int i = tamanho - 1 ; i >= meio ; i--){
			conteudo[i + 1] = conteudo[i];
		}

		// Insere o dado no �ndice correto e incrementa o tamanho
		conteudo[meio] = dado;
		tamanho++;
	}

}
