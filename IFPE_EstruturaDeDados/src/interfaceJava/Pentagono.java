package interfaceJava;

public class Pentagono extends Poligono implements NomePoligono{

	public Pentagono() {
		super(5);
	}

	@Override
	public String getNome() {
		return "Pentágono";
	}

}

