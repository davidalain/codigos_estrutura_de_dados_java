package lista;

public class Node {
	
	private int conteudo;
	private Node proximo;
	
	public Node(int conteudo, Node proximo){
		this.conteudo = conteudo;
		this.proximo = proximo;
	}

	public int getConteudo() {
		return conteudo;
	}

	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	
	

}
