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
	 * @param conteudo	Conte�do a ser inserido
	 */
	public void insert(int conteudo){

		Node novo = new Node(conteudo, null);	//Crio o novo n� com o conte�do
		
		if(this.ultimo == null){
			this.primeiro = novo;
			this.ultimo = novo;
		}else{
			this.ultimo.setProximo(novo); 			//Adiciono o novo n� na lista (o pr�ximo do �ltimo)
			this.ultimo = novo;						//Atualizo quem � o �ltimo n�
		}

		
	}

	/**
	 * Remove um elemento dado o �ndice do n�
	 * 
	 * @param indice	�ndice do n�
	 */
	public void remove(int indice){

		Node anterior = null;			//Inicia o anterior como null, j� que n�o h� n� antes do primeiro
		Node atual = this.primeiro;		//Inicia o atual como o primeiro para conseguir percorrer toda a lista
		
		if(indice < 0)	//N�o existe �ndice negativo
			return;

		for(int i = 0 ;; i++){ //Executa at� chegar numa condi��o de parada

			if(atual == null){
				//Se o n� atual for nulo significa que est� apontado para depois do �ltimo n� e
				//n�o h� mais n�s depois do �ltimo

				break; //Sai do for
			}

			if(i == indice){ //Encontrou o �ndice que estava procurando?
				//Sim!! Agora que achou, vai remover o conte�do e links do n� e remover o n� da lista

				if(anterior != null){
					anterior.setProximo(atual.getProximo());	//Atualiza o pr�ximo do n� anterior, apontando-o para o pr�ximo do atual
				}

				if(atual == this.primeiro){ 	//Compara��o com == � intencional. Neste caso, estou querendo saber se � a mesma refer�ncia e n�o se o conte�do � igual.
					//							  Poderia ser utilizada compara��o com o m�todo equals, checando o conte�do, mas s� iria funcionar se o m�todo equals fosse sobre-escrito na classe Node.

					this.primeiro = atual.getProximo();	//Se o n� a ser removido � o primeiro da lista, ent�o o pr�ximo dele ir� se tornar o primeiro
				}

				if(atual == this.ultimo){ 		//Compara��o com == � intencional. Neste caso, estou querendo saber se � a mesma refer�ncia e n�o se o conte�do � igual.
					//							  Poderia ser utilizada compara��o com o m�todo equals, checando o conte�do, mas s� iria funcionar se o m�todo equals fosse sobre-escrito na classe Node.

					this.ultimo = anterior;		//Se o n� a ser removido � o �ltimo, ent�o o �ltimo se tornar� o anterior
				}

				atual.setConteudo(0);		//Modifico o conte�do do n� a ser removido (na inten��o de apagar o conte�do)
				atual.setProximo(null);		//Modifico o ponteiro para o pr�ximo para remover o link existente
				atual = null;

				break; //Sai do for
			}

			//N�o chegou no �ndice procurado, atualiza o contador e os ponteiros
			anterior = atual;				//Atualiza o n� anterior apontando para o atual
			atual = atual.getProximo();		//Atualiza o n� atual apontando para o pr�ximo
		}

	}

	/**
	 * Retorna o conte�do do n� dado o �ndice
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
				System.out.println("�ndice: " + i + ", Conte�do: " + conteudo);
			}else{
				System.out.println();
				break;
			}	
		}
		
	}

}
