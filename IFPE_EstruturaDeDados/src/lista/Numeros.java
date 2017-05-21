package lista;

public class Numeros {
	
	int[] dados;
	
	public Numeros(int[] dados){
		this.dados = dados;
	}
	
	public boolean equals(Object o){

		if(!(o instanceof Numeros))
			return false;
		
		Numeros n = (Numeros) o;
		
		if(this.dados.length != n.dados.length)
			return false;
		
		for(int i = 0 ; i < this.dados.length ; i++){
			
			if(this.dados[i] != n.dados[i])
				return false;
		}
		
		return true;
		
	}

}
