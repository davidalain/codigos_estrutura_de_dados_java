package herancaJava;

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

	public String getNome(){

		if(lados == 3){
			return "Triângulo";
		}else if(lados == 4){
			return "Quadrado";
		}else{		
			return "Erro";
		}

	}

}

