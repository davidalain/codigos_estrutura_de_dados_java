package algoritmosOrdenacao;

public class Carro3{

	int comprimento;
	int nPortas;
	String chassi;

	public boolean equals(Object obj) {
		if(!(obj instanceof Carro3))
			return false;
		
		Carro3 carro = (Carro3) obj;
		return (this.chassi.equals(carro.chassi));
	};
}
