package bufferCircular;

public class BufferCircular<E> {

	private int indiceEntrada;
	private int indiceSaida;
	private E[] dados;

	public static void main(String[] args) {

		BufferCircular<String> bufferCircular = new BufferCircular<>(5);
		bufferCircular.inserir("A");
		bufferCircular.inserir("B");
		bufferCircular.inserir("C");
		
		System.out.println(bufferCircular);

		System.out.println("Removeu: " + bufferCircular.remover());
		System.out.println("Removeu: " + bufferCircular.remover());
		
		System.out.println(bufferCircular);

		bufferCircular.inserir("D");
		bufferCircular.inserir("E");
		bufferCircular.inserir("F");
		bufferCircular.inserir("G");
		bufferCircular.inserir("H");
		bufferCircular.inserir("I");

		System.out.println("Removeu: " + bufferCircular.remover());
		System.out.println("Removeu: " + bufferCircular.remover());
		System.out.println("Removeu: " + bufferCircular.remover());
		System.out.println("Removeu: " + bufferCircular.remover());
		
		System.out.println(bufferCircular);
	}

	public BufferCircular(int tamanho){
		this.dados = (E[]) new Object[tamanho + 1];
		this.indiceEntrada = 0;
		this.indiceSaida = 0;
	}

	public void inserir(E novoDado){

		if(((indiceEntrada + 1) % dados.length) == indiceSaida){
			System.out.println("Erro ao tentar inserir '"+ novoDado +"', buffer cheio!");
			return; //Não tem mais espaço para inserir dados. Buffer cheio.
		}

		dados[indiceEntrada] = novoDado;
		indiceEntrada = (indiceEntrada + 1) % dados.length;
	}

	public E remover(){

		if(indiceEntrada == indiceSaida)
			return null;

		E retorno = dados[indiceSaida];
		indiceSaida = (indiceSaida + 1) % dados.length;
		return retorno;
	}
	
	public String toString(){
		
		String str = "";
		
		for(int i = indiceSaida ; i != indiceEntrada ; i = (i + 1) % dados.length){
			str += dados[i];
		}
		
		return str;
	}

}
