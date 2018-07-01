package questoesProvas.provaCopa;

public class TuplaSelecaoGols implements Comparable<TuplaSelecaoGols>{
	
	private Selecao selecao;
	private int gols;
	
	public TuplaSelecaoGols(Selecao selecao, int gols) {
		super();
		this.selecao = selecao;
		this.gols = gols;
	}
	public Selecao getSelecao() {
		return selecao;
	}
	public void setSelecao(Selecao selecao) {
		this.selecao = selecao;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	
	@Override
	public int compareTo(TuplaSelecaoGols o) {
		return (this.gols - o.gols);
	}
	
	

}
