package questoesProvas.provaCopa;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassificacaoGeralCopa {

	private Map<Grupo, ClassificacaoGrupo> mapaGrupoClassificacaoGrupo;
	private Map<Selecao, Grupo> mapaSelecaoGrupo;
	private Map<Selecao, ResultadoSelecao> mapaSelecaoResultado = new HashMap<Selecao, ResultadoSelecao>();
	
	public int questaoA(Selecao selecao) {
		
		int pontos = 0;
		Grupo grupo = mapaSelecaoGrupo.get(selecao);
		ClassificacaoGrupo classificacaoGrupo = mapaGrupoClassificacaoGrupo.get(grupo);
		
		for(ResultadoJogo resultadoJogo : classificacaoGrupo.getResultadosJogos()) {
			
			//Se a selecao estiver em GolsSelecao1 verifica se GolsSelecao1 é maior que GolsSelecao2
			if(resultadoJogo.getTuplaSelecaoGols1().getSelecao().equals(selecao)) {
				
				int v = resultadoJogo.getTuplaSelecaoGols1().compareTo(resultadoJogo.getTuplaSelecaoGols2());
				if(v > 0) //v > 0, significa que a seleção1 venceu a seleção2
					pontos += 3;
				else if(v == 0) //empate
					pontos += 1;
				
			}
			//Se a selecao estiver em GolsSelecao2 verifica se GolsSelecao2 é maior que GolsSelecao1
			else if(resultadoJogo.getTuplaSelecaoGols2().getSelecao().equals(selecao)) {
				
				int v = resultadoJogo.getTuplaSelecaoGols2().compareTo(resultadoJogo.getTuplaSelecaoGols1());
				if(v > 0) //v > 0, significa que a seleção2 venceu a seleção1
					pontos += 3;
				else if(v == 0) //empate
					pontos += 1;
				
			}
			
		}
		
		return pontos;
	}
	
	public void questaoB(ResultadoJogo resultadoJogo) {
		
		TuplaSelecaoGols tuplaSelecaoGols1 = resultadoJogo.getTuplaSelecaoGols1();
		TuplaSelecaoGols tuplaSelecaoGols2 = resultadoJogo.getTuplaSelecaoGols2();
		
		Grupo grupoSelecao1 = mapaSelecaoGrupo.get(tuplaSelecaoGols1.getSelecao());
		Grupo grupoSelecao2 = mapaSelecaoGrupo.get(tuplaSelecaoGols2.getSelecao());
		if(!grupoSelecao1.equals(grupoSelecao2)) {
			throw new InvalidParameterException("ResultadoJogo inválido. Na fase de grupos duas seleções só se enfretam se forem do mesmo grupo");
		}
		
		ClassificacaoGrupo classificacaoGrupo = mapaGrupoClassificacaoGrupo.get(grupoSelecao1); //neste caso, tanto faz usar grupoSelecao1 ou grupoSelecao2 já que são o mesmo
		if(classificacaoGrupo.getResultadosJogos().contains(resultadoJogo)) {
			throw new InvalidParameterException("ResultadoJogo inválido. Já existe um ResultadoJogo com estas duas seleções: " + resultadoJogo);
		}
		
		//Adiciona o ResultadoJogo na lista de resultados daquele grupo
		classificacaoGrupo.getResultadosJogos().add(resultadoJogo);
	}
	
	
	public Selecao questaoC(Selecao selecaoA, Selecao selecaoB) {
		
		int pontosSelecaoA = questaoA(selecaoA);
		int pontosSelecaoB = questaoA(selecaoB);
		
		return (pontosSelecaoA > pontosSelecaoB ? selecaoA : selecaoB);
	}
	
	public void questaoD(Selecao selecao) {
		
		Grupo grupo = mapaSelecaoGrupo.get(selecao);
		ClassificacaoGrupo classificacaoGrupo = mapaGrupoClassificacaoGrupo.get(grupo);
		
		//Cadastra todas as seleções na lista de ResultadoSelecao
		for(Selecao s : grupo.getSelecoes()) {
			
			final ResultadoSelecao resultadoSelecao = new ResultadoSelecao();
			resultadoSelecao.setSelecao(s);
			mapaSelecaoResultado.put(s, resultadoSelecao);
		}
		
		//Itera por todos os ResultadoJogo do grupo para calcular os valores de ResultadoJogo
		for(ResultadoJogo resultadoJogo : classificacaoGrupo.getResultadosJogos()) {
			
			//Pega as seleções do ResultadoJogo
			Selecao s1 = resultadoJogo.getTuplaSelecaoGols1().getSelecao();
			Selecao s2 = resultadoJogo.getTuplaSelecaoGols2().getSelecao();

			//Pega as quantidade de gols do ResultadoJogo
			int golsSelecao1 = resultadoJogo.getTuplaSelecaoGols1().getGols();
			int golsSelecao2 = resultadoJogo.getTuplaSelecaoGols2().getGols();
			
			//Pega os ResultadoSelecao do mapa
			ResultadoSelecao resultadoSelecao1 = mapaSelecaoResultado.get(s1);
			ResultadoSelecao resultadoSelecao2 = mapaSelecaoResultado.get(s2);
			
			//Seleção1 vence Seleção2
			if(golsSelecao1 > golsSelecao2) {
				
				resultadoSelecao1.setPontuacao(resultadoSelecao1.getPontuacao() + 3); //aumenta a pontuaçao em 3 pra o vencedor
				
				resultadoSelecao1.setVitorias(resultadoSelecao1.getVitorias() + 1);
				resultadoSelecao2.setDerrotas(resultadoSelecao2.getDerrotas() + 1);
			}
			//Seleção2 vence Seleção1
			else if(golsSelecao1 < golsSelecao2) {

				resultadoSelecao2.setPontuacao(resultadoSelecao2.getPontuacao() + 3); //aumenta a pontuaçao em 3 pra o vencedor
				
				resultadoSelecao2.setVitorias(resultadoSelecao2.getVitorias() + 1);
				resultadoSelecao1.setDerrotas(resultadoSelecao1.getDerrotas() + 1);
				
			}
			//Empate
			else {
				
				resultadoSelecao1.setPontuacao(resultadoSelecao1.getPontuacao() + 1); //aumenta a pontuaçao em 1 pra ambas as seleções
				resultadoSelecao2.setPontuacao(resultadoSelecao2.getPontuacao() + 1); //aumenta a pontuaçao em 1 pra ambas as seleções
				
				resultadoSelecao1.setEmpates(resultadoSelecao1.getEmpates() + 1);
				resultadoSelecao2.setEmpates(resultadoSelecao2.getEmpates() + 1);
			}
			
			//Contabiliza a quantidade de gols feitos
			resultadoSelecao1.setGolsPro(resultadoSelecao1.getGolsPro() + golsSelecao1);
			resultadoSelecao2.setGolsPro(resultadoSelecao2.getGolsPro() + golsSelecao2);
			
			//Contabiliza a quantidade de gols sofridos
			resultadoSelecao1.setGolsContra(resultadoSelecao1.getGolsContra() + golsSelecao2);
			resultadoSelecao2.setGolsContra(resultadoSelecao2.getGolsContra() + golsSelecao1);
			
			//Contabiliza o saldo de gols
			resultadoSelecao1.setSaldoGols(resultadoSelecao1.getGolsPro() - resultadoSelecao1.getGolsContra());
			resultadoSelecao2.setSaldoGols(resultadoSelecao2.getGolsPro() - resultadoSelecao2.getGolsContra());
			
			//Contabiliza a quantidade de jogos de cada seleção
			resultadoSelecao1.setJogos(resultadoSelecao1.getJogos() + 1);
			resultadoSelecao1.setJogos(resultadoSelecao2.getJogos() + 1);
			
			//Contabiliza a quantidade de jogos de cada seleção
			resultadoSelecao1.setAproveitamento(resultadoSelecao1.getPontuacao() / (double)(3.0 * resultadoSelecao1.getJogos()));
			resultadoSelecao2.setAproveitamento(resultadoSelecao2.getPontuacao() / (double)(3.0 * resultadoSelecao2.getJogos()));
			
		}
		
		//Pega a lista de resultados para ordenar
		List<ResultadoSelecao> listaResultados = new ArrayList<>(mapaSelecaoResultado.values());
		Collections.sort(listaResultados, new Comparator<ResultadoSelecao>() {

			@Override
			public int compare(ResultadoSelecao r1, ResultadoSelecao r2) {
				
				//Ordena decrescente pela pontuação
				int v = (r1.getPontuacao() - r2.getPontuacao());
				if(v != 0)
					return -v; //Valor invertido para ordenar de maneira descrescente

				//Ordena decrescente pela quantidade de vitórias
				v = (r1.getVitorias() - r2.getVitorias());
				if(v != 0)
					return -v; //Valor invertido para ordenar de maneira descrescente
				
				//Ordena decrescente pelo saldo de gols
				v = (r1.getSaldoGols() - r2.getSaldoGols());
				if(v != 0)
					return -v; //Valor invertido para ordenar de maneira descrescente
				
				//Ordena decrescente pelos gols feitos
				v = (r1.getGolsPro() - r2.getGolsPro());
				if(v != 0)
					return -v; //Valor invertido para ordenar de maneira descrescente
				
				//Ordena de maneira crescente pelo nome
				return r1.getSelecao().getNome().compareTo(r2.getSelecao().getNome());
			}
			
		});
		
		int posicao = 1;
		System.out.println(ResultadoSelecao.toStringCabecalho());
		for(ResultadoSelecao rs : listaResultados){
			System.out.println((posicao++) + " " + rs.toString());
		}
		
	}
	
	
}
