package interfaceJava;

public class Quadrado extends Poligono implements NomePoligono{

	public Quadrado(){
		super(4);
	}
	
	public String getNome(){
		return "Quadrado";
	}

}

