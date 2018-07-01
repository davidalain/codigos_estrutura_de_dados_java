package interfaceJava;


public class Main {

	/**
	 * Método principal
	 * 
	 * @param args	Não utilizado
	 */
	public static void main(String[] args) {

		IPoligono p = new Triangulo();
		System.out.println(p.getNome());

	}
}
