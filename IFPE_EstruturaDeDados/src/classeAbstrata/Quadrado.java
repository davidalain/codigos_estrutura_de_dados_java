package classeAbstrata;

public class Quadrado extends Poligono{
	
	public Quadrado(){
		super(4);
	}
	
	@Override
	public String getNome() {
		return "Quadrado";
	}

}
