package algoritmosOrdenacao;

public class PaisMedalha implements Comparable<PaisMedalha>{

	private String nome;
	private int ouro;
	private int prata;
	private int bronze;
	
	public PaisMedalha(String nome, int ouro, int prata, int bronze) {
		super();
		this.nome = nome;
		this.ouro = ouro;
		this.prata = prata;
		this.bronze = bronze;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	public int getPrata() {
		return prata;
	}
	public void setPrata(int prata) {
		this.prata = prata;
	}
	public int getBronze() {
		return bronze;
	}
	public void setBronze(int bronze) {
		this.bronze = bronze;
	}
	
	@Override
	public String toString() {
		return nome + "\t\t" + ouro + "\t" + prata + "\t" + bronze + "\t" + (ouro+prata+bronze);  
	}

	@Override
	public int compareTo(PaisMedalha pm) {
		if(this.ouro > pm.ouro) return -1;
		if(this.ouro < pm.ouro) return 1;
		
		if(this.prata > pm.prata) return -1;
		if(this.prata < pm.prata) return 1;
		
		if(this.bronze > pm.bronze) return -1;
		if(this.bronze < pm.bronze) return 1;
		
		return 0;
	}
	
	
	
}
