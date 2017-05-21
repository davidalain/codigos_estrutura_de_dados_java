package interfaceJava;

public abstract class Poligono {

	protected int lados;

	public Poligono(int lados){
		this.lados = lados;
	}
	
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}

}

