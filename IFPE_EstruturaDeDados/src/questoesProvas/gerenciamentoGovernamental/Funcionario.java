package questoesProvas.gerenciamentoGovernamental;

import java.util.Objects;

public final class Funcionario {

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
	 * 		public class Funcionario implements XXXXX
	 * 
	 * 	Não herdam de nenuma classe, ou seja, NÃO tem:
	 * 		public class Funcionario extends XXXXX
	 * 
	 * 	São classes finais (nenhuma outra classe pode herdar delas), ou seja, são no formato:
	 * 		public final class Funcionario
	 * 
	 * Então você NÃO precisaria implementar as classes Estado, Municipio e Funcionario.
	 * Seria só admitir que já existem e usá-las. Mas se fosse implementar elas ficariam assim:
	 */

	private String nome;
	private double salario;
	private int idade;

	/**
	 * Construtor que não recebe parâmetros
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
	 * Método hashCode implementado da maneira mais simples
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nome, salario, idade);
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
	 * Método toString gerado pelo eclipse
	 */
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", idade=" + idade + "]";
	}


}
