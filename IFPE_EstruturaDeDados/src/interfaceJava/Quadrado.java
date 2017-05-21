package interfaceJava;

public class Quadrado extends Poligono implements PoligonoNomeavel{

	public Quadrado(){
		super(4);
	}
	
	public String getNome(){
		return "Quadrado";
	}

}

