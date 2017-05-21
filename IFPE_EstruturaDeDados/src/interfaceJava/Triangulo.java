package interfaceJava;

public class Triangulo extends Poligono implements NomePoligono{
	
	public Triangulo(){
		super(3);
	}
	
	public String getNome(){
		return "Triângulo";
	}
	

}


