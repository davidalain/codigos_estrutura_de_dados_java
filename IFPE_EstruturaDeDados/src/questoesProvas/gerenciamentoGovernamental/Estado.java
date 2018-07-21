package questoesProvas.gerenciamentoGovernamental;

import java.util.Objects;

/**
 * @author DavidAlain
 * 
 */
public final class Estado {

	/**
	 * Na prova diz pra adimitir que j� existem as classes Estado e Munic�pio apenas com:
	 * 	os atributos especificados,
	 * 	m�todos gets e sets dos atributos, e
	 * 	o construtor que n�o recebe par�metros.
	 * 
	 * E j� possuem implementados os m�todos:
	 * 	equals,
	 * 	toString, e 	
	 * 	hashCode
	 * 
	 * 	N�o implementam nenhuma interface, ou seja, N�O tem:
	 * 		public class Estado implements XXXXX
	 * 
	 * 	N�o herdam de nenuma classe, ou seja, N�O tem:
	 * 		public class Estado extends XXXXX
	 * 
	 * 	S�o classes finais (nenhuma outra classe pode herdar delas), ou seja, s�o no formato:
	 * 		public final class Estado
	 * 
	 * 
	 * Ent�o voc� N�O precisaria implementar as classes Estado, Municipio e Funcionario.
	 * Seria s� admitir que j� existem e us�-las. Mas se fosse implementar elas ficariam assim:  
	 */

	private String nome;
	private String sigla;
	private Regiao regiao;

	/**
	 * Construtor que n�o recebe par�metros
	 */
	public Estado() {

	}

	/***
	 * gets e sets gerados automaticamente
	 */

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	/**
	 * M�todo hashCode implementado da maneira mais simples
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nome, sigla, regiao);
	}

	/**
	 * M�todo equals gerado pelo eclipse
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (regiao != other.regiao)
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}

	/**
	 * M�todo toString gerado pelo eclipse
	 */
	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", sigla=" + sigla + ", regiao=" + regiao + "]";
	}


}
