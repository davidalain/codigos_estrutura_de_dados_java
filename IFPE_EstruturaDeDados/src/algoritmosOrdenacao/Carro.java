package algoritmosOrdenacao;

public class Carro implements Comparable<Carro>{

	double comprimento;
	int nPortas;
	String chassi;
	Integer novo;

	@Override
	public int compareTo(Carro c) {
//		return this.chassi.compareTo(c.chassi);
		return this.novo.compareTo(c.novo);
	}
	
//	/**
//	 * Método compareTo comparando dois carros respectivamente por: comprimento, nPortas e chassi. 
//	 */
//	@Override
//	public int compareTo(Carro c) {
//		if(this.comprimento > c.comprimento) return 1;
//		if(this.comprimento < c.comprimento) return -1;
//		
//		int comp = this.nPortas - c.nPortas;
//		if(comp != 0)
//			return comp;
//
//		return this.chassi.compareTo(c.chassi);
//	}
	
	public Carro(int nPortas, String chassi) {
		super();
		this.nPortas = nPortas;
		this.chassi = chassi;
	}
	
	public Carro(int comprimento, int nPortas, String chassi) {
		super();
		this.comprimento = comprimento;
		this.nPortas = nPortas;
		this.chassi = chassi;
	}
	
	
	/** 
	 * Método equals comparando dois carros apenas pelo chassi.
	 */
	@Override
	public boolean equals(Object obj) {

		//Primeiro verifica se obj é do tipo Carro. Se não for, já retorna false.
		if(!(obj instanceof Carro))
			return false;
		
		//Faz o cast de obj para o tipo Carro para poder acessar os attributos.
		Carro c = (Carro) obj;
		
		//Compara os dois carro utilizando apenas o chassi.
		return this.chassi.equals(c.chassi);
	}
	
	

	@Override
	public String toString() {
		return "{comp="+comprimento + ", chassi=" + chassi+", portas="+nPortas+"}";
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

}
