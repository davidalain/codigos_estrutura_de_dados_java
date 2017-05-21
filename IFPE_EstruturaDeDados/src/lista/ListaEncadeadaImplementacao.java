package lista;

public class ListaEncadeadaImplementacao {

	private Node primeiro;
	private Node ultimo;

	public ListaEncadeadaImplementacao(){
		this.primeiro = null;
		this.ultimo = null;
	}


	/**
	 * Insere um elemento na lista
	 * 
	 * @param conteudo	Conteúdo a ser inserido
	 */
	public void insert(int conteudo){

		Node novo = new Node(conteudo, null);	//Crio o novo nó com o conteúdo
		
		if(this.ultimo == null){
			this.primeiro = novo;
			this.ultimo = novo;
		}else{
			this.ultimo.setProximo(novo); 			//Adiciono o novo nó na lista (o próximo do último)
			this.ultimo = novo;						//Atualizo quem é o último nó
		}

		
	}

	/**
	 * Remove um elemento dado o índice do nó
	 * 
	 * @param indice	Índice do nó
	 */
	public void remove(int indice){

		Node anterior = null;			//Inicia o anterior como null, já que não há nó antes do primeiro
		Node atual = this.primeiro;		//Inicia o atual como o primeiro para conseguir percorrer toda a lista
		
		if(indice < 0)	//Não existe índice negativo
			return;

		for(int i = 0 ;; i++){ //Executa até chegar numa condição de parada

			if(atual == null){
				//Se o nó atual for nulo significa que está apontado para depois do último nó e
				//não há mais nós depois do último

				break; //Sai do for
			}

			if(i == indice){ //Encontrou o índice que estava procurando?
				//Sim!! Agora que achou, vai remover o conteúdo e links do nó e remover o nó da lista

				if(anterior != null){
					anterior.setProximo(atual.getProximo());	//Atualiza o próximo do nó anterior, apontando-o para o próximo do atual
				}

				if(atual == this.primeiro){ 	//Comparação com == é intencional. Neste caso, estou querendo saber se é a mesma referência e não se o conteúdo é igual.
					//							  Poderia ser utilizada comparação com o método equals, checando o conteúdo, mas só iria funcionar se o método equals fosse sobre-escrito na classe Node.

					this.primeiro = atual.getProximo();	//Se o nó a ser removido é o primeiro da lista, então o próximo dele irá se tornar o primeiro
				}

				if(atual == this.ultimo){ 		//Comparação com == é intencional. Neste caso, estou querendo saber se é a mesma referência e não se o conteúdo é igual.
					//							  Poderia ser utilizada comparação com o método equals, checando o conteúdo, mas só iria funcionar se o método equals fosse sobre-escrito na classe Node.

					this.ultimo = anterior;		//Se o nó a ser removido é o último, então o último se tornará o anterior
				}

				atual.setConteudo(0);		//Modifico o conteúdo do nó a ser removido (na intenção de apagar o conteúdo)
				atual.setProximo(null);		//Modifico o ponteiro para o próximo para remover o link existente
				atual = null;

				break; //Sai do for
			}

			//Não chegou no índice procurado, atualiza o contador e os ponteiros
			anterior = atual;				//Atualiza o nó anterior apontando para o atual
			atual = atual.getProximo();		//Atualiza o nó atual apontando para o próximo
		}

	}

	/**
	 * Retorna o conteúdo do nó dado o índice
	 * 
	 * @param indice
	 * @return
	 */
	public int get(int indice){

		Node atual = this.primeiro;
		
		for(int i = 0 ; ; i++){
			
			if(atual == null){
				return -1;
			}
			
			if(i == indice){
				return atual.getConteudo();
			}
			
			atual = atual.getProximo();
		}
		
	}
	
	/**
	 * Mostra todos os elementos das lista
	 * 
	 */
	public void mostrarTodos(){
		
		int conteudo;
		for(int i = 0 ; ; i++){
			conteudo = this.get(i);
			if(conteudo != -1){
				System.out.println("Índice: " + i + ", Conteúdo: " + conteudo);
			}else{
				System.out.println();
				break;
			}	
		}
		
	}

}
