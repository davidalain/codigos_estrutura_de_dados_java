package equals;


public class Casa {

	int numero;
	
	public Casa(int numero){
		this.numero = numero;
	}
	
	public boolean equals(Object o){
		
		if(!(o instanceof Casa))
			return false;
		
		return (this.numero == ((Casa) o).numero);
	}
	
}
