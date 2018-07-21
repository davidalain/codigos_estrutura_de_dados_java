package questoesProvas.gerenciamentoGovernamental;

import java.util.Objects;

public final class Funcionario {

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
	 * 		public class Funcionario implements XXXXX
	 * 
	 * 	N�o herdam de nenuma classe, ou seja, N�O tem:
	 * 		public class Funcionario extends XXXXX
	 * 
	 * 	S�o classes finais (nenhuma outra classe pode herdar delas), ou seja, s�o no formato:
	 * 		public final class Funcionario
	 * 
	 * Ent�o voc� N�O precisaria implementar as classes Estado, Municipio e Funcionario.
	 * Seria s� admitir que j� existem e us�-las. Mas se fosse implementar elas ficariam assim:
	 */

	private String nome;
	private double salario;
	private int idade;

	/**
	 * Construtor que n�o recebe par�metros
	 */
	public Funcionario() {

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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * M�todo hashCode implementado da maneira mais simples
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nome, salario, idade);
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
		Funcionario other = (Funcionario) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	/**
	 * M�todo toString gerado pelo eclipse
	 */
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", idade=" + idade + "]";
	}


}
