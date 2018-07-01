package questoesProvas.provaCopa;

public class ResultadoSelecao {

	private Selecao selecao;
	private int pontuacao;
	private int jogos;
	private int vitorias;
	private int empates;
	private int derrotas;
	private int golsPro;
	private int golsContra;
	private int saldoGols;
	private double aproveitamento;

	public ResultadoSelecao() {
		super();
	}

	public Selecao getSelecao() {
		return selecao;
	}
	public void setSelecao(Selecao selecao) {
		this.selecao = selecao;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getJogos() {
		return jogos;
	}
	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getGolsPro() {
		return golsPro;
	}
	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}
	public int getGolsContra() {
		return golsContra;
	}
	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}
	public int getSaldoGols() {
		return saldoGols;
	}
	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}
	public double getAproveitamento() {
		return aproveitamento;
	}
	public void setAproveitamento(double aproveitamento) {
		this.aproveitamento = aproveitamento;
	}


	public static String toStringCabecalho() {
		return "Classificação" + "\t" + 
				"P" + "\t" + 
				"J" + "\t" + 
				"V" + "\t" +
				"E" + "\t" +
				"D" + "\t" +
				"GP" + "\t" +
				"GC" + "\t" +
				"SG" + "\t" +
				"%";
	}
	
	@Override
	public String toString() {
		return selecao.getNome() + "\t" + 
				pontuacao + "\t" + 
				jogos + "\t" + 
				vitorias + "\t" +
				empates + "\t" +
				derrotas + "\t" +
				golsPro + "\t" +
				golsContra + "\t" +
				saldoGols + "\t" +
				aproveitamento;
	}


}
