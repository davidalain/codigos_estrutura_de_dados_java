package interfaceJava;

public class Pentagono extends Poligono implements PoligonoNomeavel{

	public Pentagono() {
		super(5);
	}

	@Override
	public String getNome() {
		return "Pentágono";
	}

}

