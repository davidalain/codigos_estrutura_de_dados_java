package classeAbstrata;

public abstract class Poligono {

	protected int lados;

	public Poligono(int lados){
		this.lados = lados;
	}
	
	public abstract String getNome();
	
}
