package questoesProvas.gerenciamentoGovernamental;

import java.util.List;
import java.util.Objects;

/**
 * @author DavidAlain
 *
 */
public final class Municipio {

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
	 * 		public class Municipio implements XXXXX
	 * 
	 * 	Não herdam de nenuma classe, ou seja, NÃO tem:
	 * 		public class Municipio extends XXXXX
	 * 
	 * 	São classes finais (nenhuma outra classe pode herdar delas), ou seja, são no formato:
	 * 		public final class Municipio
	 * 
	 * Então você NÃO precisaria implementar as classes Estado, Municipio e Funcionario.
	 * Seria só admitir que já existem e usá-las. Mas se fosse implementar elas ficariam assim:
	 */

	private int habitantes;
	private String nome;
	private List<Funcionario> funcionarios;

	/**
	 * Construtor que não recebe parâmetros
	 */
	public Municipio() {

	}

	/***
	 * gets e sets gerados automaticamente
	 */
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	/**
	 * Método hashCode implementado da maneira mais simples
	 */
	@Override
	public int hashCode() {
		return Objects.hash(habitantes, nome, funcionarios);
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
		Municipio other = (Municipio) obj;
		if (funcionarios == null) {
			if (other.funcionarios != null)
				return false;
		} else if (!funcionarios.equals(other.funcionarios))
			return false;
		if (habitantes != other.habitantes)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	/**
	 * Método toString gerado pelo eclipse
	 */
	@Override
	public String toString() {
		return "Municipio [habitantes=" + habitantes + ", nome=" + nome + ", funcionarios=" + funcionarios + "]";
	}




}
