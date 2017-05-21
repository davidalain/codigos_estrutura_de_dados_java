package ordenacao;

public class Carro implements Comparable<Carro>{

	private String modelo;
	private int nPortas;
	private int potencia;
	
	public Carro(String modelo, int nPortas, int potencia) {
		super();
		this.modelo = modelo;
		this.nPortas = nPortas;
		this.potencia = potencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getnPortas() {
		return nPortas;
	}
	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	@Override
	public int compareTo(Carro carro) {
		int m = this.modelo.compareTo(carro.modelo);
		
		if(m != 0)
			return m;
		
		if(this.nPortas > carro.nPortas) return 1;
		if(this.nPortas < carro.nPortas) return -1;
		
		if(this.potencia > carro.potencia) return 1;
		if(this.potencia < carro.potencia) return -1;
		
		return 0;
	}
	
	@Override
	public String toString() {
		return "{" + this.modelo + ", " +this.nPortas + ", " + this.potencia + "}";
	}
	
	
	
}
