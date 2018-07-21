package questoesProvas.gerenciamentoGovernamental;

import java.util.List;
import java.util.Objects;

/**
 * @author DavidAlain
 *
 */
public final class Municipio {

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
	 * 		public class Municipio implements XXXXX
	 * 
	 * 	N�o herdam de nenuma classe, ou seja, N�O tem:
	 * 		public class Municipio extends XXXXX
	 * 
	 * 	S�o classes finais (nenhuma outra classe pode herdar delas), ou seja, s�o no formato:
	 * 		public final class Municipio
	 * 
	 * Ent�o voc� N�O precisaria implementar as classes Estado, Municipio e Funcionario.
	 * Seria s� admitir que j� existem e us�-las. Mas se fosse implementar elas ficariam assim:
	 */

	private int habitantes;
	private String nome;
	private List<Funcionario> funcionarios;

	/**
	 * Construtor que n�o recebe par�metros
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
	 * M�todo hashCode implementado da maneira mais simples
	 */
	@Override
	public int hashCode() {
		return Objects.hash(habitantes, nome, funcionarios);
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
	 * M�todo toString gerado pelo eclipse
	 */
	@Override
	public String toString() {
		return "Municipio [habitantes=" + habitantes + ", nome=" + nome + ", funcionarios=" + funcionarios + "]";
	}




}
