package interfaceJava;

public class Quadrado extends Poligono implements IPoligono{

	public Quadrado(){
		super(4);
	}
	
	public String getNome(){
		return "Quadrado";
	}

//	@Override
//	public String nomeProximoPoligono() {
//		// TODO Auto-generated method stub
//		return "Pentágono";
//	}
	
}
