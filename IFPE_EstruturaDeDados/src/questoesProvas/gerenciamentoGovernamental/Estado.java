package questoesProvas.gerenciamentoGovernamental;

import java.util.Objects;

/**
 * @author DavidAlain
 * 
 */
public final class Estado {

	/**
	 * Na prova diz pra adimitir que já existem as classes Estado e Município apenas com:
	 * 	os atributos especificados,
	 * 	métodos gets e sets dos atributos, e
	 * 	o construtor que não recebe parâmetros.
	 * 
	 * E já possuem implementados os métodos:
	 * 	equals,
	 * 	toString, e 	
	 * 	hashCode
	 * 
	 * 	Não implementam nenhuma interface, ou seja, NÃO tem:
	 * 		public class Estado implements XXXXX
	 * 
	 * 	Não herdam de nenuma classe, ou seja, NÃO tem:
	 * 		public class Estado extends XXXXX
	 * 
	 * 	São classes finais (nenhuma outra classe pode herdar delas), ou seja, são no formato:
	 * 		public final class Estado
	 * 
	 * 
	 * Então você NÃO precisaria implementar as classes Estado, Municipio e Funcionario.
	 * Seria só admitir que já existem e usá-las. Mas se fosse implementar elas ficariam assim:  
	 */

	private String nome;
	private String sigla;
	private Regiao regiao;

	/**
	 * Construtor que não recebe parâmetros
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
	 * Método hashCode implementado da maneira mais simples
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nome, sigla, regiao);
	}

	/**
	 * Método equals gerado pelo eclipse
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
	 * Método toString gerado pelo eclipse
	 */
	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", sigla=" + sigla + ", regiao=" + regiao + "]";
	}


}
