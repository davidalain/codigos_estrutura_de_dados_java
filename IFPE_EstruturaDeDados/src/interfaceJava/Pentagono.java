package interfaceJava;

public class Pentagono extends Poligono implements IPoligono{

	public Pentagono() {
		super(5);
	}

	@Override
	public String getNome() {
		return "Pentágono";
	}

//	@Override
//	public String nomeProximoPoligono() {
//		return "Hexágono";
//	}
	

}
