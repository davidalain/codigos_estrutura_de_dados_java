package questoesProvas.provaCopa;

import java.util.ArrayList;
import java.util.List;

public class ClassificacaoGrupo {
	
	private List<ResultadoJogo> resultadosJogos;

	public ClassificacaoGrupo() {
		this.resultadosJogos = new ArrayList<>();
	}

	public List<ResultadoJogo> getResultadosJogos() {
		return resultadosJogos;
	}

	public void setResultadosJogos(List<ResultadoJogo> resultadosJogos) {
		this.resultadosJogos = resultadosJogos;
	}
	

}
