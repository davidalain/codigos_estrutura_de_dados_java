package questoesProvas.provaCopa;

public class ResultadoJogo {

	private TuplaSelecaoGols tuplaSelecaoGols1;
	private TuplaSelecaoGols tuplaSelecaoGols2;
	
	public ResultadoJogo(Selecao selecao1, int golsSelecao1, Selecao selecao2, int golsSelecao2) {
		super();
		this.tuplaSelecaoGols1 = new TuplaSelecaoGols(selecao1, golsSelecao1);
		this.tuplaSelecaoGols2 = new TuplaSelecaoGols(selecao2, golsSelecao2);
	}

	public TuplaSelecaoGols getTuplaSelecaoGols1() {
		return tuplaSelecaoGols1;
	}
	public void setTuplaSelecaoGols1(TuplaSelecaoGols golsSelecao1) {
		this.tuplaSelecaoGols1 = golsSelecao1;
	}
	public TuplaSelecaoGols getTuplaSelecaoGols2() {
		return tuplaSelecaoGols2;
	}
	public void setTuplaSelecaoGols2(TuplaSelecaoGols golsSelecao2) {
		this.tuplaSelecaoGols2 = golsSelecao2;
	}

	@Override
	public boolean equals(Object obj) {
		
		//Verifica se é a mesma instância
		if(this == obj)
			return true;
		//Verifica se a instância é de outro tipo
		if(!(obj instanceof ResultadoJogo))
			return false;
		
		final ResultadoJogo outro = (ResultadoJogo) obj;
		
		//Verifica se ambas as selecões são as mesmas
		if(	(this.tuplaSelecaoGols1.equals(outro.tuplaSelecaoGols1) && this.tuplaSelecaoGols2.equals(outro.tuplaSelecaoGols2)) ||
			(this.tuplaSelecaoGols1.equals(outro.tuplaSelecaoGols2) && this.tuplaSelecaoGols2.equals(outro.tuplaSelecaoGols1))	)
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return tuplaSelecaoGols1.getSelecao() + " " + tuplaSelecaoGols1.getGols() + " X " + tuplaSelecaoGols2.getGols() + " " + tuplaSelecaoGols2.getSelecao();
	}
	
	
	
	
}
