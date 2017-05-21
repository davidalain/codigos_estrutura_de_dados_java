package interfaceJava;

public class Triangulo extends Poligono implements PoligonoNomeavel{
	
	public Triangulo(){
		super(3);
	}
	
	public String getNome(){
		return "Triângulo";
	}
	

}


