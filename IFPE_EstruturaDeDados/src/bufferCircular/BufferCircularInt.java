package bufferCircular;

public class BufferCircularInt {

	private int indiceEntrada;
	private int indiceSaida;
	private Object[] dados;

	public static void main(String[] args) {

		BufferCircularInt bufferCircular = new BufferCircularInt(5);
		bufferCircular.inserir("A");
		bufferCircular.inserir("B");
		bufferCircular.inserir("C");
		
		System.out.println(bufferCircular.remover());
		System.out.println(bufferCircular.remover());
		
		bufferCircular.inserir("D");
		bufferCircular.inserir("E");
		bufferCircular.inserir("F");
		bufferCircular.inserir("G");
		bufferCircular.inserir("H");
		bufferCircular.inserir("I");
		
		System.out.println(bufferCircular.remover());
		System.out.println(bufferCircular.remover());
		System.out.println(bufferCircular.remover());
		System.out.println(bufferCircular.remover());

	}

	public BufferCircularInt(int tamanho){
		this.dados = new Object[tamanho + 1];
		this.indiceEntrada = 0;
		this.indiceSaida = 0;
	}

	public void inserir(Object novoDado){

		if(((indiceEntrada + 1) % dados.length) == indiceSaida){
			System.out.println("Erro ao tentar inserir '"+ novoDado +"', buffer cheio!");
			return; //Não tem mais espaço para inserir dados. Buffer cheio.
		}

		dados[indiceEntrada] = novoDado;
		indiceEntrada = (indiceEntrada + 1) % dados.length;
	}

	public Object remover(){

		if(indiceEntrada == indiceSaida)
			return null;

		Object retorno = dados[indiceSaida];
		indiceSaida = (indiceSaida + 1) % dados.length;
		return retorno;

	}

}
